package com.chp.demo;

import lombok.*;
import lombok.experimental.Accessors;

@Data
@Builder
@NoArgsConstructor
@Accessors(chain=true)
public class Student implements ICaculate{

    private String name;

    @Builder
    public Student(String name){
        this.name=name;
    }

    public void caculate(Teacher teacher, Question question) {
       Answer answer=new Answer().builder()
               .studentName(this.getName())
               .result(question.getX()+question.getY())
               .build();
       teacher.collectAnswer(answer);
    }
}
