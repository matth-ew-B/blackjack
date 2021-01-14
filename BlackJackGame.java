/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casino;
import java.util.ArrayList;
/**
 *
 * @author matth
 */
public class BlackJackGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cards[][]card = new cards[4][13];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                card[i][j]= new cards(i,j+1);
                System.out.println(card[i][j].name);
            }
        }
    }
    public static ArrayList<cards> shuffleCards(int[][] cardAr){
        ArrayList<cards> shuffledCards= new ArrayList();
        
        for (int i = 0; i < 52; i++) {// 52 cards in deck
            int suit = (int)(Math.random() * (4 - 1 + 1) + 1)-1;// for every suit
            int num = (int)(Math.random() * (13 - 1 + 1) + 1)-1;// for every num in suit
            while (cardAr[suit][num].isShuffled == true){//making sure no repeats
                suit = (int)(Math.random() * (4 - 1 + 1) + 1)-1;//random num for suit
                num = (int)(Math.random() * (13 - 1 + 1) + 1)-1;//random num for num
            }
            cardAr[suit][num].isShuffled = true;//switch to true
            cards addCard= new cards (suit, num);
            shuffledCards.add(addCard);//add new card to shuffled deck
        }
        
        return shuffledCards;
    }
    
}
