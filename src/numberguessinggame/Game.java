
package numberguessinggame;
import java.util.*;

class Game{
    int number;
    int inputNumber;
    int noOfGuesses = 0;
    Game(){
        Random random = new Random();
        this.number = random.nextInt(200);
    }
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    
    public void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.println("Congratulations!! you guessed it right, it was "+ number);
            System.out.println("You guessed it in " + noOfGuesses + " attempts");
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Guessed number is low");
        }
        else if(inputNumber>number){
            System.out.println("Guessed number is high");
        }
        return false;
    }

}