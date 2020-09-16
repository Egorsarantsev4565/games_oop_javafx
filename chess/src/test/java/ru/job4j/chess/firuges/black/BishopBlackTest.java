package ru.job4j.chess.firuges.black;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;



public class BishopBlackTest {

    @Test
    public void whenPosition() {
        BishopBlack bishopblack = new BishopBlack(Cell.H3);
        assertThat(bishopblack.position(), is(Cell.H3));
    }
    @Test
    public void whenCopy() {
        BishopBlack bishopblack = new BishopBlack(Cell.H6);
        assertThat(bishopblack.position(), is(Cell.H6));
    }
@Test
    public void whenWay() {
    BishopBlack bishopBlack = new BishopBlack(Cell.C1);
    Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
    Cell[] values = bishopBlack.way(bishopBlack.position(),Cell.G5);
  assertArrayEquals(expected, values);

}
}