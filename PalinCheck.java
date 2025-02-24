public class PalinCheck {
    public boolean isPalin(String g, int i) {
        if (i == g.length())
            return true;
        else if (g.charAt(i) != g.charAt(g.length() - 1 - i))
            return false;
        return isPalin(g, i + 1);
    }

    public static void main(String args[]) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("Enter string: ");
        if (new PalinCheck().isPalin(in.next(), 0))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
        in.close();
    }
}
