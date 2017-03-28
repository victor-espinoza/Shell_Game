/*Program #3 - Shell Game Simulator
Victor Espinoza
CECS 174
Spring 2013
Due: March 13, 2013
 */
public class shellGameSimulator {

   /**
    * @param args
    */
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int guess;
      ShellGame game = new ShellGame(); //create an instance of the ShellGame Class
      int userResponse = game.UserPrompt(); //prompt the user for what they want to do
      int totalGames = 0; //initialize the totalGames played to 0.

      while(userResponse !=3){
         switch (userResponse) {
            //user chose to play the game
            case 1: game.ShowShells();
               game.HidePeanut();
               guess = game.Guess();
               game.ShowPeanut();
               game.MatchPeanut(guess);
               totalGames++;
               userResponse= game.UserPrompt();
               break;
            //user chose to view the play session statistics
            case 2: game.Statistics(totalGames);
               userResponse= game.UserPrompt();
               break;
            //default case statement
            default: System.out.println("Default case reached.");
            break;			
         }//end switch
      }//end while

      //user chose to exit the program.
      game.ExitProgram();

   }//close main

}//close class shellGameSimulator
