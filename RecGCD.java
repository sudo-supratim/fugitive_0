public class RecGCD {
    public int gcd(int num1, int num2, int div) {
        if (num1 % div == 0 && num2 % div == 0)
            return div;
        return gcd(num1, num2, div - 1);
    }

    public static void main(String args[]) {
        System.out.println("Enter numbers: ");
        java.util.Scanner in = new java.util.Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        int r = new RecGCD().gcd(a, b, a < b ? a : b);
        System.out.println("the GCD is: " + r);
        in.close();
    }
}
