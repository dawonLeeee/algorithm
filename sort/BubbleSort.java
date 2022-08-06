package algorithm.sort;

import java.util.Scanner;

public class BubbleSort {
    //a[idx1]과 a[idx2]의 값을 교환
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    //버블 정렬
    static void bubbleSort(int[] a, int n){
        int k = 0;
        while(k < n - 1){
            int last = n - 1;
            for(int i = n-1; i > 0; i--)
                for(int j = 0; j < i; j++) {
                    if (a[j] > a[j + 1]) {
                        swap(a, j, j + 1);
                        last = j;
                    }
                    k = last;
                }
        }
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
