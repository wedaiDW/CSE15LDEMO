import org.junit.*;
import static org.junit.Assert.*;
public class AppTest {
    public App ts;
    public static int[] TESTARR = {46,2,3,4,5,6,7,11,9};
    @Before
    public void setup(){
        ts = new App();
    }
    @Test
    public void testsum(){
        assertEquals(4,ts.sum(TESTARR, 10)[0]);
        assertEquals(6,ts.sum(TESTARR, 10)[1]);
    }
}
