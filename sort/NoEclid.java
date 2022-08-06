package algorithm.sort;

import java.util.Scanner;

public class NoEclid {
    static int gcd(int x, int y) {
        int result;
        int reminder;
        do {
            result = x % y;
            x = y;
            y = result;

            if(result == 0)
                return x;

        } while (true);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("두 정수의 최대공약수를 구합니다");

        System.out.print("정수를 입력하세요: ");
        int x = scanner.nextInt();
        System.out.print("정수를 입력하세요: ");
        int y = scanner.nextInt();

        System.out.println("최대공약수는 " + gcd(x,y) + "입니다.");


    }
}
