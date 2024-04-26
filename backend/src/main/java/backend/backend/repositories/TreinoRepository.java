package backend.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.backend.entities.Treino;

public interface TreinoRepository extends JpaRepository<Treino, Long> {
    
}
