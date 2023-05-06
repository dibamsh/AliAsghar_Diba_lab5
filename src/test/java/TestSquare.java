import org.junit.Test;
import static org.junit.Assert.*;
import org.example.Square;


public class TestSquare {
    @Test
    public void testComputeArea() {
        Square s = new Square(5);
        assertEquals(25, s.computeArea(), 0);
    }

    @Test
    public void testSetGet() {
        Square s = new Square(5);
        s.setSide(6);
        assertEquals(6, s.getSide(), 0);
    }

    @Test
    public void testComputeArea_afterChanges() {
        Square s = new Square(5);
        s.setSide(6);
        assertEquals(36, s.computeArea(), 0);
    }
}
