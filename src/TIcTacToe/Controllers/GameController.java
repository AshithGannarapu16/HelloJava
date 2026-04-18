package TicTacToe.Controllers;

//CRUD -- create read update delete

import TicTacToe.Models.Cell;
import TicTacToe.Models.Game;
import TicTacToe.Models.GameState;
import TicTacToe.Models.Player;
import TicTacToe.Strategies.WinningStrategy;

public class GameController {

    public Game startGame(List<Player> players,List<WinningStrategy> winningStrategies, int boardSize) {
        Game game=new Game(players,winningStrategies,boardSize);
        return game;

    }

    public void  displayBoard() {
    }


    public GameState getGameState() {
        return null;
    }


    public void undo(){

    }

    public Player getWinner() {
        return null;
    }

    public void makeMove() {

    }



}
