/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author marco
 */
public class Musculo {
    
    private Long id;
    private String nome;
    private int seriesSemanais;
    
    public Musculo(Long id, String nome, int seriesSemanais) {
        this.id = id;
        this.nome = nome;
        this.seriesSemanais = seriesSemanais;
    }
    
    public Musculo() {
    }
    
    @Override
    public String toString() {
        return "Musculo{" + "id=" + id + ", nome=" + nome + ", seriesSemanais=" + seriesSemanais + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSeriesSemanais() {
        return seriesSemanais;
    }

    public void setSeriesSemanais(int seriesSemanais) {
        this.seriesSemanais = seriesSemanais;
    }

    
}
