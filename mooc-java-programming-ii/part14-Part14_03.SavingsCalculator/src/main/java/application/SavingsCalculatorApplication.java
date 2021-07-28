package application;

import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }

    @Override
    public void start(Stage stage) {

        // The main layout
        BorderPane layout = new BorderPane();
        layout.setPadding(new Insets(10, 10, 10, 10));

        // Container of the two sliders
        VBox box = new VBox(8);

        // Layouts for the sliders
        BorderPane monthlySavings = new BorderPane();

        BorderPane yearlyInterestRate = new BorderPane();

        // Creating the components of the two sliders
        Label monthlySavingsLabel = new Label("Monthly savings");
        monthlySavingsLabel.setFont(new Font("Monospace Bold", 15));

        Slider monthlySavingsSlider = new Slider(25, 250, 25);
        monthlySavingsSlider.setMajorTickUnit(25);
        monthlySavingsSlider.setShowTickMarks(true);
        monthlySavingsSlider.setShowTickLabels(true);
        monthlySavingsSlider.setSnapToTicks(true);
        monthlySavingsSlider.setBlockIncrement(25);
        monthlySavingsSlider.setMinorTickCount(3);

        Label monthlySavingsLabelValueLabel = new Label("25");
        monthlySavingsLabelValueLabel.setFont(new Font("Monospace Bold", 15));

        Label interestRateLabel = new Label("Yearly interest rate");
        interestRateLabel.setFont(new Font("Monospace Bold", 15));

        Slider interestRateSlider = new Slider(0, 10, 0);
        interestRateSlider.setShowTickLabels(true);
        interestRateSlider.setShowTickMarks(true);

        Label interestRateValueLabel = new Label("0");
        interestRateValueLabel.setFont(new Font("Monospace Bold", 15));

        // Adding the components to the sliders layouts
        monthlySavings.setLeft(monthlySavingsLabel);
        monthlySavings.setCenter(monthlySavingsSlider);
        monthlySavings.setRight(monthlySavingsLabelValueLabel);

        yearlyInterestRate.setLeft(interestRateLabel);
        yearlyInterestRate.setCenter(interestRateSlider);
        yearlyInterestRate.setRight(interestRateValueLabel);

        box.getChildren().add(monthlySavings);
        box.getChildren().add(yearlyInterestRate);

        // Creating the axis of the chart
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();

        // Creating the chart and adding the axis to it
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        //lineChart.setLegendVisible(false);
        lineChart.setTitle("Savings calculator");

        // create the data sets that is going to be added to the line chart
        XYChart.Series savingsChart = new XYChart.Series<>();
        savingsChart.setName("Savings");

        XYChart.Series interestRateChart = new XYChart.Series<>();
        interestRateChart.setName("Interest");

        // Adding components to the main layout.
        layout.setTop(box);
        layout.setCenter(lineChart);

        // add the data set to the line chart
        lineChart.getData().add(savingsChart);
        lineChart.getData().add(interestRateChart);

        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();

        monthlySavingsSlider.setOnMouseClicked((event) -> {

            //lineChart.setAnimated(false);
            double money;
            double rate = interestRateSlider.getValue();
            double result = 0;

            monthlySavingsLabelValueLabel.setText(String.format("%.0f", monthlySavingsSlider.getValue()));

            interestRateChart.getData().clear();
            savingsChart.getData().clear();

            // and single points into the data set
            for (int i = 0; i <= 30; i++) {
                money = ((monthlySavingsSlider.getValue() * i) * 12);

                switch (i) {
                    case 0:
                        result = 0;
                        money = 0;
                        break;
                    case 1:
                        result = money + ((money * rate) / 100);
                        break;
                    default:
                        result = (result + (money - (monthlySavingsSlider.getValue() * (i - 1) * 12))) + (((result + (money - (monthlySavingsSlider.getValue() * (i - 1) * 12))) * rate) / 100);
                        break;
                }
                System.out.println("Money: " + money + ", result: " + result);

                interestRateChart.getData().add(new XYChart.Data<>(i, result));
                savingsChart.getData().add(new XYChart.Data<>(i, money));
            }
        });

        interestRateSlider.setOnMouseClicked((event) -> {
            interestRateValueLabel.setText(String.format("%.0f", interestRateSlider.getValue()));
        });

    }

}
