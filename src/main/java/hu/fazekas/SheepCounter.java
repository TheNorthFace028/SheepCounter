package hu.fazekas;

public class SheepCounter {

    int mezo = 0;
    public int sheepCount(String[] animals) {
        int count = animalCount(animals,"sheep");
        mezo += count;
        return count;
    }

    public int getAllSheepCount() {
        return  mezo;
    }
    public int animalCount(String[] animals,String animalName){
        if (animals == null){
            return 0;
        }
        int count= 0;
        for (int i = 0; i < animals.length; i++) {
            if(animalName.equals(animals[i]) ){
                count++;
            }
        }
        return count;
    }
    public int wolfCount(String[] animals) {
        return animalCount(animals, "wolf");
    }
}
