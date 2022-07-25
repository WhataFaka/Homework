public class ClassesAndObject {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.name = "Ivan";
        person1.setName("Alena");
        person1.setAge(29);
        int year1 = person1.calculateYearsToRetirment();
        person2.name = "Nik";
        person2.setAge(47);
        int year2 = person2.calculateYearsToRetirment();
        person1.speak();
        person2.speak();
    }
}

class Person {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    int calculateYearsToRetirment() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("My names " + name + " and iam " + age);
        }
    }

    void sayHello() {
        System.out.println("Hello");
    }

}

