package algorithm.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10828 {
    public static Integer[] arr;
    public static int size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        arr = new Integer[T];
        while(T--> 0){
            st = new StringTokenizer(br.readLine(), " ");
            switch(st.nextToken()){
                case("push") : push(Integer.parseInt(st.nextToken())); break;
                case("pop") : sb.append(pop()).append("\n"); break;
                case("size") : sb.append(size()).append("\n"); break;
                case("empty") : sb.append(empty()).append("\n"); break;
                case("top") : sb.append(top()).append("\n"); break;

            }
        }
        System.out.println(sb);
    }

    public static void push(int num){
        arr[size++] = num;
    }
    public static int pop(){
        if(size==0) return -1;
        else {
            arr[size--] = null;
            return arr[size];
        }
    }
    public static int size(){
        return size;
    }
    public static int empty(){
        return size()==0 ? 1 : 0;
    }
    static int top() {
        if(size == 0)
            return -1;
        else
            return arr[size - 1];
    }
}
