package scanner.ex;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 이릅을 입력하시오: ");
        String name = scanner.nextLine();

        System.out.print("당신의 나이를 입력하시오: ");
        int age = scanner.nextInt();

        System.out.print("당신의 이름은 " + name + "이고, 나이는 " + age + "살입니다.");
    }
}
