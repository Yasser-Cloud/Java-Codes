/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgِassignment3;


/**
 *
 * @author mahmoud
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String s1="123456";
        String s2="123456789";
     String longer= StringUtils.betterString(s1, s2, (s11,s22)-> s11.length() > s22.length());
        
    
    System.out.println(longer);
     System.out.println(StringUtils.isOnlyAlphabets(s1,StringUtils::check ));
     
    
    }


    }
            
    
