/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Classe {
    private String nome;
    ArrayList<Atributos>  atributos = new ArrayList<>();

    public Classe() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Atributos> getAtribustos() {
        return atributos;
    }

    public void setAtribustos(List<Atributos> atribustos) {
        this.atributos = (ArrayList<Atributos>) atribustos;
    }
    
    public void Cadastro_Class(String name){
        this.nome = name;
    }
    
    public void Cadastro_Atributos(String modificador, String name, String tipo){
        Atributos a = new Atributos();
        a.setNome_A(name);
        a.setModificador(modificador);
        a.setTipo(tipo);
        atributos.add(a);
    }
    
    
    
    public void Imprimir(){
        System.out.println("class " + this.nome + "{");
        
        for(Atributos atri: atributos) {
            if (atri.getModificador().equals("private")) {
                System.out.println("- " + atri.getTipo() + " " + atri.getNome_A() + ";"); 
            }else if (atri.getModificador().equals("public")) {
                System.out.println("+ " + atri.getTipo() + " " + atri.getNome_A() + ";");
            }else if (atri.getModificador().equals("protected")) {
                System.out.println("# " + atri.getTipo() + " " + atri.getNome_A() + ";");    
            }
        }
        
        System.out.println("}");
    }
    
    @Override
    public String toString() {
        return "Classe{" + "nome=" + nome + ", atribustos=" + atributos + '}';
    }
    
}
