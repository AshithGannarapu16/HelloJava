package TicTacToe;

import TicTacToe.Controllers.GameController;
import TicTacToe.Models.*;
import TicTacToe.Strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        List<Player> playersList = new ArrayList<>();
        playersList.add(new Human(1L,"Ashith",new Symbol('X'),"Achu"));
        playersList.add(new Bot(2L,"JADDU",new Symbol('0'),BotDifficultyLevel.EASY));

        int size=3;
        List<WinningStrategy> winningStrategies = new ArrayList<>();
//        Game game=gameController.startGame(playersList,winningStrategies,size);



        Game game =gameController.startGame(playersList,dsfwinningStrategies,size);


        while (gameController.getGameState().equals(GameState.IN_PROGREES)) {
            gameController.displayBoard();
            gameController.makeMove();




            if(gameController.getGameState().equals(GameState.SUCCESS)) {
                System.out.println("Winner is "+gameController.getWinner().getName());
            }
            else if(gameController.getGameState().equals(GameState.DRAW)){
                System.out.println("Game has ended is Draw");

            }




        }


    }
}
