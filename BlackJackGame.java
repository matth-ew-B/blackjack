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
        ArrayList<cards> card = new ArrayList();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                card.add(new cards(i, j + 1));
            }
        }
        System.out.println(card.get(1).name);
        System.out.println(card);
        ArrayList<cards> cards = new ArrayList();
        int q;
        for (int i = 52; i > 0; i--) {
            q = (int) (Math.random() * (i - 1 + 1) + 1) - 1;
            cards.add(card.get(q));
            card.remove(q);
        }
        System.out.println(cards);

        /*
        ArrayList<cards> c = shuffleCards(card);
        System.out.println(c.get(1).name);
         */
    }

}
