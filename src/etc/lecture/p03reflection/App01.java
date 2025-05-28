package etc.lecture.p03reflection;

public class App01 {
    public static void main(String[] args) throws ClassNotFoundException {

        String s1 = "java";

        // reflection : class 정보를 얻는 것
        Class<String> c1 = String.class;
        Class<?> c2 = Class.forName("java.lang.String");
        Class<? extends String> c3 = s1.getClass();

        // 다 클래스 라는 타입의 객체라서 같은 참조값을 가짐
        System.out.println(System.identityHashCode(c1));
        System.out.println(System.identityHashCode(c2));
        System.out.println(System.identityHashCode(c3));

        
    }
}
