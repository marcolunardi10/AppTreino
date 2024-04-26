package backend.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.backend.entities.Musculo;

public interface MusculoRepository extends JpaRepository<Musculo, Long> {
    
}