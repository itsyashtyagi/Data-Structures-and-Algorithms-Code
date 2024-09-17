package Basics;

public class FibonacciNumber {
    public static int fib(int num){
        if(num == 0){
            return 0;
        }
        int a= 0, b=1, c, i;
        for(i=2;i<=num;i++){
            c = a+b;
            a = b;
            b= c;
        }
        return b;
    }
    public static void main(String[] args) {
        int num = 9;
        System.out.println(fib(num));
    }
}
