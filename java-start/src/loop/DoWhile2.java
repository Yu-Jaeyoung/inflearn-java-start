package loop;

public class DoWhile2 {
    // 최초 한번은 코드 블럭을 꼭 실행한다.
    public static void main(String[] args) {
        int i = 10;

        do {
            System.out.println("현재 숫자는: " + i);
            i++;
        } while (i < 3);
    }
}
