/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skobkitesting;

/**
 *
 * @author Alena
 */
public class SkobkiTesting {

    public static void main(String[] args) {
        

    }

    public static boolean countSkobki(String str) {
        int flag = 0;
        int item = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == ')')
                    || (str.charAt(str.length() - 1) == '(')) {
                System.out.println(" Ошибка!Первая/последняя неверная скобка");
                flag = 1;
            }
            break;
        }

        // анализ количества скобок
        if (flag == 0) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(') {
                    item++;
                }
                if (str.charAt(i) == ')') {
                    item--;
                }
            }
        }
         // вывод результата
         if (item==0){ System.out.println("OK");}
         else { System.out.println("NO OK");}

         return (item == 0 && flag == 0);
        
     
       
   }

    
    
    
    
}
