public class Main {
    public static void main(String[] args) {
     ManageStudent manage = new ManageStudent();
     Student s1 = new Student(1, "Gold", 17);
     Student s2 = new Student(2, "Gogo", 16);
     Student s3 = new Student(3, "Kaliza", 16);
     manage.addStudent(s1);
     manage.addStudent(s2);
     manage.addStudent(s3);
     manage.displayAllStudent();
        System.out.println("Searching for a student!");
     manage.searchStudent(4);
        System.out.println("-----------------------------");
     manage.searchStudent(2);


    }
}
