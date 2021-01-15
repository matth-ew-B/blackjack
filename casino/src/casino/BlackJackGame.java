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
            BufferedWriter bw =new BufferedWriter(myWriter);
            bw.write(newMone);
            bw.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

}
