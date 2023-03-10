public class University {
    // Fields
    private String name;
    private String location;
    private int numOfStudents;

    // Constructor
    public University(String name, String location, int numOfStudents) {
        this.name = name;
        this.location = location;
        this.numOfStudents = numOfStudents;
    }

    // Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    @Override
    public String toString() {
        return "University [name=" + name + ", location=" + location + ", numOfStudents=" + numOfStudents + "]";
    }
}
