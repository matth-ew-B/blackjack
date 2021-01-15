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
public class BlackJack {
    int users;


    // Gets the bets from the player
	public void getBets(){
		int betValue;


		 {  	
			if (user.getBank() > 0) {
			do {
				System.out.print("How much do you want to bet " + (" (1-" + player[i].getBank()) + ")? " );
				betValue = input.nextInt();
				player[i].setBet(betValue);
			} while (!( betValue > 0 && betValue <= player[i].getBank()));

			}

		}

	}


// This code calculates all possible outcomes and adds or removes the player bets
	public void settleBets() {
		System.out.println();

		for (int i = 0; i < users; i++) {
			if (user.getBet() > 0 ) {
				if( player[i].getTotal() > 21 ) {
					System.out.println(player[i].getName() + " has busted");
					player[i].bust();
				} else if ( player[i].getTotal() == dealer.calculateTotal() ) {
					System.out.println(player[i].getName() + " has pushed");
					player[i].push();
				} else if ( player[i].getTotal() < dealer.calculateTotal() && dealer.calculateTotal() <= 21 ) {
					System.out.println(player[i].getName() + " has lost");
					player[i].loss();
				} else if (player[i].getTotal() == 21) {
					System.out.println(player[i].getName() + " has won with blackjack!");
					player[i].blackjack();
				} else {
					System.out.println(player[i].getName() + " has won");
					player[i].win();

				}
			}
		}