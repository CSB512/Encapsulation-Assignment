import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {
    public double radius = 5;

    @Test
    public void testArea() {
        Circle newCircle = new Circle();
        assertEquals(78.54, newCircle.Area(radius), 0.5);
    }

   

    @Test
    public void testCircumference() {
        Circle newCircle = new Circle();
        assertEquals(31.42, newCircle.Circumference(radius), 0.5);
    }
}
