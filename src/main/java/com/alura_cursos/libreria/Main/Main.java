package com.alura_cursos.libreria.Main;

import com.alura_cursos.libreria.ConsumoApi.ConsumoApi;
import com.alura_cursos.libreria.ConsumoApi.ConvertirDatos;

import java.util.Scanner;

public class Main {

    private Scanner in;
    private ConsumoApi consumoApi;
    private ConvertirDatos convierteDatos;
    private final String URL_API;

    public Main() {
        this.in = new Scanner(System.in);
        this.consumoApi = new ConsumoApi();
        this.convierteDatos = new ConvertirDatos();
        this.URL_API = "https://gutendex.com/books/?search=";
    }

    public void iniciarMenu() {
        var opcion = -1;
        System.out.println("!Bienvenido!");
        while (opcion != 0) {
            System.out.println("Seleccione una opción:");
            var menu = """
                    \t1 - Buscar libros por título
                    \t2 - Listar libros registrados
                    \t3 - Listar autores registrados
                    \t4 - Listar autores vivos en un determinado año
                    \t5 - Listar libros por idioma
                    \t6 - Top 10 libros más descargados
                    \t7 - Obtener estadísiticas
                    \t0 - Salir""";
            System.out.println(menu);
            opcion = in.nextInt();
            in.nextLine();

            switch (opcion) {
                case 1:
                    agregarLibros();
                    break;
                case 2:
                    librosRegistrados();
                    break;
                case 3:
                    autoresRegistrados();
                    break;
                case 4:
                    autoresPorAño();
                    break;
                case 5:
                    listarPorIdioma();
                    break;
                case 6:
                    topDiezLibros();
                    break;
                case 7:
                    estaditicasApi();
                    break;
                case 0:
                    System.out.println("Cerranding...");
                    break;

                default:
                    System.out.println("Ingresar un número válido.");
            }

        }
    }



    private void topDiezLibros() {
        System.out.println("Top 10 libros más descargados");
    }

    private void listarPorIdioma() {
        System.out.println("Listar libros por idioma");
    }

    private void autoresPorAño() {
        System.out.println("Listar autores vivos en un determinado año");
    }

    private void autoresRegistrados() {
        System.out.println("Listar autores registrados");
    }

    private void librosRegistrados() {
        System.out.println("Listar libros registrados");
    }

    private void agregarLibros() {
        System.out.println("Buscar libros por título");
    }

    private void estaditicasApi() {
        System.out.println("Obtener estadísiticas");
    }

}
