package application;

import java.util.HashMap;
import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.event.ChangeListener;

public class SavingsCalculatorApplication extends Application{
    private BorderPane border;
    private LineChart<Number,Number> chart;
    private Slider monthlySavingsSlider;
    private Label monthlySavingsValueLabel;
    private Slider yearlyInterestSlider;
    private Label yearlyInterestValue;
    private HashMap<Integer,Double> values;
    private HashMap<Integer,Double> valuesPlusInterest;

    
    public void start(Stage stage){
        buildFrames();
        createChart();
       
        calculateValue();
        redrawGraph();
        
        
        border.setCenter(chart);
        Scene view = new Scene(border,640,480);
        stage.setScene(view);
        stage.show();
            
    }
    public void redrawGraph(){
       
        XYChart.Series savingsData = new XYChart.Series();
        XYChart.Series savingsDataPlusInt = new XYChart.Series();
        savingsData.getData().clear();
        savingsDataPlusInt.getData().clear();
        chart.getData().clear();
        for (int i = 0; i < 31;i++){
            savingsData.getData().add(new XYChart.Data(i, values.get(i)));
            savingsDataPlusInt.getData().add(new XYChart.Data(i, valuesPlusInterest.get(i)));
            System.out.println(values.get(i) + " sav  :  int "+ (yearlyInterestSlider.getValue()) +"% "+ valuesPlusInterest.get(i));
            
        }
        
        chart.getData().addAll(savingsData,savingsDataPlusInt);
      
        
    }
    
    public void calculateValue(){
        values = new HashMap<>();
        valuesPlusInterest = new HashMap();
        values.clear();
        valuesPlusInterest.clear();
        double savings = 0;
        double savingsPlusInterest =0;
        for (int i = 0; i < 31; i++){
            savings = savings + (monthlySavingsSlider.getValue() * 12);
            values.put(i,savings);
            savingsPlusInterest = (savingsPlusInterest + (monthlySavingsSlider.getValue() *12)) +(savingsPlusInterest * (yearlyInterestSlider.getValue()/100));
            valuesPlusInterest.put(i,savingsPlusInterest);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(SavingsCalculatorApplication.class);
    }
    public void createChart(){
        NumberAxis xAxis = new NumberAxis(0,30,1);
        
        NumberAxis yAxis = new NumberAxis();
        
        chart = new LineChart(xAxis,yAxis);
    }
    
    public void buildFrames(){
        border= new BorderPane();
        
        VBox topPane = new VBox();
        BorderPane topUpper = new BorderPane();
        
        Label monthlySavingsLabel = new Label("Monthly savings");
        topUpper.setLeft(monthlySavingsLabel);
        
        monthlySavingsSlider = new Slider(25,250,1);
      
        monthlySavingsSlider.valueChangingProperty().addListener((obs, wasChanging, isNowChanging) -> {
        if (! isNowChanging) {
           
           calculateValue();
           redrawGraph();
           monthlySavingsValueLabel.setText(Double.toString(monthlySavingsSlider.getValue()));
        }
        });
           
             
        topUpper.setCenter(monthlySavingsSlider);
        monthlySavingsSlider.setShowTickMarks(true);
        monthlySavingsSlider.setShowTickLabels(true);
        
        monthlySavingsValueLabel = new Label(Double.toString(monthlySavingsSlider.getValue()));
        topUpper.setRight(monthlySavingsValueLabel);
        
        BorderPane topLower = new BorderPane();
        Label yearlyInterestRateLabel = new Label("Yearly interest rate");
        
                
                
        yearlyInterestSlider = new Slider( 0, 10, 1);
        yearlyInterestSlider.valueChangingProperty().addListener((obs, wasChanging, isNowChanging) -> {
        if (! isNowChanging) {
           calculateValue();
           redrawGraph();
           yearlyInterestValue.setText(Double.toString(yearlyInterestSlider.getValue()));
        }
        });
        
        yearlyInterestValue = new Label(Double.toString(yearlyInterestSlider.getValue()));
        yearlyInterestSlider.setShowTickMarks(true);
        yearlyInterestSlider.setShowTickLabels(true);
        
        topLower.setLeft(yearlyInterestRateLabel);
        topLower.setCenter(yearlyInterestSlider);
        topLower.setRight(yearlyInterestValue);
        
        topPane.getChildren().addAll(topUpper,topLower);
        
        border.setTop(topPane);
        
        
        
        
    }

}
