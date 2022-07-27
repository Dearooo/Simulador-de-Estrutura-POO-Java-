/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Interacoes {
    private String receptor;
    private String executante;
    private int tipo;
    private int balanco;

    public Interacoes() {
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getExecutante() {
        return executante;
    }

    public void setExecutante(String executante) {
        this.executante = executante;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getBalanco() {
        return balanco;
    }

    public void setBalanco(int balanco) {
        this.balanco = balanco;
    }
    
    public void Cadastro_int(String recep, String exec, int tip, int bal){
        this.balanco = bal;
        this.tipo = tip;
        this.executante = exec;
        this.receptor = recep;  
    }
    
    public void Imprimir_int(){
        switch (this.tipo) {
            case 1:
                switch (this.balanco) {
                    case 1:
                        System.out.println(this.executante + " " + '\u0022' + "1" + '\u0022' + " " + "--|>" + " " + '\u0022' + "1" + '\u0022' + " " + this.receptor);
                        break;
                    case 2:
                        System.out.println(this.executante + " " + '\u0022' + "1" + '\u0022' + " " + "--|>" + " " + '\u0022' + "1..*" + '\u0022' + " " + this.receptor);
                        break;
                    case 3:
                        System.out.println(this.executante + " " + '\u0022' + "1..*" + '\u0022' + " " + "--|>" + " " + '\u0022' + "1..*" + '\u0022' + " " + this.receptor);
                        break;    
                    default:
                        throw new AssertionError();
                }
                break;
            case 2:
                switch (this.balanco) {
                    case 1:
                        System.out.println(this.executante + " " + '\u0022' + "1" + '\u0022' + " " + "--*" + " " + '\u0022' + "1" + '\u0022' + " " + this.receptor);
                        break;
                    case 2:
                        System.out.println(this.executante + " " + '\u0022' + "1" + '\u0022' + " " + "--*" + " " + '\u0022' + "1..*" + '\u0022' + " " + this.receptor);
                        break;
                    case 3:
                        System.out.println(this.executante + " " + '\u0022' + "1..*" + '\u0022' + " " + "--*" + " " + '\u0022' + "1..*" + '\u0022' + " " + this.receptor);
                        break;    
                    default:
                        throw new AssertionError();
                }
                break;
            case 3:
                switch (this.balanco) {
                    case 1:
                        System.out.println(this.executante + " " + '\u0022' + "1" + '\u0022' + " " + "--o" + " " + '\u0022' + "1" + '\u0022' + " " + this.receptor);
                        break;
                    case 2:
                        System.out.println(this.executante + " " + '\u0022' + "1" + '\u0022' + " " + "--o" + " " + '\u0022' + "1..*" + '\u0022' + " " + this.receptor);
                        break;
                    case 3:
                        System.out.println(this.executante + " " + '\u0022' + "1..*" + '\u0022' + " " + "--o" + " " + '\u0022' + "1..*" + '\u0022' + " " + this.receptor);
                        break;    
                    default:
                        throw new AssertionError();
                }
                break;
            default:
                throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Interacoes{" + "receptor=" + receptor + ", executante=" + executante + ", tipo=" + tipo + ", balanco=" + balanco + '}';
    }
    
}
