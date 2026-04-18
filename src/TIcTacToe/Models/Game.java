package TicTacToe.Models;

import TicTacToe.Strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;

    private List<Player> players;

    private  Integer nextPlayerIndex;

    private GameState gameState;

    private List<Move> moves;

    private List<WinningStrategy> winningStrategies;

    private Player winner;

    public Game(List<Player> players, List<WinningStrategy> winningStrategies ,int boardSize) {
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.winner = null;
        this.gameState = GameState.IN_PROGREES;
        this.moves = new ArrayList<>();
        this.nextPlayerIndex = 0;
        this.board = new Board(boardSize);
    }



    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Integer getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(Integer nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategy) {
        this.winningStrategies = winningStrategy;
    }
}

