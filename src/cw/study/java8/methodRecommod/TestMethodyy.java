package cw.study.java8.methodRecommod;

import java.util.ArrayList;
import java.util.List;

public class TestMethodyy {

    public static void main(String[] args) {

        List<String> names = new ArrayList<String>();
        names.add("google");
        names.add("baidu");
        names.add("sarfari");
        names.add("souhu");

        names.forEach(System.out::println);

    }

}
