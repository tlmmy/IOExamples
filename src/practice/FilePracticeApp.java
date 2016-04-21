/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author trogers8
 */
public class FilePracticeApp {
    public static void main(String[] args) throws FileNotFoundException, IOException  {
        String path = "src" + File.separatorChar + "demoFile.txt";
        File file = new File(path);
        
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file, false)));
        
        out.println("75");
        out.println("107");
        out.close();
          
        
       
        Garage garage = new Garage("Tim's Garage");
        garage.getFileService().setReader(new GarageTotalsReader());
        List data = garage.getData(path);
        double totalHours = Double.parseDouble(data.get(0).toString());
        double totalFees = Double.parseDouble(data.get(1).toString());
        garage.setTotalHours(totalHours);
        garage.setTotalFees(totalFees);
        System.out.println("Garage Totals: Total Hours = " + garage.getTotalHours());
        System.out.println("Garage Totals: Total Fees = " + garage.getTotalFees());
    }
}
