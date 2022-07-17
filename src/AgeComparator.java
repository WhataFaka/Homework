public class AgeComparator {
    public static void main(String[] args) {
        int vasyaAge = 2;
        int katyaAge = 35;
        int mishaAge = 58;

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

        if ((vasyaAge <= mishaAge && vasyaAge >= katyaAge) ||
                (vasyaAge >= mishaAge && vasyaAge <= katyaAge)) {
            middle = vasyaAge;
        }

        if ((mishaAge <= vasyaAge && mishaAge >= katyaAge) ||
                (mishaAge >= vasyaAge && mishaAge <= katyaAge)) {
            middle = mishaAge;
        }

        if ((katyaAge <= vasyaAge && katyaAge >= mishaAge) ||
                (katyaAge >= vasyaAge && katyaAge <= mishaAge)) {
            middle = katyaAge;
        }

        if (mishaAge >= katyaAge && mishaAge >= vasyaAge) {
            max = mishaAge;
        }

        if (vasyaAge > mishaAge && vasyaAge > katyaAge) {
            max = vasyaAge;
        }

        if (katyaAge > mishaAge && katyaAge > vasyaAge) {
            max = katyaAge;
        }
        System.out.println("Min age: "+min);
        System.out.println("Middle age: "+middle);
        System.out.println("Max age: "+max);
    }
}
