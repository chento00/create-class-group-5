import java.util.Scanner;

public class Course {
    public String name;
    public int createHour;
    public double ID;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name Course:");
        String name = scanner.nextLine();
        int createHour =scanner.nextInt();
        System.out.println("Enter Hour:");
        double ID = scanner.nextDouble();
        Course course = new Course();
        course.display();
    }
    public void  display(){
        System.out.println("Course : "+name);
        System.out.println("Hour : "+createHour );
        System.out.println("ID :" +ID);
    }

}
