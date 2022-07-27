package com.mycompany.projeto;

import Modelo.Atributos;
import Modelo.Classe;
import Modelo.Interacoes;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        int aux1, aux2, t = 0;
        String recep, exec;
        int p = 0;

        ArrayList<Classe> classes = new ArrayList<>();
        ArrayList<Interacoes> interacoes_list = new ArrayList<>();

        do {
            System.out.println("\n------------------------------------------------\n");
            System.out.println("\t\tMENU\n");
            System.out.println("Escolha uma opcao do que deseja realizar: \n1-Cadastrar Classe \n2-Cadastrar Interacao \n3-Imprimir \n4-Exportar para Gson \n5-Finalizar \n");

            int escolha = leituraINT();
            
            switch (escolha) {
                case 1:

                    

                    Classe c1 = new Classe();

                    c1.Cadastro_Class("Pessoa");
                    
                    System.out.println("\n\tCadastro Classe 1: Pessoa\n");
                    System.out.println("Modificador: private\n");
                    System.out.println("Tipo: String\n");
                    System.out.println("Nome: Int\n");

                    c1.Cadastro_Atributos("private", "Nome", "String");

                    c1.Cadastro_Atributos("public", "Idade", "Int");

                    classes.add(c1);
                    System.out.println("Concluido!\n");

                    Classe c2 = new Classe();
                    
                    System.out.println("\n\tCadastro Classe 2: Pessoa Juridica\n");
                    System.out.println("Modificador: private\n");
                    System.out.println("CNPJ: String\n");
                    

                    c2.Cadastro_Class("Pessoa_Juridica");

                    c2.Cadastro_Atributos("private", "CNPJ", "String");

                    classes.add(c2);
                    System.out.println("Concluido!\n");
                    
                    Classe c3 = new Classe();
                    
                    System.out.println("\n\tCadastro Classe 3: Produto\n");
                    
                    c3.Cadastro_Class("Produto");

                    System.out.println("Modificador: private\n");
                    System.out.println("Tipo: String\n");
                    System.out.println("Codigo: Int\n");
                    System.out.println("Valor: Float\n");

                    c3.Cadastro_Atributos("private", "Tipo", "String");

                    c3.Cadastro_Atributos("public", "Codigo", "Int");
                    c3.Cadastro_Atributos("public", "Valor", "Float");

                    classes.add(c3);
                    System.out.println("Concluido!\n");
                    

                    break;
                case 2:
                    System.out.println("\nEscolha uma opcao do que deseja realizar: \n1-Heranca \n2-Composicao \n3-Agregacao \n");
                    System.out.println("<- 1");
                    aux1 = 1;

                    System.out.println("\nEscolha uma opcao do que deseja realizar: \n1-Um Para Um \n2-Um Para Muitos \n3-Muitos para Muitos \n");
                    System.out.println("<- 1");
                    aux2 = 1;

                    System.out.println("\nQual classe exercera a interacao: ");
                    System.out.println("<- Pessoa_Juridica");
                    exec = "Pessoa_Juridica";

                    for (Classe com : classes) {
                        if (exec.equals(com.getNome())) {
                            p = 1;
                            break;
                        } else {
                            p = 0;
                        }
                    }
                    if (p == 0) {
                        break;
                    }
                    p = 0;

                    System.out.println("Qual classe recebera a interacao: ");
                    System.out.println("<- Pessoa");
                    recep = "Pessoa";

                    for (Classe com : classes) {
                        if (recep.equals(com.getNome())) {
                            p = 1;
                            break;
                        } else {
                            p = 0;
                        }
                    }
                    if (p == 0) {
                        break;
                    }

                    p = 0;

                    Interacoes i1 = new Interacoes();

                    i1.Cadastro_int(recep, exec, aux1, aux2);

                    interacoes_list.add(i1);
                    
                    break;

                case 3:
                    System.out.println("@startuml");
                    for (Classe com : classes) {
                        com.Imprimir();
                    }

                    for (Interacoes im : interacoes_list) {
                        im.Imprimir_int();
                    }
                    System.out.println("@enduml");
                    break;
                case 4:
                               
                    System.out.println("Funcao indisponivel no momento!");
                    break;
                case 5:
                {
                    System.out.println("\nFinalizando...\n\n");
                    t = 1;
                }
                    break;
                default:
                    System.out.println("Escolha Invalida!");
            }
        } while (t==0);

        /*  
        Tipo
        1    Class01 <|-- Class02 --Herança
        2    Class03 *-- Class04  --Composicao
        3    Class05 o-- Class06  --Agregacao
                
        Balanco
        1    Class01 "1" ---> "1" Class02
        2    Class03 "1" ---> "1..*" Class04
        3    Class05 "1..*" ---> "1..*" Class06
          
         */
    }

    public static int leituraINT() {
        System.out.println("<-");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();

    }
}
