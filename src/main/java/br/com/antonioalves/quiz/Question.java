/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.antonioalves.quiz;

/**
 *
 * @author professor
 */
public class Question {
    private String question;// a pergunta
    private String[] answers;//array das respostas
    private int correctAnswer;// indice da resposta correta
    
    public Question(String question, String[] list, int correctIndex){
        this.question = question;
        this.answers = list;
        this.correctAnswer = correctIndex;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getAnswers() {
        return answers;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }
    
    
}
