public class Main {
    public static void main(String[] args) {
        Student student = new Student(9,"KotDraxler","Male");
        System.out.println("ID: "+student.GetID());
        System.out.println("Name: "+student.GetName());
        System.out.println("Gender: "+student.GetGender());
    }
}