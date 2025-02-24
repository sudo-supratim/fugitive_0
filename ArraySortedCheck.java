public class ArraySortedCheck {
    int ar[];
    public void input(int n){
        ar=new int[n];
        java.util.Scanner in =new java.util.Scanner(System.in);
        System.out.println("Enter the elements");
        for(int i=0;i<ar.length;i++)
        ar[i]=in.nextInt();
        in.close();
    }
    public boolean isSorted(int i){
        if(i==ar.length-1)
        return true;
        else if(ar[i-1]>ar[i])
        return false;
        return isSorted(i+1);
    }
    public static void main(String[] args) {
        System.out.println("Enter number of elements");
        java.util.Scanner in=new java.util.Scanner(System.in);
        ArraySortedCheck ob=new ArraySortedCheck();
        ob.input(in.nextInt());
        if(ob.isSorted(1))
        System.out.println("Array is sorted");
        else
        System.out.println("Array is not sorted");
        in.close();
    }
}
