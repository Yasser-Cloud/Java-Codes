/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgِassignment3;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 *
 * @author mahmoud
 */
public class StringUtils {
     public static String betterString(String s1, String s2,BiPredicate<String, String> p){
            if (p.test(s1, s2)) {
                return s1;
            }
            return s2;
            }
      public static boolean check(char c){
          return Character.isLetter(c);
      }
     
     public static boolean isOnlyAlphabets(String s1,Predicate<Character> p)
     {
         
         for(int i=0;i<s1.length();i++){
             if(!p.test(s1.charAt(i))) {
              System.out.println(s1);
            return false;
             }
             
         }
              System.out.println(s1);

         return true;
     }
}
