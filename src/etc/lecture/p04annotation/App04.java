package etc.lecture.p04annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@MyAnnotation04 // X
public class App04 {
    @MyAnnotation04(name = "trump", age = 99)
    public void method() {

    }

    @MyAnnotation05(address = "seoul", age = 99)
    public void method2() {

    }

    @MyAnnotation05(age = 99)
    public void method3() {

    }

    @MyAnnotation06(name = {"trump", "donald"})
    public void method4() {

    }

    @MyAnnotation06(name = "trump")
    public void method5() {

    }

    // 다른 거랑 같이 쓸 때는 써줘야 함
    @MyAnnotation07(name = "trump", value = "hello")
    public void method6() {

    }

    @MyAnnotation07(value = "hello")
    public void method7() {

    }

    // value만 존재할 때 속성명 생략 가능
    @MyAnnotation07("hello")
    public void method8() {

    }
}

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation07 {
    String[] name() default "donald";

    String address() default "seoul";

    int age() default 0;

    String value() default "";
}

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation06 {
    String[] name();
}

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation05 {
    String address() default "busan";

    // default 값 있으면 위에 안 써도 됨
    int age();
}

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation04 {

    // element, attribute, 속성
    String name();

    int age();

}