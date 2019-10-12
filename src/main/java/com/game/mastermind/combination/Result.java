package com.game.mastermind.combination;

public class Result {
    private int deads;
    private int damaged;
    protected static final int NUMBER_DEADS = 4;

    public Result(int deads, int damaged){
        this.damaged = damaged;
        this.deads = deads;
    }

    public void write(){
        System.out.println(deads + " blacks and " + damaged + " whites");
    }

    public boolean isWinner(){
        return deads == NUMBER_DEADS;
    }
}
