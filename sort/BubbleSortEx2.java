package algorithm.sort;

import java.util.Scanner;

public class BubbleSortEx2 {
    //a[idx1]과 a[idx2]의 값을 교환
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    //버블 정렬
    static void bubbleSort(int[] a, int n){
        int ccnt = 0; // 비교 횟수
        int scnt = 0; // 교환 횟수

        for(int i = 0; i < n-1; i++){
            System.out.printf("패스%d : \n", i + 1);
            for(int j = n - 1; j > i; j--){
                for(int m = 0; m < n; m++)
                    System.out.printf("%3d %c ", a[m],
                            (m == j-1)? ' ' : (a[j-1] > a[j]) ? '+' : '-');
                    System.out.printf("%3d\n", a[n-1]);
                ccnt++;
                if(a[j] > a[j+1]) {
                    scnt++;
                    swap(a, j, j + 1);
                }
            }
            for(int m = 0; m < n; m++)
                System.out.printf("%3d ", a[m]);
            System.out.println();
        }
        System.out.println("비교를 " + ccnt + "회 했습니다.");
        System.out.println("교환을 " + scnt + "회 했습니다");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("버블 정렬(버전1)");
        System.out.print("요솟수 : ");
        int n = scanner.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("a[" + i + "]:");
            a[i] = scanner.nextInt();
        }

        bubbleSort(a,n);

        System.out.println("오름차순으로 정렬했습니다");
        for(int i = 0; i < n; i++){
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
