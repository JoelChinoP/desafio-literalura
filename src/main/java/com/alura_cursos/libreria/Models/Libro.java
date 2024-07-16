package com.alura_cursos.libreria.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "libro")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "autor_id", nullable = false)
    private Autor autor;

    private String idioma;
    private long numDescargas;

    public Libro() {
    }

    public Libro(String titulo, Autor autor, String idioma, long numDescargas) {
        this.titulo = titulo;
        this.autor = autor;
        this.idioma = idioma;
        this.numDescargas = numDescargas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", idioma='" + idioma + '\'' +
                ", numDescargas=" + numDescargas +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public long getNumDescargas() {
        return numDescargas;
    }

    public void setNumDescargas(long numDescargas) {
        this.numDescargas = numDescargas;
    }
}
