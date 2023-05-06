import org.junit.Test;
import static org.junit.Assert.*;
import org.example.Rectangle;

public class TestRectangle {
    @Test
    public void testComputeArea() {
        Rectangle r = new Rectangle(3, 4);
        assertEquals(12, r.computeArea(), 0);
    }

    @Test
    public void testSetGet() {
        Rectangle r = new Rectangle(3, 4);
        r.setWidth(5);
        r.setHeight(6);
        assertEquals(5, r.getWidth(), 0);
        assertEquals(6, r.getHeight(), 0);
    }
}

