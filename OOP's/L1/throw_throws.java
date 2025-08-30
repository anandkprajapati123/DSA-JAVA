class throw_throws {
    void div(int a,int b)throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }
        else{
            int c=a/b;
            System.out.println(c);
        }
    }
    public static void main(String[] args) throws ArithmeticException {
        throw_throws t = new throw_throws();
            t.div(20,0);
        }
}
