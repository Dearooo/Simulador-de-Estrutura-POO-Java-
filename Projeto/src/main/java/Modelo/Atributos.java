/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Atributos {
    private String modificador;
    private String nome_A;
    private String tipo;

    public Atributos() {
    }

    public String getModificador() {
        return modificador;
    }

    public void setModificador(String modificador) {
        this.modificador = modificador;
    }

    public String getNome_A() {
        return nome_A;
    }

    public void setNome_A(String nome_A) {
        this.nome_A = nome_A;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Atributos{" + "modificador=" + modificador + ", nome_A=" + nome_A + ", tipo=" + tipo + '}';
    }
    
}


