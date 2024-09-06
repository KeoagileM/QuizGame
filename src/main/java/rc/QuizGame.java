/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rc;

/**
 *
 * @author RC_Student_lab
 */
public class QuizGame {
    public static void main(String[] args) {
        QuizGames game = new QuizGames();
        game.addQuestion(new Question("What is the capital of France?", "A) Berlin", "B) Paris", "C) London", "D) Rome", "B"));
        game.addQuestion(new Question("What is the largest planet in our solar system?", "A) Earth", "B) Saturn", "C) Jupiter", "D) Uranus", "C"));
        game.addQuestion(new Question("Who painted the Mona Lisa?", "A) Leonardo da Vinci", "B) Michelangelo", "C) Raphael", "D) Caravaggio", "A"));
        game.play();
    }
}
