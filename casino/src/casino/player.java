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

        // Creates the bank for player
	public player() {
		bank = BlackJackGame.findMoney();


	}

	// Will get the player's bank amount
	public int getBank() {
		return bank;
	}
    // Removes a player's bet from their bank and then will Set the bet to zero after.
	public void bust() {
		bank -= bet;
		bet = 0;
	}

	// Adds a player's bet from their bank and then sets bet to zero afterwards.
	public void win() {
		bank += bet;
		bet = 0;
	}

	// Removes a player's bet from their bank if they lose and will set the bet to zero afterwards.
	public void loss() {
		bank -= bet;
		bet = 0;
	}


	// Will set a player's bet
	public void setBet(int newBet) {
		bet = newBet;
	}
        // Will get a player's bet
	public int getBet(){
		return this.bet;
	}

}
