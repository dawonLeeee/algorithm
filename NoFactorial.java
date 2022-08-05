package algorithm;

import java.util.Scanner;

public class NoFactorial {


    static int factorial(int n){
        int result = 1;
        if(n == 0)
            return 0;
        else {
            for (int i = n; i > 0; i--)
                result *= i;
            return result;
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int x = scanner.nextInt();

        System.out.printf("%d의 팩토리얼은 %d입니다.", x, factorial(x));


    }
}
