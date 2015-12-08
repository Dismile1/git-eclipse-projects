package xogame.model;

import boardgame.model.Figure;
import boardgame.model.Game;
import boardgame.model.Player;
import xogame.model.figures.FigureO;
import xogame.model.figures.FigureX;

public class GameXO implements Game {
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
	
	public String getPlayer1Name() {
		return player1.getName();
	}
	
	public void setPlayer1Name(final String name) {
		player1.setName(name);
	}
	
	public String getPlayer2Name() {
		return player2.getName();
	}
	
	public void setPlayer2Name(final String name) {
		player2.setName(name);
	}
	
	public Figure getFigureAt(int rowNum, int colNum) {
		return boardXO.getFigureAt(rowNum, colNum);
	}
	
	public void setFigureAt(int rowNum, int colNum, final Figure figure) {
		boardXO.setFigureAt(rowNum, colNum, figure);
		
	}
	
	public boolean isFigureSet(int rowNum, int colNum) {
		return boardXO.isFigureSet(rowNum, colNum);
	}

	
}
