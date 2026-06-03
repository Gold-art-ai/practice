public class Student {
    private int id;
    private String name;
    private float marks;
    public int age;

    public Student(int id, String name,int age){
        this.id= id;
        this.name = name;
        this.age= age;
    }
    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }
    public void displayInfo(){
        System.out.println("Student " + name + " age " + age + " got " + marks + " marks");
    }
}
