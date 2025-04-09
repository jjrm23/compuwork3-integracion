import java.util.*;

public class Departamento {
    private String nombre;
    private List<Empleado> empleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado emp) {
        empleados.add(emp);
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    @Override
    public String toString() {
        return "Departamento: " + nombre + ", Empleados: " + empleados.size();
    }
}
