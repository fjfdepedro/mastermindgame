package com.game.mastermind;

import com.game.mastermind.player.ProposedPlayer;
import com.game.mastermind.player.SecretPlayer;

import java.io.IOException;

public class Mastermind {

    public static void play() throws IOException {
        System.out.println("----- MASTERMIND -----");
        ProposedPlayer proposedPlayer = new ProposedPlayer();
        SecretPlayer secretPlayer = new SecretPlayer(proposedPlayer);
        secretPlayer.prepare();
        do {
            secretPlayer.write();
            proposedPlayer.propose();
            secretPlayer.answer();
            proposedPlayer.writeAttempts();
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
