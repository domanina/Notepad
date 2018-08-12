/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skobkitesting;

import junit.framework.TestCase;
import static skobkitesting.SkobkiTesting.countSkobki;

/**
 *
 * @author Alena
 */
public class SkobkiTestingTest extends TestCase {
    
    public SkobkiTestingTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of main method, of class SkobkiTesting.
     */
    public void testcountSkobki() {
        
       SkobkiTesting st= new SkobkiTesting();
      
       assertTrue(SkobkiTesting.countSkobki("( )"));
       assertFalse(SkobkiTesting.countSkobki("(())()()("));
       assertFalse(SkobkiTesting.countSkobki(")(())()()"));
       assertTrue(SkobkiTesting.countSkobki(" "));
    }
    
}
