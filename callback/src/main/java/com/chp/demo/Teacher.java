package com.chp.demo;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Teacher implements Callback {

    private String name;
    private List<Student> studentList;

    public void askQuestion(List<Student> studentList,Question question){
        studentList.forEach(student -> {
           new Thread(()->{
               System.out.println(student.getName()+"开始回答问题...");
               student.caculate(this,question);
           }).start();
        });
    }

    @Override
    public void collectAnswer(Answer answer) {
        System.out.println(this.getName()+"老师收到"+answer.getStudentName()+"的答案是:"+answer.getResult());
    }
}
