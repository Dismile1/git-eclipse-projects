package xogame.model.players;

import boardgame.model.Figure;
import boardgame.model.Player;
import xogame.model.figures.FigureX;

public class PlayerX extends Player {
	Figure figure;
	
	public PlayerX(final String name) {
		super(name);
		figure = new FigureX();
	}
	
	public Figure getFigure() {
		return figure;
	}
}
