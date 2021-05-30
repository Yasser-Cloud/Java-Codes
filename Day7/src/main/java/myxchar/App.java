package myxchar;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.knowm.xchart.*;


import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
          App xChartExamples = new App ();
        List<TitanicPassenger> allPassengers = xChartExamples.getPassengersFromJsonFile ();
        xChartExamples.graphPassengerClass (allPassengers);
        
        try {
            System.in.read();
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
     public List<TitanicPassenger> getPassengersFromJsonFile() {
        List<TitanicPassenger> allPassengers = new ArrayList<TitanicPassenger> ();
        ObjectMapper objectMapper = new ObjectMapper ();
        objectMapper.configure (DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try (InputStream input = new FileInputStream ("titanic_csv.json")) {
            //Read JSON file
            allPassengers = objectMapper.readValue (input, new TypeReference<List<TitanicPassenger>> () {
            });
        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
        return allPassengers;
    }
public void graphPassengerClass(List<TitanicPassenger> passengerList) {
    //filter to get a map of passenger class and total number of passengers in each class
    Map<String, Long> result =
    passengerList.stream ().collect (
    Collectors.groupingBy (
    TitanicPassenger::getPclass, Collectors.counting ()
    )
    );
    // Create Chart
    PieChart chart = new PieChartBuilder ().width (800).height (600).title (getClass ().getSimpleName ()).build ();
    // Customize Chart
    Color[] sliceColors = new Color[]{new Color (180, 68, 50), new Color (130, 105, 120), new Color (80, 143, 160)};
    chart.getStyler ().setSeriesColors (sliceColors);
    // Series
    chart.addSeries ("First Class", result.get ("1"));
    chart.addSeries ("Second Class", result.get ("2"));
    chart.addSeries ("Third Class", result.get ("3"));
    // Show it
    new SwingWrapper (chart).displayChart ();
}
  
}

       