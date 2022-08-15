public class Construct {
    public static void main(String[] args) {
        Humans h1 = new Humans("Ivan", 44);
        Humans h2 = new Humans("kate", 21);
        Humans.printNumberOfPeople();
    }
}

class Humans {
    private String name;
    private int age;
    private static int count;

    public static String description;

    public Humans(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }


    public void setName(String name) {
        this.name = name;
    }

    public static void getDescription() {
        System.out.println(description);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getAllFields() {
        System.out.println(name + "," + age + "," + description);
    }

    public static void printNumberOfPeople() {
        System.out.println("Number of people: " + count);
    }
}
