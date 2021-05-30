/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.joinerytablesaw;

import java.io.IOException;
import joinery.DataFrame;

/**
 *
 * @author mahmoud
 */
public class Joinery {
    public static void main(String[] args){
         
        try{
        DataFrame<Object>  df= DataFrame.readCsv ("src/main/resources/data/titanic.csv");
        System.out.println(df.describe());
        System.out.println(df.head(5));
           
        DataFrame<Object>  table1 = df.retain("pclass","survived","age");
          System.out.println(table1.head());
          
          DataFrame<Object>  table2 = df.retain("ticket","fare","cabin","embarked");
          System.out.println(table2.head(5));
          
       
        System.out.println(table1.join(table2));
        table1= table1.add(df.col("embarked"));
      
        System.out.println(table1.head(5));
       
       
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
