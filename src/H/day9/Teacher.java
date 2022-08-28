package H.day9;

public class Teacher extends Human {
    private String itemName;

    public Teacher(String name, String itemName) {
        super(name);
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + getName());
    }
}
