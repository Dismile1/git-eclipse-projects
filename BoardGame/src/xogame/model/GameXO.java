package xogame.model;

import boardgame.model.Figure;
import boardgame.model.Game;
import boardgame.model.Point;
import xogame.model.players.PlayerO;
import xogame.model.players.PlayerX;

public class GameXO implements Game {
	private final String name;
	private final BoardXO boardXO;
	private final PlayerX playerX;
	private final PlayerO playerO;
	
	public GameXO(final BoardXO boardXO, final PlayerX playerX, final PlayerO playerO) {
		name = Constants.XO_GAME_NAME;
		this.playerX = playerX;
		this.playerO = playerO;
		this.boardXO = boardXO;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	public Figure getFigureO() {
		return playerO.getFigure();
	}
	
	public Figure getFigureX() {
		return playerX.getFigure();
	}
	
	public String getPlayerXName() {
		return playerX.getName();
	}
	
	public void setPlayerXName(final String name) {
		playerX.setName(name);
	}
	
	public String getPlayerOName() {
		return playerO.getName();
	}
	
	public void setPlayerOName(final String name) {
		playerO.setName(name);
	}
	
	public int getBoardHeight() {
		return boardXO.getHeight();
	}
	
	public int getBoardWidth() {
		return boardXO.getWidth();
	}
	
	public Figure getFigureAt(final Point point) {
		return boardXO.getFigureAt(point);
	}
	
	public void setXFigureAt(final Point point) {
		boardXO.setFigureAt(point, playerX.getFigure());
	}
	
	public void setOFigureAt(final Point point) {
		boardXO.setFigureAt(point, playerO.getFigure());
	}
	
	public boolean isFigureSet(final Point point) {
		return boardXO.isFigureSet(point);
	}
	
	public void clearBoard() {
		boardXO.clearBoard();
	}

	
}
