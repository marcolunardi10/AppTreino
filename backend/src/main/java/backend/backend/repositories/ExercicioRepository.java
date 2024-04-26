package backend.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.backend.entities.Exercicio;

public interface ExercicioRepository extends JpaRepository<Exercicio, Long> {
    
}
