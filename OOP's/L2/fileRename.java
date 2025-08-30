import java.io.*;
public class fileRename {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\anand\\OneDrive\\Desktop\\LC.txt");
        File r=new File("C:\\Users\\anand\\OneDrive\\Desktop\\anand.txt");
        if(f.exists()){
            System.out.println(f.renameTo(r));
        }
        else{
            System.out.println("File does't exists...");
        }
    }
}
