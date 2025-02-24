public class StringReversal {
    public String reverse(String g){
        if(g.length()==0||g.length()==1)
        return g;
        else
        return reverse(g.substring(1))+g.charAt(0);
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("enter string to be reversed: ");
        String str = new StringReversal().reverse(sc.nextLine());
        System.out.println("the reversed string is: "+str);
        sc.close();
    }
}
