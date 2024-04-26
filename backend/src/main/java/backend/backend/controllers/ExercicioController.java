package backend.backend.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import backend.backend.entities.Exercicio;
import backend.backend.entities.Musculo;
import backend.backend.repositories.ExercicioRepository;
import backend.backend.repositories.MusculoRepository;
import backend.backend.repositories.TreinoRepository;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;


@AllArgsConstructor
@RestController
public class ExercicioController{

    ExercicioRepository repos;
    TreinoRepository reposTreino;
    MusculoRepository reposMusculo;

    @GetMapping("/exercicios")
    public List<Exercicio> getAllExercicios() {
        return repos.findAll();
    }

    @GetMapping("/exercicio/{id}")
    public Exercicio getExercicioById(@PathVariable Long id) {
        return repos.findById(id).orElse(null);
    }


    @GetMapping("/treino/exercicio/{id}")
    public Exercicio getExercicioTreinoById(@PathVariable Long id) {
        return repos.findById(id).orElse(null);
    }

    @DeleteMapping("/exercicio/{id}")
    public ResponseEntity<Void> deleteExercicioById(@PathVariable Long id) {
         repos.deleteById(id);
         return ResponseEntity.noContent().build();
    }

    @PostMapping("/exercicios")
    public Exercicio saveExercicio(@RequestBody Exercicio exercicio) {
        return repos.save(exercicio);
    }
    
    @PutMapping("/exercicio/{id}")
    public ResponseEntity<Void> updateExercicio(@PathVariable Long id, @RequestBody Exercicio novoExercicio) {
 
        Optional<Exercicio> exe = repos.findById(id);
        Exercicio exercicio = exe.get();
        exercicio.setRecordeCarga(novoExercicio.getRecordeCarga());
        exercicio.setMusculo(novoExercicio.getMusculo());
        repos.save(exercicio);
        return ResponseEntity.ok().build();
   }
 

    @PostConstruct
    public void init() {
        Musculo biceps = reposMusculo.save(new Musculo("Bíceps"));
        Musculo costas = reposMusculo.save(new Musculo("Costas"));
        Musculo deltoides = reposMusculo.save(new Musculo("Deltóides"));
        Musculo panturrilha = reposMusculo.save(new Musculo("Panturrilha"));
        Musculo peito = reposMusculo.save(new Musculo("Peito"));
        Musculo pernas = reposMusculo.save(new Musculo("Pernas e gluteos"));
        Musculo triceps = reposMusculo.save(new Musculo("Tríceps"));

        repos.save(new Exercicio("Afundo", pernas));
        repos.save(new Exercicio("Agachamento búlgaro", pernas));
        repos.save(new Exercicio("Agachamento livre", pernas));
        repos.save(new Exercicio("Barra fixa", costas));
        repos.save(new Exercicio("Cadeira extensora", pernas));
        repos.save(new Exercicio("Cadeira flexora", pernas));
        repos.save(new Exercicio("Coice", pernas));
        repos.save(new Exercicio("Cross-over polia alta", peito));
        repos.save(new Exercicio("Cross-over polia baixa", peito));
        repos.save(new Exercicio("Cross-over polia média", peito));
        repos.save(new Exercicio("Desenvolvimento halteres", deltoides));
        repos.save(new Exercicio("Desenvolvimento militar", deltoides));
        repos.save(new Exercicio("Elevação frontal", deltoides));
        repos.save(new Exercicio("Elevação lateral halteres", deltoides));
        repos.save(new Exercicio("Elevação lateral polia", deltoides));
        repos.save(new Exercicio("Elevação pélvica", pernas));
        repos.save(new Exercicio("Gêmeos sentado", panturrilha));
        repos.save(new Exercicio("Leg-press", pernas));
        repos.save(new Exercicio("Levantamento terra", pernas));
        repos.save(new Exercicio("Martelo halteres", biceps));
        repos.save(new Exercicio("Mesa flexora", pernas));
        repos.save(new Exercicio("Panturilha em pé", panturrilha));
        repos.save(new Exercicio("Panturilha leg-press",  panturrilha));
        repos.save(new Exercicio("Puxada frontal barra", costas));
        repos.save(new Exercicio("Puxada frontal triângulo", costas));
        repos.save(new Exercicio("Remada baixa", costas));
        repos.save(new Exercicio("Remada cavalinho", costas));
        repos.save(new Exercicio("Remada curvada", costas));
        repos.save(new Exercicio("Rosca banco inclinado", biceps));
        repos.save(new Exercicio("Rosca concentrada", biceps));
        repos.save(new Exercicio("Rosca direta barra", biceps));
        repos.save(new Exercicio("Rosca direta halteres", biceps));
        repos.save(new Exercicio("Rosca Scott", biceps));
        repos.save(new Exercicio("Serrote", costas));
        repos.save(new Exercicio("Stiff", pernas));
        repos.save(new Exercicio("Supino declinado barra", peito));
        repos.save(new Exercicio("Supino inclinado barra", peito));
        repos.save(new Exercicio("Supino inclinado halteres", peito));
        repos.save(new Exercicio("Supino reto barra", peito));
        repos.save(new Exercicio("Supino reto halteres", peito));
        repos.save(new Exercicio("Triceps francês polia", triceps));
        repos.save(new Exercicio("Triceps francês halteres", triceps));
        repos.save(new Exercicio("Triceps pulley barra", triceps));
        repos.save(new Exercicio("Triceps pulley corda", triceps));
        repos.save(new Exercicio("Triceps testa halteres", triceps));
        repos.save(new Exercicio("Triceps testa polia", triceps));
        repos.save(new Exercicio("Voador inverso", deltoides));
    }

}