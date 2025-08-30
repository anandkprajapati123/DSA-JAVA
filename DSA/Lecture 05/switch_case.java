import java.util.Scanner;
public class switch_case {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter fruits name:");
        // String fruit = sc.nextLine();
        // switch (fruit) {
        //     case "mango"->System.out.println("King of fruits");
        //     case "apple"->System.out.println("A sweet of fruits");
        //     case "banana"->System.out.println("A healthy fruit");
        //     default->System.out.println("Unknown fruit");
        // }


        // System.out.print("Enter no.:");
        // int day =sc.nextInt();
        // switch(day){
        //     case 1:
        //        System.out.println("Monday");
        //        break;
        //     case 2:
        //        System.out.println("Tuesday");
        //        break;
        //     case 3:
        //        System.out.println("Wednesday");
        //        break;
        //     case 4:
        //        System.out.println("Thursday");
        //        break;
        //     case 5:
        //        System.out.println("Friday");
        //        break;
        //     case 6:
        //        System.out.println("Saturday");
        //        break;
        //     case 7:
        //        System.out.println("Sunday");
        //        break;
        //     default:
        //        System.out.println("Invalid day");
        // }


        int empID=sc.nextInt();
        String department=sc.next();
        switch(empID){
            case 1:
                System.out.println("Anand");
                break;
            case 2:
                System.out.println("Ajay");
                break;
            case 3:
            System.out.println("Employee 3");
                switch (department) {
                case "CE":
                    System.out.println("Computer Engineering");
                    break;
                case "IT":
                    System.out.println("Information Technology");
                    break;         
                default:
                    System.out.println("Unknown department");
                }
                break;
            default:
                System.out.println("Unknown employee");
        }
    }
}
