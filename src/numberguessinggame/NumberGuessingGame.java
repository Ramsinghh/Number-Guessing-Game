
package numberguessinggame;

public class NumberGuessingGame {

    public static void main(String[] args) {
        System.out.println("HINT: number is in between 0 to 200");
        Game game = new Game();
        boolean b= false;
        while(!b){
        game.takeUserInput();
        b = game.isCorrectNumber();
        }
    }
    
}
