package H.day9;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Nikita","IT");
        Teacher teacher = new Teacher("Alya Kopaeva","IT programmer");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getItemName());

        student.printInfo();
        teacher.printInfo();
    }
}
