package boardgame.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class CellTest {
	IFigure figure = new IFigure() {	
		@Override
		public String getName() {
			return "figure";
		}
	};
	
	@Test
	public void testCell() {
		Cell cell = new Cell();
		assertNotNull(cell);
	}

	@Test
	public void testCellIFigure() {
		Cell cell = new Cell(figure);
		assertNotNull(cell);
		assertNotNull(cell.getFigure());
	}

	@Test
	public void testGetFigure() {
		Cell cell = new Cell(figure);
		assertEquals(figure, cell.getFigure());
	}

	@Test
	public void testSetFigure() {
		Cell cell = new Cell();
		assertFalse(cell.isSet());
		cell.setFigure(figure);
		assertTrue(cell.isSet());
		assertEquals(figure, cell.getFigure());
	}

	@Test
	public void testIsSet() {
		Cell cellSet = new Cell(figure);
		assertTrue(cellSet.isSet());
		Cell cellNotSet = new Cell();
		assertFalse(cellNotSet.isSet());
	}

}
