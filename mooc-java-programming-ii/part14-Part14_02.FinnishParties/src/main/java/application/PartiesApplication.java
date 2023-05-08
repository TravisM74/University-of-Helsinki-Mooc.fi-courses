package application;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application{
    
    private HashMap<String,List<String>> partyData = new HashMap<>();
    private ArrayList<String> data = new ArrayList<>();
    private ArrayList<String> years = new ArrayList<>();
    LineChart<Number,Number> lineChart;
    
    public void start(Stage stage){
        readData();
        
        NumberAxis xAxis = new NumberAxis(1968,2008,1);
        NumberAxis yAxis = new NumberAxis(0,30,5);
        
        //xAxis.setLabel("Year");
        
        lineChart= new LineChart(xAxis,yAxis);
        lineChart.setTitle("Relative support of the parties");
        
        loadDataToGraph();
        Scene view = new Scene(lineChart,640,480);
        stage.setScene(view);
        stage.show();
       
        
       
        
    }

    public static void main(String[] args) {
        launch(PartiesApplication.class);
        
    }
    
    private void loadDataToGraph(){
        for(String getData:partyData.keySet()){
            XYChart.Series data = new XYChart.Series();
            data.setName(getData);
               System.out.println("Before loding graph data");
            for(int i = 0; i< years.size(); i++){
                if (Double.valueOf(partyData.get(getData).get(i)) <= 0){
                    
                } else {
                    System.out.println("Loading "+getData+" :"+Integer.valueOf(years.get(i))+" "+Double.valueOf(partyData.get(getData).get(i)));
                    data.getData().add(new XYChart.Data(Integer.valueOf(years.get(i)), Double.valueOf(partyData.get(getData).get(i))));
            
                }
            }
            lineChart.getData().add(data);
     
        }
    }
     
        
       
    
    private void readData(){
        
        try {
            Scanner fileReader = new Scanner(new File("partiesdata.tsv")); 
            while(fileReader.hasNextLine()){
                String[] parts = fileReader.nextLine().split("\t");
                for(int i = 1; i < parts.length; i++){
                    if (parts[i].equals("-")){
                        parts[i]= "0";
                    } else {
                         
                    }
                   data.add(parts[i]);
                    
                }
                System.out.println(parts[0]+":"+data);
                partyData.put(parts[0],new ArrayList(data));
                data.clear();
                
               
                
            }
        } catch (Exception e){
            System.out.println("Error :"+e);
        }
        for(String year :partyData.get("Party")){
            years.add(year);
        }
        // cleaning 1st line from Data (Headers)
        partyData.remove("Party");
     
        System.out.println(partyData);
        System.out.println(years);
        System.out.println("----------------");
         
    }

}
