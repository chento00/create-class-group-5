public class Student {
    private int id;
    private String name;
    private String gender;

    public int GetID(){
        return id;
    }
    public String GetName(){
        return name;
    }
    public String GetGender(){
        return gender;
    }
    public Student(int id,String name, String gender){
        this.id=id;
        this.name=name;
        this.gender=gender;
    }
}
