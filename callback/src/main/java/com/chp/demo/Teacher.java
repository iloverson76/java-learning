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
            student.caculate(this,question);
        });
    }

    @Override
    public void collectAnswer(Answer answer) {
        new Thread(()->{
            System.out.println(this.getName()+"老师收到"+answer.getStudentName()+"的答案是:"+answer.getResult());
        }).start();
    }
}
