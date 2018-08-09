package cw.study.java8.dateTime;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestLocalDateTime {

    @Test
    public void test1(){

        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("当前时间："+currentTime);

        LocalDate localDate = currentTime.toLocalDate();
        System.out.println("localDate:"+localDate);



    }

}
