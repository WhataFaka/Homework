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

        int x=Math.min(vasyaAge,katyaAge);
        int y=Math.max(vasyaAge,katyaAge);

        if (mishaAge>=x && mishaAge<=y){
            middle=mishaAge;
        } else if (mishaAge<=x){
            min=mishaAge;
        } else {
            max=mishaAge;
        }

        if (vasyaAge>=min && vasyaAge<=max){
            middle=vasyaAge;
        } else if (vasyaAge<=min && vasyaAge<=x){
            min=vasyaAge;
        } else {
            max=vasyaAge;
        }

        if (katyaAge>=min && katyaAge<=max){
            middle=katyaAge;
        } else if (katyaAge<=min && katyaAge<=x){
            min=katyaAge;
        } else {
            max=katyaAge;
        }





        System.out.println(vasyaAge);
        System.out.println(katyaAge);
        System.out.println(mishaAge);

//        if (katyaAge <= vasyaAge && katyaAge <= mishaAge) {
//            min = katyaAge;
//        }
//
//        if (vasyaAge <= katyaAge && vasyaAge <= mishaAge) {
//            min = vasyaAge;
//        }
//
//        if (mishaAge <= vasyaAge && mishaAge <= katyaAge) {
//            min = mishaAge;
//        }
//
//        if ((mishaAge <= vasyaAge && mishaAge >= katyaAge) ||
//                (mishaAge >= vasyaAge && mishaAge <= katyaAge)) {
//            middle = mishaAge;
//        }
//
//        middle = katyaAge;
//
//        if (mishaAge >= katyaAge && mishaAge >= vasyaAge) {
//            max = mishaAge;
//        }
//
//        if (vasyaAge > mishaAge && vasyaAge > katyaAge) {
//            max = vasyaAge;
//        }

        System.out.println("Min age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Max age: " + max);
    }
}
