class GrandParent {
    void name() {
        System.out.println("GrandParent name : John Doe");
    }
}
class Parent extends GrandParent {
    void Parentname() {
        System.out.println("Parent name : Alice Doe");
    }
}
class Child extends Parent {
    void childname() {
        System.out.println("Child name : Bob Doe");
    }
}
public class Multilevel_inheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.name();
        child.Parentname();
        child.childname();
    }
}