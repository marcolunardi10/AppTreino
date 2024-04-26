/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author marco
 */
public class Exercicio {
    private long id;
    private String nome;
    private float carga[] = new float[5];
    private int series;
    private int repeticoes[] = new int[5];
    private float recordeCarga;
    private Musculo musculo;


    @Override
    public String toString() {
        return nome;
    }

    public Exercicio(long id, String nome, float[] carga, int series, int[] repeticoes, float recordeCarga, Musculo musculo) {
        this.id = id;
        this.nome = nome;
        this.carga = carga;
        this.series = series;
        this.repeticoes = repeticoes;
        this.recordeCarga = recordeCarga;
        this.musculo = musculo;
    }

    public Exercicio() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float[] getCarga() {
        return carga;
    }
    
    public float getCargaIndex(int index){
        return carga[index];
    }

    public void setCarga(int index, float carga) {
        this.carga[index] = carga;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int[] getRepeticoes() {
        return repeticoes;
    }
    
    public int getRepeticoesIndex(int index){
        return repeticoes[index];
    }


    public void setRepeticoes(int index, int repeticoes) {
        this.repeticoes[index] = repeticoes;
    }

    public float getRecordeCarga() {
        return recordeCarga;
    }

    public void setRecordeCarga(float recordeCarga) {
        this.recordeCarga = recordeCarga;
    }

    public Musculo getMusculo() {
        return musculo;
    }

    public void setMusculo(Musculo musculo) {
        this.musculo = musculo;
    }

    
}