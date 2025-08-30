// "this" is a special object reference, which is also a keyword
// "this" is automatically created by java in amethod's argument, as soon we call that method

class Student {
    private int roll;
    private String name;
    private double per;
    
    public void setStudent(int roll,String name,double per){
        this.roll=roll;
        this.name=name;
        this.per=per;
    }
    public void showStudent(){
        System.out.println("roll="+roll+", name="+name+", per="+per);
    }
}

public class This{    
    public static void main(String[] args){
        Student s=new Student();
        s.setStudent(10,"Anand",85.3);
        s.showStudent();
    }
}
