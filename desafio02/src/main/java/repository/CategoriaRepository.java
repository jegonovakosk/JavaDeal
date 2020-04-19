package repository;

import model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    // Instanciar a categoria pelo ID
    Categoria findById(int id);

}