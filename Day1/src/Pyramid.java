/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author mahmoud
 */
public class Pyramid {
    private String Pharaoh; 
    private String modern_name;
    private String site;
    private double height; 

    public String getPharaoh() {
        return Pharaoh;
    }

    public String getModern_name() {
        return modern_name;
    }

    public String getSite() {
        return site;
    }

    public double getHeight() {
        return height;
    }

    public void setPharaoh(String Pharaoh) {
        this.Pharaoh = Pharaoh;
    }

    public void setModern_name(String modern_name) {
        this.modern_name = modern_name;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    Pyramid(String Pharaoh,String modern_name,String site,double height){
       this.Pharaoh=Pharaoh;
       this.height=height;
       this.modern_name=modern_name;
       this.site=site;
    }
    
}
