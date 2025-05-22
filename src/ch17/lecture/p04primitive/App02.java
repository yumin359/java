package ch17.lecture.p04primitive;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App02 {
    public static void main(String[] args) {
        // 기본타입 스트림(IntStream, LongStream, DoubleStream) -> 참조타입 스트림(Stream<T>)
        int[] arr1 = {1, 3, 5, 7, 9};
        IntStream s1 = Arrays.stream(arr1);
        Stream<Integer> s2 = s1.boxed(); // 기본타입스트림 -> 참조타입스트림 변경
//        s2.sum(); // X -> 참조타입으로 바껴서
        long r1 = s2.count(); // 얘는 원래 된대여
        System.out.println("r1 = " + r1);

        // 참조타입 스트림(Stream<T>) -> 기본타입 스트림(IntStream, LongStream, DoubleStream)
        // mapToInt, mapToDouble, mapToLong 등등 있다옹
        List<Integer> list1 = List.of(1, 3, 5, 7, 9);
        Stream<Integer> s3 = list1.stream();
        IntStream s4 = s3.mapToInt(Integer::intValue);// 참조타입스트림 -> 기본타입스트림
        long r2 = s4.count();
        int sum = s4.sum(); // 가능! -> 기본타입으로 바껴서
        System.out.println("r2 = " + r2);


    }
}
