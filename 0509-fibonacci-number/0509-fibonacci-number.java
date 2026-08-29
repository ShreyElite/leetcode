class Solution {
    public static int f=0;
     public static int fibo(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        f= fibo(n-1)+fibo(n-2);
     return f;

     }
    public int fib(int n) {
       return fibo(n);
    }
}