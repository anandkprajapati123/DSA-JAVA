public class Pattern2 {
    public static void main(String[] args){
        System.out.println("Enter the number of rows for the pattern:");
        int n = 5;
        // Upper Part
        for(int i=1;i<=n;i++){
            // 1st part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // Spaces
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            // 2nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part
        for(int i=n;i>=1;i--){
            // 1st part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // spaces
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            // 2nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}