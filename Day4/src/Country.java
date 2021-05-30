/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.groupingBy;

/**
 *
 * @author mahmoud
 */
public class Country {
   String  countrycode ,name ;
   List<City> cities;

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public Country(String countrycode, String name, List<City> cities) {
        this.countrycode = countrycode;
        this.name = name;
        this.cities = cities;
    }
     public Country(String countrycode, String name) {
        this.countrycode = countrycode;
        this.name = name;
        
    }
     
     public String highstPopulation(){
         
   City cc = cities.stream()
                        .max(Comparator.comparingDouble(City::getPopulation ))
                        .get();
         return cc.name;

     }
     
     public String highstContinent(){
         
   City cc = cities.stream().max(Comparator.comparingDouble(City::getPopulation ))
                        .get();
         return cc.continent;

     }
}
