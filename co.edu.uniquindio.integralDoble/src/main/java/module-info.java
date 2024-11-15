module co.edu.uniquindio.integraldoble.integraldoble {
    requires javafx.controls;
    requires javafx.fxml;
    requires MathParser.org.mXparser;


    opens co.edu.uniquindio.integraldoble.integraldoble to javafx.fxml;
    exports co.edu.uniquindio.integraldoble.integraldoble;
}