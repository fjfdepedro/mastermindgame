package com.game.mastermind.player;

import com.game.mastermind.combination.Result;
import com.game.mastermind.combination.SecretCombination;

public class SecretPlayer {

    private ProposedPlayer proposedPlayer;
    private SecretCombination secretCombination;

    public SecretPlayer(ProposedPlayer proposedPlayer){
        this.proposedPlayer = proposedPlayer;
    }
    public void prepare(){
        this.secretCombination = new SecretCombination();
    }
    public Result answer(){
        return secretCombination.calculateResult(proposedPlayer.getLastProposedPlayer());
    }
    public void write(){
        secretCombination.write();
    }
}
