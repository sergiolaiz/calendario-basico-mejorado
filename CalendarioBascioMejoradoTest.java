

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CalendarioBascioMejoradoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CalendarioBascioMejoradoTest
{
    /**
     * Default constructor for test class CalendarioBascioMejoradoTest
     */
    public CalendarioBascioMejoradoTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testCalendarioBasicoMejorado()
    {
        CalendarioBascioMejorado calendar1 = new CalendarioBascioMejorado();
        assertEquals("01-01-01", calendar1.obtenerFecha());
        calendar1.avanzaFecha();
        assertEquals("02-01-01", calendar1.obtenerFecha());
        calendar1.setCalendario(30, 1, 1);
        calendar1.avanzaFecha();
        assertEquals("01-02-01", calendar1.obtenerFecha());
        calendar1.setCalendario(30, 12, 1);
        calendar1.avanzaFecha();
        assertEquals("01-01-02", calendar1.obtenerFecha());
    }
}

