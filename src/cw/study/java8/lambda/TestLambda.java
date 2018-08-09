package cw.study.java8.lambda;

public class TestLambda {

    interface GreetingService{
        void sayMessage(String message);
//        void sayMessage1(String message);
    }

    public static void main(String[] args) {
        GreetingService greetingService = message-> System.out.println(message);
        greetingService.sayMessage("123");
    }

}
