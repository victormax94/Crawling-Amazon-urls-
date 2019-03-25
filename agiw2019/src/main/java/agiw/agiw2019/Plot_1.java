package agiw.agiw2019;

import java.io.*;
import java.util.*;//Scanner is included

import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.xy.*;
import org.jfree.data.*;



public class Plot_1
{

static Scanner scanner;
static double[] series;
//static File file;

public static void main(String[] args)
    {


plotResult();

}//end of main


//**********

//Method that reads in an external file with numbers (doubles)
//and plots the content in a line chart using JFreeChart


public static void plotResult() {

//Read in the file "calculation.txt" using Scanner and call hasNextDouble on it

try {
           int index = 0;
           
           File file = new File("realfilename.txt");
           series = new double[1076];
           scanner = new Scanner(file);
           int i=0;
          // Scanner scanner = new Scanner(file);
           while (scanner.hasNextDouble()) {
           series[i]=scanner.nextDouble();
           i++;
                                          }
         scanner.close();
       } 
   catch (FileNotFoundException e) {
         e.printStackTrace();
       }
     

//Round off the doubles to two decimals - not done yet



//Plot the line chart



/*
XYSeries series = new XYSeries("Pk");
  series.add(1, 0.8201791789916324 );
  series.add(2, 0.9727097916233601 );
  series.add(3, 0.9949972829175494);
*/

HistogramDataset xyDataset = new HistogramDataset();
xyDataset.addSeries("Agiw",series ,50);


JFreeChart chart = ChartFactory.createHistogram
("Amazon links tag html count", "n tags", "occurencies",xyDataset, PlotOrientation.VERTICAL, true, true, false);
ChartFrame frame1=new ChartFrame("XYLine Chart",chart);
frame1.setVisible(true);
frame1.setSize(1076,20);



}//End of method


//***************


}//end of class

