package com.alura_cursos.libreria.Repository;
import org.springframework.data.repository.CrudRepository;
import com.alura_cursos.libreria.Models.Libro;

public interface LibroRepository extends CrudRepository<Libro, Long>{
}
