public class goldbach {
    int n;
    public goldbach(int h){
        if(h%2!=0)
        System.out.println("Invalid input. Number entered is odd");
        n=h;
    }
    public void checker(){
        System.out.println("PRIME PAIRS ARE: ");
        for(int i=1;i<=n/2;i++){
            if(isOddPrime(i)&&isOddPrime(n-i))
            System.out.println(i+" "+(n-i));
        }
    }
    public boolean isOddPrime(int x){
        int c=0;
        boolean flag=false;
        for(int i=1;i<=x;i++){
            if(x%i==0)
            c++;
        }
        if(c==2&&x%2!=0)
        flag=true;
        return flag;
    }
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        java.util.Scanner in = new java.util.Scanner(System.in);
        new goldbach(in.nextInt()).checker();
        in.close();
    }
}
