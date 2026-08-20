package br.com.techcorp.model;

import java.util.ArrayList;
import java.util.HashSet;

public class ControleDeAcesso {
    
    private ArrayList<Funcionario> historicoCatraca;
    private HashSet<Funcionario> autorizadosSalaSegura;

    public ControleDeAcesso(){
    historicoCatraca = new ArrayList<>();
    autorizadosSalaSegura = new HashSet<>();
    }

public void registrarPassagem(Funcionario f){
    historicoCatraca.add(f);
}

public void concederAcessoSala(Funcionario f){
    if(autorizadosSalaSegura.add(f)){
        System.out.println("Acesso liberado para a sala segura!");
    } else{
        System.out.println("Matricula já registrada! Acesso negado.");
        }
    }
}