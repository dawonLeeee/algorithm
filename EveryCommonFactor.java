package algorithm;


import static algorithm.Eclid.gcd;

public class EveryCommonFactor {

    static int gcdArray(int[] a){
        int length = a.length;
        int result = 0;

        for(int i = 1; i < length-1; i++){
            result = gcd(a[i], a[i+1]);
            result = gcd(a[a+2])
        }
    }
}