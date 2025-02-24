public class RecFib{
    public int fibo(int n){
        if(n==1)
        return 1;
        else if(n==0)
        return 0;
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        System.out.println("Enter n");
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.println(new RecFib().fibo(in.nextInt()));
        in.close();
    }
}
