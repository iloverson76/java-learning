package com.chp.demo;

import lombok.*;
import lombok.experimental.Accessors;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
public class Question {

    private int x;
    private int y;
    private String calulate;
}
