package Learning;
final class A{
    void show(){
        System.out.println("A");
    }
}
class B /*extends A*/{
    final void show(){
        System.out.println("B");
    }
}
class C extends B{
    // void show(){
    //     System.out.println("C");
    // }
    final int a = 10;
}
public class Learn2 {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        System.out.println(obj.a);
        //obj.a = 20;

    }
}
