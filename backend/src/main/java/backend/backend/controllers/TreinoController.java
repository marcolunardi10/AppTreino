package backend.backend.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import backend.backend.entities.Exercicio;
import backend.backend.entities.Treino;
import backend.backend.repositories.TreinoRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class TreinoController {
    TreinoRepository repos;

    @GetMapping("/treinos")
    public List<Treino> getAllTreinos() {
        return repos.findAll();
    }

    @GetMapping("/treino/{id}")
    public Treino getTreinoById(@PathVariable Long id){
        return repos.findById(id).get();
    }

    @GetMapping("/treino/{id}/exercicios")
    public List<Exercicio> getExerciciosByTreinoId(@PathVariable Long id) {
        Treino treino = repos.findById(id).orElse(null);
            return treino.getExercicios();
    }


    @PostMapping("/treino")
    public Treino saveTreino(@RequestBody Treino treino){
        return repos.save(treino);
    }

    @DeleteMapping("/treino/{id}")
    public void deleteTreino(@PathVariable Long id){
        repos.deleteById(id);
    }
}