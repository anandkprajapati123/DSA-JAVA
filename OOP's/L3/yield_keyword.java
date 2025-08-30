public class yield_keyword {
    public enum Day {
        SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
    }
    public static void main(String[] args) {
        Day day=Day.SUNDAY;
        // using switch expression with yeild
        int numLetters=switch(day){
            case MONDAY, FRIDAY,SUNDAY->{
                yield 6;
            }
            case TUESDAY->{
                yield 7;
            }
            case THURSDAY,SATURDAY->{
                yield 8;
            }
            case WEDNESDAY->{
                yield 9;
            }
            default->{
                throw new IllegalStateException("Invalid day: " +day);
            }
        };
        System.out.println("The number of letters in " + day + " is: " + numLetters);
    }
}
