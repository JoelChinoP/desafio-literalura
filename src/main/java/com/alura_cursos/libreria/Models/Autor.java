package com.alura_cursos.libreria.Models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "autor")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private int anioNacimiento;
    private int anioMuerte;

    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Libro> libros = new ArrayList<>();

    public Autor() {
    }

    public Autor(String nombre, int anioNacimiento, int anioMuerte) {
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
        this.anioMuerte = anioMuerte;
        this.libros = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Autor{" +
                "anioNacimiento=" + anioNacimiento +
                ", anioMuerte=" + anioMuerte +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public int getAnioMuerte() {
        return anioMuerte;
    }

    public void setAnioMuerte(int anioMuerte) {
        this.anioMuerte = anioMuerte;
    }
}
