/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mahmoud
 */
public class CountryCSVDAO {
     public List<Country> readCountryFromCSV(String fileName){
      
      
List<Country> countries = new ArrayList<Country>();
 
            File obj = new File(fileName);

          try{
           
            
            Scanner reader = new Scanner(obj);
          
            if(reader.hasNext())
                reader.nextLine();
            while(reader.hasNext())
            {
               String data = reader.nextLine();
               
               String [] tmp =data.split(",");
              
               
              
               countries.add(new Country(tmp[0],tmp[1]));
            }
            reader.close();
        
        }
        catch(FileNotFoundException e){
            System.out.println("Can't read the file ");
            e.printStackTrace();
        }
        return countries;
       
    }
    
   

    
}
