package cylinderTest;

import cylinder.Cylinder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CylinderTest {
    Cylinder cylinder;

    @BeforeEach
    public void setUp(){
        cylinder = new Cylinder();
    }

    @Test
    public void testRadiusIsSet() {
        cylinder.setRadius(7);
        assertEquals(7, cylinder.getRadius());
    }

    @Test
    public void testHeightIsSet() {
        cylinder.setHeight(5.4);
        assertEquals(5.4, cylinder.getHeight());
    }

    @Test
    public void testCalculatedVolume() {
        cylinder.setRadius(7);
        assertEquals(7, cylinder.getRadius());
        cylinder.setHeight(5.4);
        assertEquals(5.4, cylinder.getHeight());

        assertEquals("831.27", String.format("%.2f",cylinder.getVolume()));
    }

    @Test
    public void testRadiusIsNegative() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> cylinder.setRadius(-1));
        assertEquals("Radius cannot be negative", e.getMessage());
    }
    @Test
    public void testHeightIsNegative() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> cylinder.setHeight(-5));
        assertEquals("Height cannot be negative", e.getMessage());
    }
}
