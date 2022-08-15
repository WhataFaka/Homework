package Interfaces;

public class Test {
    public static void main(String[] args) {
        Info info1 = new Animal(2);
        Info info2 = new Person("Alex");
        Info info3 = new Animal(4);
        Animal animal1 = new Animal(5);
        info1.showInfo();
        info2.showInfo();
        info3.showInfo();
        info1.goRelax();
        info2.goRelax();
        animal1.goRelax();
    }
}
