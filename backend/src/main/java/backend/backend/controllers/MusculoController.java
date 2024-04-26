package backend.backend.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import backend.backend.entities.Musculo;
import backend.backend.repositories.MusculoRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class MusculoController {
    MusculoRepository repos;

    @GetMapping("/musculos")
    public List<Musculo> getAllMusculos() {
        return repos.findAll();
    }

    @GetMapping("/musculos/{id}")
    public Musculo getMusculoById(@PathVariable Long id){
        return repos.findById(id).get();
    }

}