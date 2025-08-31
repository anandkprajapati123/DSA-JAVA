public class scoping {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        // System.out.println(num);

        for(int i=0;i<5;i++){
            System.out.println(i);
            int num=6;
            a=222;
        }
        System.out.println(num); //give error
        System.out.println(a);
    }
    // static void random(){
        // int num=4;
    // }
}
