package xogame.model.players;

import boardgame.model.Figure;
import boardgame.model.Player;
import xogame.model.figures.FigureO;

public class PlayerO extends Player {
	Figure figure;
	
	public PlayerO(final String name) {
		super(name);
		figure = new FigureO();
	}
	
	public Figure getFigure() {
		return figure;
	}
}
