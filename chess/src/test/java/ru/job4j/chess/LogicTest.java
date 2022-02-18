package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    @Test(expected = OccupiedCellException.class)
    public void whenOccupied()
            throws OccupiedCellException, FigureNotFoundException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.H2));
        logic.add(new BishopBlack(Cell.G3));
        logic.move(Cell.H2, Cell.G3);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenImpossible()
            throws OccupiedCellException, FigureNotFoundException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.H2));
        logic.move(Cell.H2, Cell.H3);
    }

    @Test(expected = FigureNotFoundException.class)
    public void whenFigureNotFound()
            throws OccupiedCellException, FigureNotFoundException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.move(Cell.H2, Cell.H3);
    }
}