public class EmpleadoTemporal extends Empleado {
    private int proyectosFinalizados;

    public EmpleadoTemporal(String id, String nombre, String correo, int proyectosFinalizados) {
        super(id, nombre, correo);
        this.proyectosFinalizados = proyectosFinalizados;
    }

    @Override
    public double calcularDesempeño() {
        return proyectosFinalizados * 1.2;
    }
}
