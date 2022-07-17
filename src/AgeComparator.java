import java.util.Random;

public class AgeComparator {
    public static void main(String[] args) {
        Random random = new Random();
        int vasyaAge = random.nextInt(120);
        int katyaAge = random.nextInt(120);
        int mishaAge = random.nextInt(120);

        int min = -1;
        int middle = -1;
        int max = -1;

        min = Math.min(Math.min(vasyaAge, katyaAge), mishaAge);
        max = Math.max(Math.max(vasyaAge, katyaAge), mishaAge);

        if (vasyaAge <= katyaAge && katyaAge <= mishaAge)
            middle = katyaAge;
        else if (vasyaAge >= katyaAge && vasyaAge <= mishaAge) {
            middle=vasyaAge;
        } else {
            middle=Math.max(vasyaAge,mishaAge);
        }


        System.out.println(vasyaAge);
        System.out.println(katyaAge);
        System.out.println(mishaAge);

//

        System.out.println("Min age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Max age: " + max);
    }
}
