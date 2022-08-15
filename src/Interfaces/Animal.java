package Interfaces;

public class Animal implements Info {
    public int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep() {
        System.out.println("Im sleeping");
    }

    public void showInfo() {
        System.out.println("Id is " + this.id);
    }

    @Override
    public void goRelax() {
        System.out.println("Animal " + this.id + " go relax");
    }
}
