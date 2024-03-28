class A{
    void show(){
        System.out.println("A");
    }
}
class B extends A{
    void show(){
        System.out.println("B");
    }
}
class C extends B{
    void show(){
        System.out.println("C");
    }
}
public class Learn3 {
    public static void main(String[] args) {
        C obj3 = new C();
        B obj2 = new B();
        A obj = new A();
        //A obj ;
        //obj = obj1;
        obj.show();
        obj = obj2;
        obj.show();
        obj = obj3;
        obj.show();

    }
}
