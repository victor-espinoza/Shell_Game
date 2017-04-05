# Shell_Game
Overview:
   This program implements to popular shell game where a ball is hidden under a random cup and the user tries to guess which cup is hiding the ball.
   The logic for this program is very simple and straightforward. At the start of the game, a random number between 1-3 is generated to determine which cup the peanut will be hidden under. The user then guesses which cup has the peanut under it. After the user input is received, I then compare the user's guess to the cup number that the peanut is hidden under. If those numbers match, then the user guessed correctly and they are notified that they won. If this was not the case, then the user has guessed incorrectly and I notify them that they have lost. The user can then choose to play a new Shell Game game, view their playing session statistics, or exit the program. That is the gist of how this program works. 

Dependencies:
This program was implemented using the Eclipse SDK Version: 4.2.0


Sample Output:

Main Menu:
1) Play the Shell Game
2) View Play Session Statistics
3) Exit
1
    /¯¯¯\         /¯¯¯\         /¯¯¯\   
   /  1  \       /  2  \       /  3  \  
  /       \     /       \     /       \ 

Guess where the peanut is: fasd
Please Enter A Valid Integer NUMBER Between 1-3!
Guess where the peanut is: 12
Please Enter A Valid INTEGER Number Between 1-3!
Guess where the peanut is: -1
Please Enter A Valid INTEGER Number Between 1-3!
Guess where the peanut is: 1

    /¯¯¯\         /¯¯¯\         /¯¯¯\   
   /  #  \       /  2  \       /  3  \  
  /       \     /       \     /       \ 

Congratulations, you win! You guessed right! 

Main Menu:
1) Play the Shell Game
2) View Play Session Statistics
3) Exit
1
    /¯¯¯\         /¯¯¯\         /¯¯¯\   
   /  1  \       /  2  \       /  3  \  
  /       \     /       \     /       \ 

Guess where the peanut is: 1

    /¯¯¯\         /¯¯¯\         /¯¯¯\   
   /  1  \       /  2  \       /  #  \  
  /       \     /       \     /       \ 


Sorry - you lose, it was under shell 3...

Main Menu:
1) Play the Shell Game
2) View Play Session Statistics
3) Exit
1
    /¯¯¯\         /¯¯¯\         /¯¯¯\   
   /  1  \       /  2  \       /  3  \  
  /       \     /       \     /       \ 

Guess where the peanut is: 3

    /¯¯¯\         /¯¯¯\         /¯¯¯\   
   /  1  \       /  #  \       /  3  \  
  /       \     /       \     /       \ 


Sorry - you lose, it was under shell 2...

Main Menu:
1) Play the Shell Game
2) View Play Session Statistics
3) Exit
1
    /¯¯¯\         /¯¯¯\         /¯¯¯\   
   /  1  \       /  2  \       /  3  \  
  /       \     /       \     /       \ 

Guess where the peanut is: 2

    /¯¯¯\         /¯¯¯\         /¯¯¯\   
   /  1  \       /  #  \       /  3  \  
  /       \     /       \     /       \ 

Congratulations, you win! You guessed right! 

Main Menu:
1) Play the Shell Game
2) View Play Session Statistics
3) Exit
2
Play Session Statistics:
Games Played: 4
Games Won: 2
Games Lost: 2
You've won 50% of the games.

Main Menu:
1) Play the Shell Game
2) View Play Session Statistics
3) Exit
3
You will now exit the game.
Thank you for playing, enjoy the rest of your day!

