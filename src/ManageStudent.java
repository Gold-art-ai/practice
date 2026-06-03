import java.util.ArrayList;
public class ManageStudent {
ArrayList<Student> students = new ArrayList<>();

public void addStudent(Student student){
    students.add(student);
};
public void deleteStudent(int id){

    for(Student s : students){
        if(s.getId() == id){
            students.remove(s);

        }
    }

}
public void searchStudent(int id){
boolean found = false;
    for(Student s: students){
        if(s.getId() == id){

            s.displayInfo();
            System.out.println("Student Found!");
        }
    }
    if (!found){
        System.out.println("Student not found");
    }

}
public void displayAllStudent(){
    for(Student s: students){
        s.displayInfo();

    }
}
}
