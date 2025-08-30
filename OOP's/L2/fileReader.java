import java.io.*;
public class fileReader {
    public static void main(String[] args) {
        try{
            FileReader r=new FileReader("C:\\Users\\anand\\OneDrive\\Desktop\\LC.txt");
            try{
                int i;
                while((i=r.read())!=-1){
                    System.out.print((char)i);
                }
                System.out.println();
            }
            finally{
                r.close();
                System.out.println(" file closed");
            }
        }
        catch (IOException e) {
            System.out.println("Exception handled...");
        }
    }
}
