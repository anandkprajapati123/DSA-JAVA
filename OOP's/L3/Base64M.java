import java.util.Base64;
public class Base64M {
    public static void main(String[] args) {
        // create a sample string to encode
        String sample="Hello World!";
        // print the original string
        System.out.println("Original String:\n " + sample);

        // Encode into Base64 format
        String BasicBase64format = Base64.getEncoder().encodeToString(sample.getBytes());
        System.out.println("Base64 Encoded String:\n " + BasicBase64format);

        // Decode from Base64 format
        byte[] decodedBytes = Base64.getDecoder().decode(BasicBase64format);
        // Convert byte array back to string
        System.out.println("Decoded to String:\n "+ decodedBytes);
    }
}
