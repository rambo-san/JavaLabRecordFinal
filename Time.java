import java.util.Scanner;
class Time {
    private int hours;
    private int minutes;
    
    // Constructor overloading
    public Time() {
        this(0, 0); // Default constructor
    }
    
    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }
    
    // Member function to sum two Time objects
    public Time sum(Time t) {
        Time result = new Time();
        result.hours = this.hours + t.hours;
        result.minutes = this.minutes + t.minutes;
        
        // Adjusting hours and minutes if necessary
        if (result.minutes >= 60) {
            result.hours += result.minutes / 60;
            result.minutes %= 60;
        }
        
        return result;
    }
    
    // Getter methods
    public int getHours() {
        return hours;
    }
    
    public int getMinutes() {
        return minutes;
    }
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int x,y;
            System.out.println("Enter the hours and minutes of the first time");
            x=s.nextInt();
            y=s.nextInt();  
            Time t1 = new Time(x, y);
            System.out.println("Enter the hours and minutes of the second time");
            x=s.nextInt();
            y=s.nextInt();
            Time t2 = new Time(x, y);
            Time t3 = t1.sum(t2);
            System.out.println("Time 1: " + t1.getHours() + " hours, " + t1.getMinutes() + " minutes");
            System.out.println("Time 2: " + t2.getHours() + " hours, " + t2.getMinutes() + " minutes");
            System.out.println("Sum: " + t3.getHours() + " hours, " + t3.getMinutes() + " minutes");
        }
    }
}