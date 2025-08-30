class InvalidAgeException extends Exception{
    public InvalidAgeException(String msg){
        super(msg);
    }
}

class user_defined_exception {
    public static void main(String[] args) {
        try{
            vote(20);
        } catch(InvalidAgeException e){
            System.out.println(e);
        }
    }
    public static void vote(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Not eligible for vote");
        }
        else{
            System.out.println("eligible for voting");
        }
    }
}
