package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPrice = 0;

/*
        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = scanner.nextInt();

            if (option == 1) {
                scanner.nextLine(); // /n 해소 필요
                System.out.print("상품명을 입력하세요: ");
                String product = scanner.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = scanner.nextInt();

                System.out.print("구매 수량을 입략하세요: ");
                int quantity = scanner.nextInt();

                int sum = price * quantity;
                totalPrice += sum;

                System.out.println("상품명: " + product + "  가격: " + price + "  수량: " + quantity + "  합계: " + sum);
            } else if (option == 2) {
                System.out.println("총 비용: " + totalPrice);
                totalPrice = 0;
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
*/
        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> {
                    scanner.nextLine(); // 개행문자 처리
                    System.out.print("상품명을 입력하세요: ");
                    String product = scanner.nextLine();

                    System.out.print("상품의 가격을 입력하세요: ");
                    int price = scanner.nextInt();

                    System.out.print("구매 수량을 입력하세요: ");
                    int quantity = scanner.nextInt();

                    int sum = price * quantity;
                    totalPrice += sum;

                    System.out.println("상품명: " + product + "  가격: " + price + "  수량: " + quantity + "  합계: " + sum);
                }

                case 2 -> {
                    System.out.println("총 비용: " + totalPrice);
                    totalPrice = 0;
                }

                case 3 -> {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }

                default -> System.out.println("올바른 옵션을 선택해주세요.");
            }
        }

    }
}
