package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }

    @Override
    public void start(Stage stage) {

        // Creating the x and y axes that the chart is going to use
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis();

        // Creating the line chart. The values of the chart are given as numbers
        // and it uses the axes we created earlier
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");

        // Adding single points into the data set
        String[] partiesData;
        String[] years;
        String[] parties = new String[10];
        File source = new File("partiesdata.tsv");

        try (Scanner scan = new Scanner(source);) {

            int count = 0;

            while (scan.hasNext()) {
                parties[count] = scan.nextLine();
                count++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PartiesApplication.class.getName()).log(Level.SEVERE, null, ex);
        }

        years = parties[0].split("\t");

        for (int i = 1; i < parties.length; i++) {

            if (parties[i] != null) {

                partiesData = parties[i].split("\t");

                // Creating the data set that is going to be added to the line chart
                XYChart.Series data = new XYChart.Series<>();
                data.setName(partiesData[0]);

                for (int k = 1; k < partiesData.length; k++) {
                    if (!partiesData[k].equals("-")) {
                        data.getData().add(new XYChart.Data<>(Integer.valueOf(years[k]), Double.valueOf(partiesData[k])));
                    }
                }

                // Adding the data set to the line chart
                lineChart.getData().add(data);
            }
        }

        // Display the line chart
        Scene scene = new Scene(lineChart, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

}
