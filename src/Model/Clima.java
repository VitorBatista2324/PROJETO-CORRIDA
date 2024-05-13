package Model;

import java.util.Random;

public abstract class Clima {
    String[] climas = {"Chuvoso","Nublado","Relâmpagando!","Tenebroso!"};

    Random random = new Random();

    public String getClimas(){
        int aleatorio = random.nextInt(climas.length);
        return climas[aleatorio];
    }
}
