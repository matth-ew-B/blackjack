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
    
}
