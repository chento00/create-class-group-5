public class Main {
    public static void main(String[] args) {
        Student student = new Student(23,"KotDraxler","Male","Information Technology");
        System.out.println("******************************************");
        System.out.println("ID: "+student.GetID());
        System.out.println("Name: "+student.GetName());
        System.out.println("Gender: "+student.GetGender());
        System.out.println("Carree: "+student.GetCarree());
        student.Smos();
        student.Love();
        System.out.println("******************************************");
    }
}