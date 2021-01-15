/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casino;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author matth
 */
public class BlackJackGame {

    DecimalFormat df = new DecimalFormat("$#,###.00");
    player user = new player();

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
        for (int i = 0; i < card.size(); i++) {
            System.out.println((card.get(i)).name);
        }
        changeMoney(600);
    }

    public static int findMoney() {
        int currentMoney = 0;
        try {
            FileReader fr = new FileReader("src//casino//userMoney.txt");
            BufferedReader br = new BufferedReader(fr);
            currentMoney = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
        return currentMoney;
    }

    public static void changeMoney(int newMone) {
        try {
            FileWriter myWriter = new FileWriter("src//casino//userMoney.txt");
            BufferedWriter bw = new BufferedWriter(myWriter);
            bw.write(newMone + "");
            bw.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    //Determines if an ace has been drawn with a value of 11
    //In order to change the value to a 1
    static boolean ace;

    //Points that determine whether the player wins or loses with their hand
    static int handTotal = 0;

    //Points that determine whether the player wins or loses with their hand
    static int botTotal = 0;

    //Array that holds all the cards
    //Represents the deck
    static ArrayList<cards> deck = new ArrayList();

    /**
     * Creates a new deck by calling upon the constructor class for cards And
     * then putting them into an array
     */
    public static void newDeck() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                deck.add(new cards(i, j + 1));
            }
        }

    }

    /**
     * Draws a random card from the deck and adds points based on the value of
     * the card
     *
     * @param points the total points for the player's/bots hand that will be
     * modified in the method
     * @return
     */
    public static int drawCard(int points) {
        //If the deck is empty, it resets it by calling upon the newDeck method
        if (deck.isEmpty()) {
            newDeck();
        }

        //removes and stores the card from a random index of the array
        int rand = (int) (Math.random() * (deck.size()));
        cards draw = deck.get(rand);
        deck.remove(rand);

        //Assigns the value of the card
        if (draw.num > 1 && draw.num < 11) {
            points += draw.num;
        } else if (draw.num >= 11) {
            points += 10;
        } else {
            if (points > 10) {
                points += 1;
            } else {
                points += 11;
                ace = true;
            }
        }
        return (points);
    }

    //Non player turn
    public static void botTurn() {
        while (botTotal < 17) {
            botTotal = drawCard(botTotal);
        }
    }

}
