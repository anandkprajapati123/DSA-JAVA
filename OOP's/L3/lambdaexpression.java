// lambda expression basically used to express instance of functional interface

interface TestInterface {
    boolean test(int a);
}
class OddEven{
    static boolean check(TestInterface t1 ,int b){
        return t1.test(b);
    }
}

public class lambdaexpression {
    public static void main(String[] args) {
        boolean result=OddEven.check(a->(a%2)==0, 11);
        System.out.println("The result for even is: "+result);
    }
}

// import java.util.ArrayList;
// public class LamdaDemo1 {
//   public static void main(String[] args) {
//     ArrayList<Integer> num = new ArrayList<>();
//     num.add(5);
//     num.add(9);
//     num.add(8);
//     num.add(1);
//     num.forEach(n->{
//       if(n%2==0){
//         System.out.println(n + " is even");
//       } else {
//         System.out.println(n + " is odd");
//       }
//     });
//   }
// }
