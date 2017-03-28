import java.util.Random;
import java.util.Scanner;
public class ShellGame {
	private int peanut;
	private int wins;
	private int losses;
	private int[] shellNum = {1,2,3};
	Scanner input = new Scanner(System.in);
	
	
	public int UserPrompt(){
		int userChoice;		
				
		//Prompt user to select a choice
		do {		
			System.out.println("Main Menu:\n1) Play the Shell Game" +
			 "\n2) View Play Session Statistics\n3) Exit");
			
			//make sure the input is a number
			while (!input.hasNextInt()) {
				System.out.println("Please Enter A Valid Integer NUMBER Between 1-3!");
				System.out.println("Main Menu:\n1) Play the Shell Game" +
				 "\n2) View Play Session Statistics\n3) Exit");
				input.next(); //advance the scanner for the next input attempt
			}//end inner while loop
					
			userChoice = input.nextInt();	
			
			//inform the user if the number entered is invalid
			if(userChoice<1 || userChoice>3)
				System.out.println("Please Enter A Valid INTEGER Number Between 1-3!");
			
		} while(userChoice<1 || userChoice>3);
			
		return userChoice;
			
	}//close UserPrompt

	
	public void ShowShells(){
		//print out the shells to the console
		System.out.println("    /¯¯¯\\         /¯¯¯\\         /¯¯¯\\   ");
		System.out.println("   /  "+ shellNum[0] + "  \\       /  " + shellNum[1] + 
		 "  \\       " + "/  "+ shellNum[2] + "  \\  ");
		System.out.println("  /       \\     /       \\     /       \\ \n");
	}//close ShowShells
	
	
	public int HidePeanut(){
		int range = 3; //range of random numbers that we want (from 1-3)
		Random r = new Random(); 
		peanut = r.nextInt(range) + 1; //offset random number to be between 1-3
		return peanut;
	}//close HidePeanut
	
	
	public int Guess(){
		int userGuess;
		
		do {
			System.out.print("Guess where the peanut is: ");
				
			//make sure the input is a number
			while (!input.hasNextInt()) {
				System.out.println("Please Enter A Valid Integer NUMBER Between 1-3!");
				System.out.print("Guess where the peanut is: ");
				input.next(); //advance the scanner for the next input attempt
			}//end inner while loop
					
			userGuess = input.nextInt();	
			
			//inform the user if the number entered is invalid
			if(userGuess<1 || userGuess>3)
				System.out.println("Please Enter A Valid INTEGER Number Between 1-3!");
			
		} while(userGuess<1 || userGuess>3);
		
		return userGuess;
	}//close Guess
	
	
	public boolean MatchPeanut(int guess){
		if(peanut==guess){
			wins++;
			System.out.println("\nCongratulations, you win! You guessed right! \n");
			return true;
		}//end if
		else {
			losses++;
			System.out.println();
			System.out.println("\nSorry - you lose, it was under shell " +peanut + "...\n");
			return false;
		}//end else	
	}//close MatchPeanut
	
	public void ShowPeanut(){	
		//create an array of characters to display which shell was the winner
		char[] shellDisplay = {(char)(((int)'0')+shellNum[0]),
		 (char)(((int)'0')+shellNum[1]), (char)(((int)'0')+shellNum[2])};

		//change the shellDisplay array according to which shell had the ball
		if(peanut==shellNum[0])
			shellDisplay[0] = '#';
		else if(peanut==shellNum[1])
				shellDisplay[1] = '#';
			else if(peanut==shellNum[2])
					shellDisplay[2] = '#';
		
		System.out.println("\n    /¯¯¯\\         /¯¯¯\\         /¯¯¯\\   ");
		System.out.println("   /  "+ shellDisplay[0] + "  \\       /  " + shellDisplay[1]
		 + "  \\       "+"/  "+ shellDisplay[2] + "  \\  ");
		System.out.println("  /       \\     /       \\     /       \\ ");
	}//close ShowPeanut

	public void Statistics(int plays){
		double totalPlays= plays; //convert plays input to a double for accurate math operations
		int percentWins = (int)Math.round((wins/totalPlays)*100);
		System.out.println("Play Session Statistics:");
		System.out.println("Games Played: " +(int)totalPlays);
		System.out.println("Games Won: " +wins);
		System.out.println("Games Lost: " +losses);
		System.out.println("You've won " +percentWins +"% of the games.\n");
	}//close Statistics
	
	
	public void ExitProgram () {
		System.out.println("You will now exit the game.");
		System.out.println("Thank you for playing, enjoy the rest of your day!");
		input.close();//close the scanner because we are done using it!
	}
	
}//close class ShellGame
