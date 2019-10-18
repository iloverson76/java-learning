package com.chp.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    //https://blog.csdn.net/qq_36344771/article/details/81130747 -- 数据分离的问题

//    https://www.cnblogs.com/prayjourney/p/9667835.html

//    https://www.cnblogs.com/xll1025/p/10665282.html  -- 异步回调的实现

    public static void main(String[] args) {

        List<Student> students=new ArrayList<>();
        students.add(Student.builder().name("余乐天").build());
        students.add(Student.builder().name("Apple").build());

        Teacher.builder().name("毛小慧").build().askQuestion(students,
                new Question().builder().x(1).y(2).build());
    }

}
