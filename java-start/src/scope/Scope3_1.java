package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        // temp의 비효율적인 메모리 사용 -> 사용 범위는 if문 내부
        // 코드 복잡성 또한 증가
        int temp = 0;
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
