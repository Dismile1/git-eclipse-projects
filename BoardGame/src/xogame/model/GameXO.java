package xogame.model;

import boardgame.model.IGame;
import boardgame.model.Player;
import xogame.model.figures.FigureO;
import xogame.model.figures.FigureX;

public class GameXO implements IGame {
	private final String name;
	private final BoardXO boardXO;
	private final Player player1;
	private final Player player2;
	private final FigureO figureO;
	private final FigureX figureX;
	
	public GameXO(final BoardXO boardXO, final Player player1, final Player player2) {
		name = Constants.XO_GAME_NAME;
		figureX = new FigureX();
		figureO = new FigureO();
		this.player1 = player1;
		this.player2 = player2;
		this.boardXO = boardXO;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	public FigureO getFigureO() {
		return figureO;
	}
	
	public FigureX getFigureX() {
		return figureX;
	}
	
	public Player getPlayer1() {
		return player1;
	}
	
	public Player getPlayer2() {
		return player2;
	}

	public BoardXO getBoardXO() {
		return boardXO;
	}
}
