package cw.study.java8.defaultMethod;

import javax.sound.midi.Soundbank;

public interface Car {

    default public void sayHi(){
        System.out.println("a new world");
    }

    static void run(){
        System.out.println("wo pao le ");
    }

}
