package com.chp.demo;


import lombok.*;
import lombok.experimental.Accessors;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
public class Answer {

    private String studentName;
    private Integer result;
}
