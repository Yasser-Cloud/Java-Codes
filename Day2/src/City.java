/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author mahmoud
 */
public class City  {
    String code, name, continent,countrycode;
    double surfaceArea,population;

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }
      


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public double getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return this.code+" "+ this.name+" "+ this.continent+" "+ this.countrycode+" "+ 
    String.valueOf(this.surfaceArea)+" "+ String.valueOf(this.population) ; 
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public City(String code, String name, String continent, String countrycode, double surfaceArea, double population) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.countrycode = countrycode;
        this.surfaceArea = surfaceArea;
        this.population = population;
    }

 
    
    
}
