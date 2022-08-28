import java.util.ArrayList;
import java.util.List;

public class Lesson33 {
    public static void main(String[] args) {
        //////Java 5///////
        List animals = new ArrayList();

        animals.add("dog");
        animals.add("cat");
        animals.add("lion");

        String animal = (String) animals.get(2);

        System.out.println(animal);

        /////////Generics//////////

        List<String> animals2 = new ArrayList<String>();

        animals2.add("dog");
        animals2.add("cat");
        animals2.add("lion");

        String animal2 = animals2.get(1);

        List<String> animals3  = new ArrayList<>();


    }
}
