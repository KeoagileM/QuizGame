/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rc;

/**
 *
 * @author RC_Student_lab
 */
import java.util.ArrayList;
import java.util.Scanner;

public class QuizGames {
    private ArrayList<Question> questions;
    private int score;

    public QuizGames() {
        questions = new ArrayList<>();
        score = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        for (Question question : questions) {
            System.out.println(question.getQuestion());
            System.out.println("A) " + question.getOptionA());
            System.out.println("B) " + question.getOptionB());
            System.out.println("C) " + question.getOptionC());
            System.out.println("D) " + question.getOptionD());
            System.out.print("Enter your answer: ");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase(question.getCorrectAnswer())) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. The correct answer is " + question.getCorrectAnswer());
            }
        }
        System.out.println("Game over! Your final score is " + score + "/" + questions.size());
    }
}
