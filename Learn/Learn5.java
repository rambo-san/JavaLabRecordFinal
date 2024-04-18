class MyException extends Exception{
    private String exp;
    MyException(String s){
        super(s);
    }
    
}
public class Learn5 {
    public static void main(String[] args) {
        try {
            throw new MyException("Hello bitches");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
