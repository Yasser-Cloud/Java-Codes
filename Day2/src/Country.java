/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.List;

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
}
