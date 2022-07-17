public class AgeComparator {
    public static void main(String[] args) {
        int vasyaAge = 88;
        int katyaAge = 57;
        int mishaAge = 5;

        int min = -1;
        int middle = -1;
        int max = -1;

        if (katyaAge <= vasyaAge && katyaAge <= mishaAge) {
            min = katyaAge;
        }

        if (vasyaAge <= katyaAge && vasyaAge <= mishaAge) {
            min = vasyaAge;
        }

        if (mishaAge <= vasyaAge && mishaAge <= katyaAge) {
            min = mishaAge;
        }

        if ((mishaAge <= vasyaAge && mishaAge >= katyaAge) ||
                (mishaAge >= vasyaAge && mishaAge <= katyaAge)) {
            middle = mishaAge;
        }

        middle = katyaAge;

        if (mishaAge >= katyaAge && mishaAge >= vasyaAge) {
            max = mishaAge;
        }

        if (vasyaAge > mishaAge && vasyaAge > katyaAge) {
            max = vasyaAge;
        }

        System.out.println("Min age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Max age: " + max);
    }
}
