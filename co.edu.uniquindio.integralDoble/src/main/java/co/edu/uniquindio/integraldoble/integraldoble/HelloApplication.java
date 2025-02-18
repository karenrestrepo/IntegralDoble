package co.edu.uniquindio.integraldoble.integraldoble;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.util.function.BiFunction;

public class HelloApplication extends Application {

    private static double valorIntegral;
    private static String funcion;

    public static void setValorIntegral(double valor, String f) {
        valorIntegral = valor;
        funcion = f;
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Gráfica de la Función y Resultado de la Integral");

        // Definir los ejes
        NumberAxis xAxis = new NumberAxis();
        NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("X");
        yAxis.setLabel("Y");

        // Crear el gráfico
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Gráfica de la Función");

        // Generar puntos para la función
        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("f(x, y)");

        // Crear la función dinámica a partir del input del usuario
        BiFunction<Double, Double, Double> funcionCalculada = IntegralDoble.evaluarFuncion(funcion);

        double minX = -10, maxX = 10, step = 0.5;
        double yValue;

        // Graficar la función para varios valores de x
        for (double x = minX; x <= maxX; x += step) {
            yValue = funcionCalculada.apply(x, 0.0);  // Usamos y = 0 para mostrar una proyección 2D
            series.getData().add(new XYChart.Data<>(x, yValue));
        }

        lineChart.getData().add(series);


        Scene scene = new Scene(lineChart, 800, 600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
