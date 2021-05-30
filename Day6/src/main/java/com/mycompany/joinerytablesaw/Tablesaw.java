/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.joinerytablesaw;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import tech.tablesaw.api.DateColumn;
import tech.tablesaw.api.IntColumn;
import tech.tablesaw.api.Table;

/**
 *
 * @author mahmoud
 */
public class Tablesaw {
      public static void main(String[] args){
     
     String dataPath = "src/main/resources/data/titanic.csv";
   
        try{
       
         Table titanicData = Table.read ().csv(dataPath);
        System.out.println(titanicData.first(6));
          System.out.println(titanicData.summary());
            System.out.println(titanicData.structure());
            
         Table table1= titanicData.select("name","age");
          System.out.println(table1.first(7));
         
          Table table2 = titanicData.select("parch","ticket","fare","cabin","name");
          System.out.println(table2.first(7));
         
         int rowCount = table1.rowCount();
        List<LocalDate> dateList = new ArrayList<LocalDate> ();
         Integer[] cnt = new Integer[rowCount];
        for (int i = 0; i < rowCount; i++) {
            dateList.add (LocalDate.of (2021, 3, i % 31 == 0 ? 1 : i % 31));
            cnt[i]=i+1;
        }
        DateColumn dateColumn = DateColumn.create ("Fake Date", dateList);
        IntColumn counter = IntColumn.create ("Counter",cnt);
        
        table1.insertColumn (table1.columnCount (), dateColumn);
        table1.insertColumn (table1.columnCount (), counter);
        
         System.out.println(table1.first(7));
         
         Table joined =table1.joinOn("name").inner(table2);
          System.out.print(joined.first(4));
           System.out.println(joined.structure());
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
