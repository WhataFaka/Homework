public class ClassesAndObject {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.setName("Alena");
        person1.setAge(-5);
        System.out.println("Выводим значение в main методе: " + person1.getName());
        System.out.println("Выводим значение в main методе: " + person1.getAge());
        person2.setName("Nikita");
        person2.setAge(47);
        person1.speak();
        person2.speak();
    }
}

class Person {
    private String name;
    private int age;

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Ты ввёл пустое имя");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Ты ввёл возраст меньше 0");
        }

    }

    public int getAge() {
        return age;
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

