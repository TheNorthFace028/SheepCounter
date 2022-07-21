package hu.fazekas;

import org.apache.commons.text.similarity.LevenshteinDistance;

import java.util.Locale;

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
    public int getAliveSheepCount(String[] animals) {
        int sheep = animalCount(animals,"sheep");
        for (int i = 0; i < animals.length-1; i++){
            if (isWolf(animals[i]) && animals[i+1].equals("sheep")){
                sheep--;
            }
        }return sheep;
    }
    public boolean isWolf(String string){
        LevenshteinDistance levenshteinDistance = new LevenshteinDistance();
        int distance =levenshteinDistance.apply(string.toLowerCase(),"wolf");
        return distance <= 2;

    }
}
