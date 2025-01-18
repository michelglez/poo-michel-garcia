package edu.michel.garcia.actividades.actividad1.ui;

public class CLI {
    public static void mostrarMenu() {
        System.out.println("1. Crear un nuevo estudiante");
        System.out.println("2. Lista estudiantes");
        System.out.println("3. Salir"); 
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarError(String mensaje) {
        System.out.println("Error: "+ mensaje);
    }

    public void mostrarEstudiantes(String[] estudiantes) {
        for (String estudiante : estudiantes)
        System.out.println(estudiante);
    }


}
