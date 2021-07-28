package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }

    @Override
    public void start(Stage stage) {

        // create the x and y axes that the chart is going to use
        NumberAxis xAxis = new NumberAxis(2006, 2018, 1);
        NumberAxis yAxis = new NumberAxis(0, 100, 5);

        // set the titles for the axes
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");

        // create the line chart. The values of the chart are given as numbers
        // and it uses the axes we created earlier
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai ranking");
        //lineChart.setLegendVisible(false);

        // create the data set that is going to be added to the line chart
        XYChart.Series shanghaiData = new XYChart.Series();
        shanghaiData.setName("Rank over the years");

        // and single points into the data set
        shanghaiData.getData().add(new XYChart.Data(2007, 73));
        shanghaiData.getData().add(new XYChart.Data(2008, 68));
        shanghaiData.getData().add(new XYChart.Data(2009, 72));
        shanghaiData.getData().add(new XYChart.Data(2010, 72));
        shanghaiData.getData().add(new XYChart.Data(2011, 74));
        shanghaiData.getData().add(new XYChart.Data(2012, 73));
        shanghaiData.getData().add(new XYChart.Data(2013, 76));
        shanghaiData.getData().add(new XYChart.Data(2014, 73));
        shanghaiData.getData().add(new XYChart.Data(2015, 67));
        shanghaiData.getData().add(new XYChart.Data(2016, 56));
        shanghaiData.getData().add(new XYChart.Data(2017, 56));

        // add the data set to the line chart
        lineChart.getData().add(shanghaiData);

        // display the line chart
        Scene scene = new Scene(lineChart, 640, 480);
        stage.setScene(scene);
        stage.show();

    }

}
