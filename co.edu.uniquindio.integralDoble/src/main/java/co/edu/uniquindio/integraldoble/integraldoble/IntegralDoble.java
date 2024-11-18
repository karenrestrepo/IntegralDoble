package co.edu.uniquindio.integraldoble.integraldoble;

import org.mariuszgromada.math.mxparser.License;

import java.util.Scanner;
import java.util.function.BiFunction;

public class IntegralDoble {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        License.iConfirmNonCommercialUse("TuNombre o Institución");

        // Solicitar datos...
        System.out.println("Ingrese la función f(x, y) en términos de x e y (ej. x + y): ");
        String funcion = scanner.nextLine();
        System.out.print("a (límite inferior de x): ");
        double a = scanner.nextDouble();
        System.out.print("b (límite superior de x): ");
        double b = scanner.nextDouble();
        System.out.print("c (límite inferior de y): ");
        double c = scanner.nextDouble();
        System.out.print("d (límite superior de y): ");
        double d = scanner.nextDouble();
        System.out.print("Número de subintervalos en x (n): ");
        int n = scanner.nextInt();
        System.out.print("Número de subintervalos en y (m): ");
        int m = scanner.nextInt();

        // Calcular la integral
        double resultado = calcularIntegralDoble(funcion, a, b, c, d, n, m);

        // Mostrar el resultado con un valor aproximado y exacto
        System.out.printf("Valor de la integral: %.10f%n", resultado); // Aproximado con 2 decimales


        // Conectar con la aplicación gráfica
        HelloApplication.setValorIntegral(resultado, funcion);
        HelloApplication.main(new String[]{});
    }

    // Métodos de cálculo
    public static double calcularIntegralDoble(String funcion, double a, double b, double c, double d, int n, int m) {
        BiFunction<Double, Double, Double> f = evaluarFuncion(funcion);

        double deltaX = (b - a) / n;
        double deltaY = (d - c) / m;

        double suma = 0.0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                double x = a + (i + 0.5) * deltaX;
                double y = c + (j + 0.5) * deltaY;

                suma += f.apply(x, y) * deltaX * deltaY;
            }
        }

        return suma;
    }

    public static BiFunction<Double, Double, Double> evaluarFuncion(String funcion) {
        return (x, y) -> {
            // Crear expresión con mxparser
            org.mariuszgromada.math.mxparser.Expression e = new org.mariuszgromada.math.mxparser.Expression(funcion);

            // Asignar valores a las variables x e y
            e.addArguments(new org.mariuszgromada.math.mxparser.Argument("x = " + x));
            e.addArguments(new org.mariuszgromada.math.mxparser.Argument("y = " + y));

            // Evaluar y retornar el resultado
            if (e.checkSyntax()) {
                return e.calculate();
            } else {
                throw new RuntimeException("Error al evaluar la función: " + e.getErrorMessage());
            }
        };
    }

    public static double evaluarExpresion(String expresion) {
        org.mariuszgromada.math.mxparser.Expression e = new org.mariuszgromada.math.mxparser.Expression(expresion);
        if (e.checkSyntax()) {
            return e.calculate();
        } else {
            throw new RuntimeException("Error al evaluar la función: " + e.getErrorMessage());
        }
    }
}


