class Solution {
    public long rev(int n,long x){
        if(n==0) return x;
        x+=n%10;
        x*=10;
        return rev(n/10,x);
        

    }
    public int reverse(int x) {
        long n = 0;

        long p= rev(x,0);
         p=p/10;
        if (p> Integer.MAX_VALUE || p< Integer.MIN_VALUE) {
            return 0;
        }
       
      return (int) p;
    
    }
}