package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.QueenBlack;
import ru.job4j.chess.firuges.white.QueenWhite;

public class LogicTest {

    @Ignore
    @Test
    public void move()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.H6);
    }

    @Test (expected = FigureNotFoundException.class)
    public void whenException1() throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.findBy(Cell.E3);
    }
    @Test (expected = OccupiedCellException.class)
        public void whenException2() throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException  {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new QueenWhite(Cell.E3));
        logic.move(Cell.C1, Cell.G5);
        }
        @Test (expected = java.lang.IllegalStateException.class)
    public void whenException3() throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.E4);
        }
    }
