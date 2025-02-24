
public class VowelStringCheck {
    public void checkVowel(String s) throws NoVowelsException{
        boolean flag=false;
        for(int i=0;i<s.length();i++)
        if("AEIOUaeiou".indexOf(s.charAt(i))!=-1){
            flag=true;
            break;
        }
        if(!flag)
        throw new NoVowelsException("entered string does not have vowels");
    }
    public static void main(String[] args) {
        java.util.Scanner in =new java.util.Scanner(System.in);
        System.out.println("Enter string");
        try {
            new VowelStringCheck().checkVowel(in.nextLine());
            System.out.println("String OK");
        } catch (NoVowelsException e) {
            System.out.println("error: "+e.getMessage());
        }
        in.close();
    }
    class NoVowelsException extends Exception{
        public NoVowelsException(String m){
            super(m);
        }
    }
}

