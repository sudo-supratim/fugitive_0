import java.io.*;
public class positiveNum {
    public void isPos() throws FileNotFoundException, PositiveNumberException, IOException{
        BufferedReader hang=new BufferedReader(new FileReader("numbers.txt"));
        String g;
        while((g=hang.readLine())!=null){
            if(Integer.parseInt(g)>0)
            throw new PositiveNumberException("Positive number found");
        }
    } 
    public static void main(String[] args) {
        try{
            new positiveNum().isPos();
            System.out.println("no positive numbers found");
        }catch(PositiveNumberException e){
            System.err.println("error: "+e.getMessage());
        }catch(FileNotFoundException e){
            System.err.println();
        }catch(IOException e){
            System.err.println();
        }

    }   
}
class PositiveNumberException extends Exception{
    public PositiveNumberException(String g){
        super(g);
    }
}
