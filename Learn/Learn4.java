class Address implements Cloneable{
    String city;
    String state;
    Address(String city, String state){
        this.city = city;
        this.state = state;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
class Student implements Cloneable{
    String name;
    Address address;
    Student(String name, Address address){
        this.name = name;
        this.address = address;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
public class Learn4 {
    public static void main(String[] args) {
        Address a = new Address("Delhi", "Delhi");
        Student s1 = new Student("Rahul", a);
        Student s2;
        try {
            s2 =  (Student)s1.clone();
            System.out.println(s2.name + " " + s2.address.city + " " + s2.address.state);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        

    }
    
}
