package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class BishopBlackTest {

    @Test
    public void isPosition() {
        Figure figure = new BishopBlack(Cell.A1);
        assertThat(figure.position(), is(Cell.A1));
    }

    @Test
    public void way() {
        Figure figure = new BishopBlack(Cell.A1);
        Cell[] extended = new Cell[]{Cell.B2, Cell.C3, Cell.D4};
        assertThat(figure.way(Cell.D4), is(extended));
    }

    @Test
    public void copy() {
        Figure figure = new BishopBlack(Cell.A2);
        assertThat(figure.copy(Cell.A2).position(), is(Cell.A2));
    }
}