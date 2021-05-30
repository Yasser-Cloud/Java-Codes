/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.DoubleStream;

/**
 *
 * @author mahmoud
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Map<String, List<City>> countries = new HashMap<>();
         
        CityCSVDAO pDAO = new CityCSVDAO();
        CountryCSVDAO pDAO1 = new CountryCSVDAO();
        
        List<City> cities = pDAO.readCityFromCSV("Cities.csv");
         List<Country> count = pDAO1.readCountryFromCSV("Countries.csv");
         
        
	//Collections.sort(list, (o1, o2) -> o1.getValue().getEmployeeName().compareTo(o2.getValue().getEmployeeName()));
		
         for(City i :cities){
             countries.computeIfAbsent(i.getCountrycode(), k -> new ArrayList<>()).add(i);
         }
         
         for(Country i : count){
              i.setCities(countries.get(i.countrycode));
              
	Collections.sort(countries.get(i.countrycode), (o1, o2) -> String.valueOf(o1.getPopulation()).compareTo(String.valueOf(o2.getPopulation()) ));

         }
        // countries.forEach((k,v)-> System.out.println(k+" "+v));
         
          for(Country i : count){
          System.out.println( i.highstPopulation());
          }
          System.out.println();
          for(Country i : count){
          System.out.println( i.highstContinent());
          }
    }
    
}
