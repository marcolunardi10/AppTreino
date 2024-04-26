package backend.backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Exercicio {
     
    public Exercicio(String nome, Musculo musculo){
        this.nome = nome;
        this.musculo = musculo;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String nome;
    int series;
    float carga[] = new float[5];
    int repeticoes[] = new int[5];
    float recordeCarga;
    @ManyToOne
    @JoinColumn(name = "musculo_id")
    Musculo musculo;
}