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
public class CityCSVDAO {
      public List<City> readCityFromCSV(String fileName){
      
          List<City> cities = new ArrayList<City>();

            File obj = new File(fileName);

          try{
           
            
            Scanner reader = new Scanner(obj);
          
            if(reader.hasNext())
                reader.nextLine();
            while(reader.hasNext())
            {
               String data = reader.nextLine();
               
               City py=creatCity(data.split(","));
              
               
              
               cities.add(new City(py.getCode(),py.getName()
               ,py.getContinent(),py.getCountrycode(),py.getSurfaceArea(),py.getPopulation()));
            }
            reader.close();
        
        }
        catch(FileNotFoundException e){
            System.out.println("Can't read the file ");
            e.printStackTrace();
        }
        return cities;
       
    }
    
    public City creatCity(String [] metadata){
      
        
        return new City(metadata[0],metadata[1],metadata[2],metadata[3]
                ,Double.parseDouble(metadata[4]),Double.parseDouble(metadata[5])) ;
    }

}
