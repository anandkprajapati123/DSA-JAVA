// There are found an error and we use try-catch to solve the error or use throwsIOException

import java.io.*;
public class createFile {
    public static void main(String[] args) throws IOException {
        File f=new File("C:\\Users\\anand\\OneDrive\\Desktop\\LC.txt");
        // try{
            if(f.createNewFile()){
                System.out.println("File successfully created...");
            }
            else{
                System.out.println("File already exists...");
            }
        // }
        // catch(IOException i){
        //     System.out.println("Exception Handled");
        // }
    }
}
