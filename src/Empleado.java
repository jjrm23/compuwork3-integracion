public abstract class Empleado {
    protected String id;
    protected String nombre;
    protected String correo;

    public Empleado(String id, String nombre, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
    }

    public abstract double calcularDesempeño();

    @Override
    public String toString() {
        return nombre + " (" + id + ") - " + correo;
    }
}
