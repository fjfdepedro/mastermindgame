package com.game.mastermind.combination;

import java.util.ArrayList;
import java.util.Random;

public class SecretCombination extends Combination {
    private final Color[] combinationSecret;

    public SecretCombination() {
        this.combinationSecret = generateRandomColorsCombination();
    }
    public void calculateResult(ProposedCombination proposedCombination) {
        int damaged = 0;
        int deads = 0;
        for(int x =0; x < 4; x++){
            if(proposedCombination.contains(combinationSecret[x], x)){
                deads++;
            }
            else if(proposedCombination.contains(combinationSecret[x])){
                damaged++;
            }
        }

        proposedCombination.setResult(new Result(deads, damaged));
    }
    public void write(){
        System.out.println("****");
    }
    private Color[] generateRandomColorsCombination(){
        Random rand = new Random();

        Color[] allColors = Color.values();
        ArrayList combinationColorsList = new ArrayList();

        do {
            Color randElement = allColors[(int) ((Math.random() * 3) +1)];
            combinationColorsList.add(randElement);
        }
        while(combinationColorsList.size()<5);

        Color[] combinationColors = (Color[]) combinationColorsList.toArray(new Color[4]);

        return combinationColors;
    }
}
