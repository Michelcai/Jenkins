package fr.esipe.ic.jeuxplusmoins;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
   
     public void testPlus()
    {
        GameEngine g = new GameEngine(new NbAleatoireService2(10));
        int nb = 5;
        String res = g.plusoumoins(nb);
        assertEquals(res,"+");
    }
    
    public void testMoins()
    {
        GameEngine g = new GameEngine(new NbAleatoireService2(5));
        int nb = 10;
        String res = g.plusoumoins(nb);
        assertEquals(res,"-");
    }
    
    public void testParfait()
    {
        GameEngine g = new GameEngine(new NbAleatoireService2(10));
        int nb = 10;
        String res = g.plusoumoins(nb);
        assertEquals(res,"Gagné");
    }
}
