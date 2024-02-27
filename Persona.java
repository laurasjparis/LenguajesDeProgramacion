public class Persona {
    private String nombre;
    private int edad;
    private String ocupacion;
    private boolean estudiante;
    private boolean docente;


    public Persona(String nombre, int edad, String ocupacion, boolean estudiante, boolean docente) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.estudiante = estudiante;
        this.docente = docente;
    }

    public void obtenerInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Ocupación: " + ocupacion);
        System.out.println("Es Estudiante: " + estudiante);
        System.out.println("Es Docente: " + docente);
    }


    public void accion() {
        System.out.println("Realizando su labor:");
    }


    public void estudio() {
        System.out.println("Estudiando");
    }


    public void enseñar() {
        System.out.println("Enseñando");
    }


    public void realizarTareas() {
        System.out.println("Haciendo tareas administrativas");
    }
}

