package com.game.mastermind.combination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProposedCombination extends Combination{

    Color[] colorsCombination;
    private Result result;


    public void read() throws IOException {
        Boolean booleanValidate = true;
        String textWithProposedColors;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            booleanValidate = true;
            System.out.println("");
            System.out.print("Propose a combination: ");
            textWithProposedColors = br.readLine();

            ValidatorCombination validateCombination = new ValidatorCombination(textWithProposedColors, Combination.NUMBER_ITEMS);

            if (!validateCombination.checkValidColor()) {
                System.out.print("Wrong colors, they must be: rbygop");
                booleanValidate = false;
            }
            if (validateCombination.checkRepeatedColor()) {
                System.out.println("Repeated colors");
                booleanValidate = false;
            }
            if (!validateCombination.checkNumberItemsColorIsOk()) {
                System.out.println("Wrong proposed combination length");
                booleanValidate = false;
            }
        } while(booleanValidate.TRUE);
        colorsCombination = createCombination(textWithProposedColors);

    }

    public boolean contains(Color color, int position) {
        return colorsCombination[position] == color;
    }

    public boolean contains(Color color){
        for(Color c:Color.values()){
            if(c.getColor() == color.getColor()){
                return true;
            }
        }
        return false;
    }

    public void setResult(Result resultCombinate){
        result = resultCombinate;
    }
    public boolean isWinner(){
        return result.isWinner();
    }

    public void write() {
        result.write();
    }
}
