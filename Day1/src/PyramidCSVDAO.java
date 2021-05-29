/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;


/**
 *
 * @author mahmoud
 */
public class PyramidCSVDAO {

    public PyramidCSVDAO() {
    }
    public List<Pyramid> readPyramidsFromCSV(String fileName){
       List<Pyramid> pyramids = new ArrayList<Pyramid>();

        try{
           
            File obj = new File(fileName);
            
            Scanner reader = new Scanner(obj);
          
            if(reader.hasNext())
                reader.nextLine();
            while(reader.hasNext())
            {
               String data = reader.nextLine();
               
               Pyramid py=creatPramid(data.split(","));
              
               
              
               pyramids.add(new Pyramid(py.getPharaoh(),py.getModern_name()
               ,py.getSite(),py.getHeight()));
            }
            reader.close();
        
        }
        catch(FileNotFoundException e){
            System.out.println("Can't read the file ");
            e.printStackTrace();
        }
        return pyramids;
       
    }
    
    public Pyramid creatPramid(String [] metadata){
        double x;
        if(metadata[7].isEmpty() )
            x=-1;
        else
            x=Double.parseDouble(metadata[7]);
        
        return new Pyramid(metadata[0],metadata[2],metadata[4],x) ;
    }

   
}
