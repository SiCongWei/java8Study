package cw.study.java8.stream;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestStream {

    @Test
    public void test1(){
        List<String> strs = Arrays.asList("abc","123","","456");
        List<String> filtered = strs.stream().filter(str->!str.isEmpty()).collect(Collectors.toList());
        filtered.forEach(System.out::println);
    }

    @Test
    public void test2(){
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }

    @Test
    public void test3(){
        List<Integer> list = Arrays.asList(1,2,4,6,7,8,3,5,5);
        List<Integer> squareList = list.stream().map(i ->i*i).distinct().collect(Collectors.toList());
        System.out.println(squareList);
    }

    @Test
    public void test4(){
        List<String> strs = Arrays.asList("1","2","adf","","sd","");
        System.out.println(strs.stream().filter(str->str!=null).count());
        System.out.println(strs.stream().filter(str->!str.isEmpty()).count());
        System.out.println(strs.stream().filter(str->str.isEmpty()).count());
    }

    @Test
    public void test5(){
        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);
    }

    @Test
    public void test6(){
        List<String> strs = Arrays.asList("abc","","cde","fg","","lk","jkl");
        System.out.println(strs.parallelStream().filter(str->!str.isEmpty()).count());
    }

    @Test
    public void test7(){
        List<String> strs = Arrays.asList("123","","ad","ap","tk","support");
        List<String> nonEmptyStrs = strs.parallelStream().filter(str->!str.isEmpty()).collect(Collectors.toList());
        nonEmptyStrs.forEach(System.out::println);

        String strJoin =  strs.parallelStream().filter(str->!str.isEmpty()).collect(Collectors.joining(","));
        System.out.println(strJoin);
    }

    @Test
    public void test8(){
        List<Integer> nums = Arrays.asList(1,4,5,7,9,1,4,11,10,88);
        IntSummaryStatistics summaryStatistics = nums.stream().mapToInt(x->x).summaryStatistics();
        System.out.println("列表中最大的数："+summaryStatistics.getMax());
        System.out.println("列表中最小的数："+summaryStatistics.getMin());
        System.out.println("列表中所有数的和："+summaryStatistics.getSum());
        System.out.println("列表中数目："+summaryStatistics.getCount());
    }


}
