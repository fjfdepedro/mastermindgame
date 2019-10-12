package com.game.mastermind;

import com.game.mastermind.player.ProposedPlayer;
import com.game.mastermind.player.SecretPlayer;

public class Mastermind {

    public static void play() {
        System.out.println("----- MASTERMIND -----");
        ProposedPlayer proposedPlayer = new ProposedPlayer();
        SecretPlayer secretPlayer = new SecretPlayer(proposedPlayer);
        secretPlayer.prepare();
        do {
            secretPlayer.write();
            proposedPlayer.propose();
            proposedPlayer.writeAttempts();
            secretPlayer.write();
            secretPlayer.answer();
            proposedPlayer.writeProposedCombinations();
        }
        while(!proposedPlayer.isLooser() && !proposedPlayer.isWinner());
        finalMessage(proposedPlayer);
    }

    private static void finalMessage(ProposedPlayer proposedPlayer) {
        if (proposedPlayer.isLooser()) {
            System.out.println("You've lost!!! :-(");
        } else {
            System.out.println("You've won!!! ;-)");
        }
    }


}
