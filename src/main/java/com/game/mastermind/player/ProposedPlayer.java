package com.game.mastermind.player;

import com.game.mastermind.combination.ProposedCombination;

import java.util.ArrayList;

public class ProposedPlayer {

    private static final int MAX_ATTEMPTS = 10;

    private ArrayList<ProposedCombination> attempts = new ArrayList<ProposedCombination>();

    public ProposedCombination propose(){
        ProposedCombination proposedCombination = new ProposedCombination();
        proposedCombination.read();
        attempts.add(proposedCombination);
        return proposedCombination;
    }
    public ProposedCombination getLastProposedPlayer() {
        return attempts.get(attempts.size() - 1);
    }
    public void writeAttempts() {
        System.out.println(attempts.size() + " attempt(s):");
    }
    public void writeProposedCombinations(){
        for (int i = 0; i < attempts.size(); i++) {
            attempts.get(i).write();
        }
    }
    public boolean isWinner(){
        return getLastProposedPlayer().isWinner();
    }
    public boolean isLooser(){
        return attempts.size() == ProposedPlayer.MAX_ATTEMPTS;
    }
}
