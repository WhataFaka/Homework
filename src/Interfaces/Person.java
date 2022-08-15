package Interfaces;

public class Person implements Info {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHi() {
        System.out.println("Hello");
    }


    @Override
    public void showInfo() {
        System.out.println("Name is " + this.name);
    }

    @Override
    public void goRelax() {
        System.out.println(this.name + " go to relax");
    }
}
