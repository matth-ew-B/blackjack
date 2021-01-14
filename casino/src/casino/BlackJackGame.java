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
                card.add( new cards(i,j+1));
                
            }
        }
        for (int i = 0; i < card.size(); i++) {
            System.out.println((card.get(i)).name);
        }
    }
 
    
}
