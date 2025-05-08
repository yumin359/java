package ch06.sec08.exam03;

public class Car {
    int gas;

    void setGas(int gas) {
        this.gas = gas; // 받을 걸 필드에 쓰겠따.
    }

    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("No gas");
            return false;
        }
        System.out.println("Yes gas");
        return true;
    }

    void run() {
        while (true) {
            if (gas > 0) {
                System.out.println("달립니다.(gas잔량:" + gas + ")");
                gas -= 1; // gas--;
            } else {
                System.out.println("멈춥니다.(gas잔량:" + gas + ")");
                return;
            }
        }
    }
}
