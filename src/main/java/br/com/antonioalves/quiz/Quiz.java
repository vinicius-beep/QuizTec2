/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.antonioalves.quiz;

import javax.swing.JFrame;

/**
 *
 * @author professor
 */
public class Quiz {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        FrmJogo jogo = new FrmJogo();
        jogo.setLocationRelativeTo(jogo);
        jogo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jogo.setVisible(true);
    }
}
