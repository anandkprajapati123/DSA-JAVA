class FrontnedDeveloper{
    public void mySkills(){
        System.out.println("I know frontend part HTML,CSS,JS,REACT-JS");
    }
}
class FullStackDeveloper extends FrontnedDeveloper {
    public void mySkills(){
        super.mySkills();
        System.out.println("I know backend part NODE-JS,MONGO-DB,Express-JS");
    }
}

public class override {
    public static void main(String[] args) {
        FullStackDeveloper developer=new FullStackDeveloper();
        developer.mySkills();
    }    
}
