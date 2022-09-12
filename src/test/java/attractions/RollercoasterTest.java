package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10, 12.00);
        visitor = new Visitor(18, 201, 30);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void chargesForRide(){
        assertEquals(12.00, rollerCoaster.getPrice(), 0.0);
    }

    @Test
    public void chargesDoubleForTallCunts(){
        assertEquals(24.00, rollerCoaster.priceFor(visitor), 0.0);
    }
}
