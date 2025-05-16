package ch13.sec05;

public class Applicant<T> {
    public T kind;

    public Applicant(T kind) {
        this.kind = kind;
    }

    /*
    public U getKindd() {
        return kindd;
    }

    public void setKindd(U kindd) {
        this.kindd = kindd;
    }

    private U kindd;

     */
}
