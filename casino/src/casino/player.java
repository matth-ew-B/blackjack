/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casino;


/**
 *
 * @author VIASVS
 */
public class player {
      int bank;
    int bet;

        // Set amount of money player has
	public player() {
		bank = BlackJackGame.findMoney();


	}

	// Getter method to get player's bank
	public int getBank() {
		return bank;
	}
    // Will get a player's bet if they bust
	public void bust() {
		bank -= bet;
	}

	// reset bank to 0
	public void resetBank() {
		bank = 0;
	}

	// Setter method for a player's bet
	public void setBet(int Betnew) {
		bet = Betnew;
	}
        // Getter method for a player's bet
	public int getBet(){
		return this.bet;
	}


// Will add a player's bet from their bank if they are the winner
	public void winner() {
		bank =+ bet;
		
	}

// Will remove a player's bet from their bank if they are the loser
	public void loser() {
		bank =- bet;
		
	}
}