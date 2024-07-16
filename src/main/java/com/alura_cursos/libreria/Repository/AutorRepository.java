package com.alura_cursos.libreria.Repository;
import org.springframework.data.repository.CrudRepository;
import com.alura_cursos.libreria.Models.Autor;

public interface AutorRepository extends CrudRepository<Autor, Long>{
}
