public class EmpleadoPermanente extends Empleado {
    private int añosAntiguedad;

    public EmpleadoPermanente(String id, String nombre, String correo, int añosAntiguedad) {
        super(id, nombre, correo);
        this.añosAntiguedad = añosAntiguedad;
    }

    @Override
    public double calcularDesempeño() {
        return añosAntiguedad * 1.5;
    }
}
