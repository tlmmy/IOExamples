/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trogers8
 */
public class GarageTotalsReader implements TextFileReaderStrategy{

    @Override
    public List readFile(String filePath) throws FileNotFoundException, IOException{
     File file = new File(filePath); 
     BufferedReader in = null;
        List<String> lines = new ArrayList<>();
        in = new BufferedReader(new FileReader(file));
        Garage garage = new Garage("Tim's Garage");
        String line = in.readLine();
        int counter = 0;
        while(line != null){
           if(counter == 0){
            double totalHours = Double.parseDouble(line);
            garage.setTotalHours(totalHours);
           } else if(counter == 1){
               double totalFees = Double.parseDouble(line);
               garage.setTotalFees(totalFees);
           }
            counter++;
            line=in.readLine();
        }
        in.close();
        return lines;
    }
    
}
