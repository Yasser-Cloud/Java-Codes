/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;
import java.util.List;

/**
 *
 * @author mahmoud
 */
public class Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Java");
        PyramidCSVDAO pDAO = new PyramidCSVDAO();
        
        List<Pyramid> pyramids = pDAO.readPyramidsFromCSV("pyramids.csv");
        int i=0;
        for(Pyramid p:pyramids)
        {
            System.out.println("#"+(i++)+p.getPharaoh()+" "+p.getModern_name()
            +" "+p.getSite()+" "+Double.toString(p.getHeight()));
        }
                
    }
    
}
