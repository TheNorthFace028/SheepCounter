package hu.fazekas;


public class Main {

    public static int sheepCount(String[] animals) {
        if (animals == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < animals.length; i++) {
            if ("sheep".equals(animals[i])) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        SheepCounter sc = new SheepCounter();
        String animals[] = new String[]{"sheep", "duck", "wolf", "sheep"};
        int actual = sc.sheepCount(animals);// actual = 2
        int actual1 = sc.wolfCount(animals);
        System.out.println("How many wolf is there: " + actual1);

        int actual3 =sc.getAliveSheepCount(animals);
        System.out.println("How many sheep is alive: " + actual3);
        /*actual = sc.sheepCount(animals); // actual = 2
        System.out.println(actual);
        sc.sheepCount(animals);
        int allSheepCount = sc.getAllSheepCount(); // allSheepCount = 4

        System.out.println(allSheepCount);*/
    }
}