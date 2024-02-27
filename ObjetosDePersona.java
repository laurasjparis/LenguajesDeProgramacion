public class ObjetosDePersona {

    public static void main(String[] args) {

        Persona estudiante = new Persona("Miguel", 15, "Estudiante", true, false);
        Persona docente = new Persona("Martha", 45, "Docente", false, true);
        Persona administrativo = new Persona("Armando", 55, "Administrativo", false, false);


        System.out.println("Información del estudiante:");
        estudiante.obtenerInformacion();
        estudiante.accion();
        estudiante.estudio();

        System.out.println("\nInformación del docente:");
        docente.obtenerInformacion();
        estudiante.accion();
        docente.enseñar();

        System.out.println("\nInformación del administrativo:");
        administrativo.obtenerInformacion();
        estudiante.accion();
        administrativo.realizarTareas();

    }
}
