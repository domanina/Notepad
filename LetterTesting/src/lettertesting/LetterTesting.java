/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lettertesting;

/**
 *
 * @author Alena
 */
public class LetterTesting {
    //private static Object str;

    public static void main(String[] args) {
     

    }
// буувы
    
    public static int coutntLetter(String str) {
        int symbol = 0;
        for (int i = 0; i < str.length(); i++) {

            if (Character.isAlphabetic(str.charAt(i)) == true) {
                symbol++;
            }
        }
        System.out.println("Число букв= " + symbol);
        return symbol;
    }
// слова
    public static int countWord(String str) {

        int word = 0;
        for (int i = 1; i < str.length(); i++) {
            if ((Character.isLetterOrDigit(str.charAt(i)) == true)
                    && (Character.isLetterOrDigit(str.charAt(i - 1)) == false)) {
                word++;
            }
        }
        if (Character.isLetterOrDigit(str.charAt(0))) {
            word=word+1;
        } 
        
        System.out.println("Число слов= " + word);
        return word;
    }
}
