public class Student {
    private int id;
    private String name;
    private String gender;
    private String carree;

    public int GetID(){
        return id;
    }
    public String GetName(){
        return name;
    }
    public String GetGender(){
        return gender;
    }
    public String GetCarree(){
        return carree;
    }
    public void Smos(){
        System.out.println("He is very Smos <3");
    }

    public void Love(){
        System.out.println("He love Everything");
    }
    public Student(int id,String name, String gender,String carree){
        this.id=id;
        this.name=name;
        this.gender=gender;
        this.carree=carree;
    }
}
