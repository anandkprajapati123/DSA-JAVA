// A switch expression in Java is an enhanced version of the traditional switch statement, introduced in Java 12 (preview) and standardized in Java 14. It allows for more concise and expressive control flow, and it can return a value.

// public class Switch_expression {
//     int day=8;
//     String dayname=switch (day) {
//         case 1 -> "Monday";
//         case 2 -> "Tuesday";
//         case 3 -> "Wednesday";
//         case 4 -> "Thursday";
//         case 5 -> "Friday";
//         case 6 -> "Saturday";
//         case 7 -> "Sunday";
//         default -> "Invalid day";
//     };
//     public Switch_expression() {
//         System.out.println("The day is: " + dayname);
//     }
//     public static void main(String[] args) {
//         new Switch_expression();
//     }
// }

public class Switch_expression {
    public enum Day {
        SUNDAY, MONDAY, TUESDAY,
        WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
    public static void main(String[] args) {
        Day day = Day.MONDAY;
        int numLetters = 0;
        switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> numLetters = 6;
            case TUESDAY                -> numLetters = 7;
            case THURSDAY, SATURDAY     -> numLetters = 8;
            case WEDNESDAY              -> numLetters = 9;
            default -> throw new IllegalStateException("Invalid day: " + day);
        }
        System.out.println("The number of letters in " + day + " is: " + numLetters);
    }
}
