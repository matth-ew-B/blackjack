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
public class cards {
    protected String name;
    protected String suit;
    protected int num;
    public cards(int sut,int nm){
        num = nm;
        String sNum;
        sNum = num+"";
        switch(sut){
            case 0:
                suit = "clubs";
                break;
            case 1:
                suit = "spades";
                break;
            case 2:
                suit = "diamonds";
                break;
            case 3:
                suit = "hearts"; 
                break;
        }
        switch (num){
            case 1:
                sNum = "ace";
                break;
            case 11:
                sNum = "jack";
                break;
            case 12:
                sNum = "queen";
                break;
            case 13:
                sNum = "king";
                break;
        }
            
       name = sNum + " of "+suit;
    }
}
