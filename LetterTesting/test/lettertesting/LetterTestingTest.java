/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lettertesting;

//import junit.framework.TestCase;
import static lettertesting.LetterTesting.countWord;
import static lettertesting.LetterTesting.coutntLetter;

/**
 *
 * @author Alena
 */
public class LetterTestingTest extends TestCase {
    
    public LetterTestingTest(String testName) {
        super(testName);
    }
  
    public void testcountLetter() {
       LetterTesting lt= new LetterTesting();
       
        assertEquals(6,coutntLetter("ggg uuu"));
        assertEquals(7,coutntLetter(" gggp uuu"));
        assertEquals(6,coutntLetter("  ggg   uuu  "));
        assertEquals(6,coutntLetter("/ ggg uuu"));
       
        assertEquals(2,countWord("ggg uuu"));
        assertEquals(1,countWord("gggpuuu"));
        assertEquals(1,countWord("ggg"));
        assertEquals(1,countWord("gg"));
    }

    private void assertEquals(int i, int coutntLetter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
