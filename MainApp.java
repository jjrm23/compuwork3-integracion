import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label titulo = new Label("Sistema de Gestión de Empleados - CompuWork");

        TextArea salida = new TextArea();
        salida.setEditable(false);

        Button btnMostrar = new Button("Mostrar Información");
        btnMostrar.setOnAction(_ -> {
            Empleado emp1 = new EmpleadoPermanente("001", "Ana Pérez", "ana@correo.com", 5);
            Empleado emp2 = new EmpleadoTemporal("002", "Luis Torres", "luis@correo.com", 8);

            Departamento dep = new Departamento("Recursos Humanos");
            dep.agregarEmpleado(emp1);
            dep.agregarEmpleado(emp2);

            StringBuilder info = new StringBuilder(dep.toString() + "\n");
            for (Empleado emp : dep.getEmpleados()) {
                info.append(emp.toString()).append(" - Desempeño: ").append(emp.calcularDesempeño()).append("\n");
            }

            salida.setText(info.toString());
        });

        VBox root = new VBox(10, titulo, btnMostrar, salida);
        root.setStyle("-fx-padding: 20px;");

        Scene scene = new Scene(root, 500, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("CompuWork App");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
