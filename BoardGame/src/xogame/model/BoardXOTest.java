package xogame.model;

import static org.junit.Assert.*;

import org.junit.Test;

import xogame.model.figures.FigureO;
import xogame.model.figures.FigureX;

public class BoardXOTest {
	final int height = 4;
	final int width = 5;
	final FigureX figureX = new FigureX();
	final FigureO figureO = new FigureO();
	
	@Test
	public void testBoardXO() {
		BoardXO boardXO = new BoardXO();
		assertNotNull(boardXO);
		assertEquals(Constants.DEFAULT_BOARD_SIZE, boardXO.getHeight());
		assertEquals(Constants.DEFAULT_BOARD_SIZE, boardXO.getWidth());
		for(int i = 0; i < boardXO.getHeight(); i++) {
			for(int j = 0; j < boardXO.getWidth(); j++) {
				assertNull(boardXO.getFigureAt(i, j));
			}
		}
	}

	@Test
	public void testBoardXOIntInt() {
		BoardXO boardXO = new BoardXO(height, width);
		assertNotNull(boardXO);
		assertEquals(height, boardXO.getHeight());
		assertEquals(width, boardXO.getWidth());
		for(int i = 0; i < boardXO.getHeight(); i++) {
			for(int j = 0; j < boardXO.getWidth(); j++) {
				assertNull(boardXO.getFigureAt(i, j));
			}
		}
	}

	@Test
	public void testGetHeight() {
		BoardXO boardXO = new BoardXO(height, width);
		assertEquals(height, boardXO.getHeight());
	}

	@Test
	public void testGetWidth() {
		BoardXO boardXO = new BoardXO(height, width);
		assertEquals(width, boardXO.getWidth());
	}

	@Test
	public void testGetSetFigureAt() {
		BoardXO boardXO = new BoardXO();
		boardXO.setFigureAt(0, 0, figureX);
		boardXO.setFigureAt(0, 1, figureX);
		boardXO.setFigureAt(0, 2, figureX);
		boardXO.setFigureAt(1, 0, figureX);
		boardXO.setFigureAt(1, 1, figureX);
		boardXO.setFigureAt(1, 2, figureX);
		boardXO.setFigureAt(2, 0, figureX);
		boardXO.setFigureAt(2, 1, figureX);
		boardXO.setFigureAt(2, 2, figureX);
		
		assertEquals(figureX, boardXO.getFigureAt(0, 0));
		assertEquals(figureX, boardXO.getFigureAt(0, 1));
		assertEquals(figureX, boardXO.getFigureAt(0, 2));
		assertEquals(figureX, boardXO.getFigureAt(1, 0));
		assertEquals(figureX, boardXO.getFigureAt(1, 1));
		assertEquals(figureX, boardXO.getFigureAt(1, 2));
		assertEquals(figureX, boardXO.getFigureAt(2, 0));
		assertEquals(figureX, boardXO.getFigureAt(2, 1));
		assertEquals(figureX, boardXO.getFigureAt(2, 2));
		
		boardXO.setFigureAt(0, 0, figureO);
		boardXO.setFigureAt(0, 1, figureO);
		boardXO.setFigureAt(0, 2, figureO);
		boardXO.setFigureAt(1, 0, figureO);
		boardXO.setFigureAt(1, 1, figureO);
		boardXO.setFigureAt(1, 2, figureO);
		boardXO.setFigureAt(2, 0, figureO);
		boardXO.setFigureAt(2, 1, figureO);
		boardXO.setFigureAt(2, 2, figureO);
		

		assertEquals(figureO, boardXO.getFigureAt(0, 0));
		assertEquals(figureO, boardXO.getFigureAt(0, 1));
		assertEquals(figureO, boardXO.getFigureAt(0, 2));
		assertEquals(figureO, boardXO.getFigureAt(1, 0));
		assertEquals(figureO, boardXO.getFigureAt(1, 1));
		assertEquals(figureO, boardXO.getFigureAt(1, 2));
		assertEquals(figureO, boardXO.getFigureAt(2, 0));
		assertEquals(figureO, boardXO.getFigureAt(2, 1));
		assertEquals(figureO, boardXO.getFigureAt(2, 2));
		
	}


	@Test
	public void testIsFigureSet() {
		BoardXO boardXO = new BoardXO();
		
		assertFalse(boardXO.isFigureSet(0, 0));
		assertFalse(boardXO.isFigureSet(0, 1));
		assertFalse(boardXO.isFigureSet(0, 2));
		assertFalse(boardXO.isFigureSet(1, 0));
		assertFalse(boardXO.isFigureSet(1, 1));
		assertFalse(boardXO.isFigureSet(1, 2));
		assertFalse(boardXO.isFigureSet(2, 0));
		assertFalse(boardXO.isFigureSet(2, 1));
		assertFalse(boardXO.isFigureSet(2, 2));
		
		boardXO.setFigureAt(0, 0, figureX);
		boardXO.setFigureAt(0, 1, figureX);
		boardXO.setFigureAt(0, 2, figureX);
		boardXO.setFigureAt(1, 0, figureX);
		boardXO.setFigureAt(1, 1, figureX);
		boardXO.setFigureAt(1, 2, figureX);
		boardXO.setFigureAt(2, 0, figureX);
		boardXO.setFigureAt(2, 1, figureX);
		boardXO.setFigureAt(2, 2, figureX);
		
		assertTrue(boardXO.isFigureSet(0, 0));
		assertTrue(boardXO.isFigureSet(0, 1));
		assertTrue(boardXO.isFigureSet(0, 2));
		assertTrue(boardXO.isFigureSet(1, 0));
		assertTrue(boardXO.isFigureSet(1, 1));
		assertTrue(boardXO.isFigureSet(1, 2));
		assertTrue(boardXO.isFigureSet(2, 0));
		assertTrue(boardXO.isFigureSet(2, 1));
		assertTrue(boardXO.isFigureSet(2, 2));
	}
	
	@Test
	public void testClearBoard() {
		BoardXO boardXO = new BoardXO();
		
		assertFalse(boardXO.isFigureSet(0, 0));
		assertFalse(boardXO.isFigureSet(0, 1));
		assertFalse(boardXO.isFigureSet(0, 2));
		assertFalse(boardXO.isFigureSet(1, 0));
		assertFalse(boardXO.isFigureSet(1, 1));
		assertFalse(boardXO.isFigureSet(1, 2));
		assertFalse(boardXO.isFigureSet(2, 0));
		assertFalse(boardXO.isFigureSet(2, 1));
		assertFalse(boardXO.isFigureSet(2, 2));
		
		boardXO.setFigureAt(0, 0, figureX);
		boardXO.setFigureAt(0, 1, figureX);
		boardXO.setFigureAt(0, 2, figureX);
		boardXO.setFigureAt(1, 0, figureX);
		boardXO.setFigureAt(1, 1, figureX);
		boardXO.setFigureAt(1, 2, figureX);
		boardXO.setFigureAt(2, 0, figureX);
		boardXO.setFigureAt(2, 1, figureX);
		boardXO.setFigureAt(2, 2, figureX);
		
		assertTrue(boardXO.isFigureSet(0, 0));
		assertTrue(boardXO.isFigureSet(0, 1));
		assertTrue(boardXO.isFigureSet(0, 2));
		assertTrue(boardXO.isFigureSet(1, 0));
		assertTrue(boardXO.isFigureSet(1, 1));
		assertTrue(boardXO.isFigureSet(1, 2));
		assertTrue(boardXO.isFigureSet(2, 0));
		assertTrue(boardXO.isFigureSet(2, 1));
		assertTrue(boardXO.isFigureSet(2, 2));
		
		boardXO.clearBoard();
		
		assertFalse(boardXO.isFigureSet(0, 0));
		assertFalse(boardXO.isFigureSet(0, 1));
		assertFalse(boardXO.isFigureSet(0, 2));
		assertFalse(boardXO.isFigureSet(1, 0));
		assertFalse(boardXO.isFigureSet(1, 1));
		assertFalse(boardXO.isFigureSet(1, 2));
		assertFalse(boardXO.isFigureSet(2, 0));
		assertFalse(boardXO.isFigureSet(2, 1));
		assertFalse(boardXO.isFigureSet(2, 2));
		
		boardXO.setFigureAt(0, 0, figureO);
		boardXO.setFigureAt(0, 1, figureO);
		boardXO.setFigureAt(0, 2, figureO);
		boardXO.setFigureAt(1, 0, figureO);
		boardXO.setFigureAt(1, 1, figureO);
		boardXO.setFigureAt(1, 2, figureO);
		boardXO.setFigureAt(2, 0, figureO);
		boardXO.setFigureAt(2, 1, figureO);
		boardXO.setFigureAt(2, 2, figureO);
		
		assertTrue(boardXO.isFigureSet(0, 0));
		assertTrue(boardXO.isFigureSet(0, 1));
		assertTrue(boardXO.isFigureSet(0, 2));
		assertTrue(boardXO.isFigureSet(1, 0));
		assertTrue(boardXO.isFigureSet(1, 1));
		assertTrue(boardXO.isFigureSet(1, 2));
		assertTrue(boardXO.isFigureSet(2, 0));
		assertTrue(boardXO.isFigureSet(2, 1));
		assertTrue(boardXO.isFigureSet(2, 2));
		
		boardXO.clearBoard();
		
		assertFalse(boardXO.isFigureSet(0, 0));
		assertFalse(boardXO.isFigureSet(0, 1));
		assertFalse(boardXO.isFigureSet(0, 2));
		assertFalse(boardXO.isFigureSet(1, 0));
		assertFalse(boardXO.isFigureSet(1, 1));
		assertFalse(boardXO.isFigureSet(1, 2));
		assertFalse(boardXO.isFigureSet(2, 0));
		assertFalse(boardXO.isFigureSet(2, 1));
		assertFalse(boardXO.isFigureSet(2, 2));
	}

}
