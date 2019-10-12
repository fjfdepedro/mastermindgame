package com.game.mastermind.combination;

abstract class Combination {
    protected static final int NUMBER_ITEMS = 4;
    private Color[] colors;

    public Combination(){
        colors = new Color[Combination.NUMBER_ITEMS];
    }
    public void setColor(int position, Color color){
        colors[position] = color;
    }
    private Color getColor(char color){
        for(Color c:Color.values()){
            if(c.getColor() == color){
                return c;
            }
        }
        return null;
    }
    public Color[] createCombination(String textWithProposedColors){
        Color[] color = new Color[4];
        for(int x =0; x< textWithProposedColors.length(); x++){
            color[x] = new Color(textWithProposedColors.charAt(x));
        }
        return color;
    }
}

