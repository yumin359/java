package ch13.sec05;

public class Course {
    // 모든 사람이면 등록 가능
    public static void registerCourse1(Applicant<?> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course1 등록함");
    }

    // 학생만 등록 가능
    public static void registerCourse2(Applicant<? extends Student> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course2 등록함");
    }

    // 직장인 및 일반인만 등록 가능
    public static void registerCourse3(Applicant<? super Worker> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course3 등록함");
    }

    /*
    public static void registerCourse1(Applicant<?> applicant) {
        Object kind = applicant.getKind();
        kind.toString();
//        applicant.setKind(new Object());
    }

    public static void registerCourse2(Applicant<? extends Student> applicant) {
        // producer extends (pecs)
        Student kind = applicant.getKind();
    }

    public static void registerCourse3(Applicant<? super Worker> applicant) {
        // consumer super (pecs)
        applicant.setKind(new Worker());
    }

     */
}
