/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casino;

/**
 *
 * @author matth
 */
public class player {
   int bank;
  int bet;

        // Creates a player object
	public player() {
		bank = BlackJackGame.findMoney();


	}

	// Gets a player's bank amount
	public int getBank() {
		return bank;
	}
    // Removes a player's bet from their bank if they bust. Sets bet to zero afterwards.
	public void bust() {
		bank -= bet;
		bet = 0;
	}

	// Adds a player's bet from their bank if they win. Sets bet to zero afterwards.
	public void win() {
		bank += bet;
		bet = 0;
	}

	// Removes a player's bet from their bank if they lose. Sets bet to zero afterwards.
	public void loss() {
		bank -= bet;
		bet = 0;
	}

	// This sets the player bank to -1. -1 is unreachable and they are removed from the game
	public void removeFromGame() {
		bank = -1;
	}

	// This resets the bank to 0. Currently used to reset a removed player's bank from -1 to 0.
	public void resetBank() {
		bank = 0;
	}

	// This calculate the bet for a player who has a Blackjack
	public void blackjack() {
		bank += bet * 1.5;
		bet = 0;
	}

	// Sets a player's bet to 0 if the "push". Notice, no bet is added or removed.
	public void push() {
		bet = 0;
	}

	// Sets a player's bet
	public void setBet(int newBet) {
		bet = newBet;
	}
        // Gets a player's bet
	public int getBet(){
		return this.bet;
	}

}