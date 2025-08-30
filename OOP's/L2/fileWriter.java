import java.io.*;

public class fileWriter {
    public static void main(String[] args) {
        try{
            FileWriter f=new FileWriter("C:\\Users\\anand\\OneDrive\\Desktop\\LC.txt");
            try{
                f.write("Java programming is the best language in the world.....!");
            }
            finally{
                f.close();
            }
            System.out.println("successfully data wrote in file");
        }
        catch(IOException i){
            System.out.println(i);
        }
    }
}
