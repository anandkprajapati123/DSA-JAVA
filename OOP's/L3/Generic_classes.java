class Mycollection1{
    int[] arr=new int[10];
}
class Mycollection2{
    double[] arr=new double[10];
}
class Mycollection3{
    String[] arr=new String[10];
}

public class Generic_classes {
    public static void main(String[] args) {
        Mycollection1 c1=new Mycollection1();
        Mycollection2 c2=new Mycollection2();
        Mycollection3 c3=new Mycollection3();
        c1.arr[0]=10;
        c2.arr[0]=10.5;
        c3.arr[0]="Hello";
        System.out.println(c1.arr[0]);
        System.out.println(c2.arr[0]);
        System.out.println(c3.arr[0]);
    }
}
