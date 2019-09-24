/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public interface IControleRemoto {
    //INTERFACE possui apenas a assinatura (declaração) dos metodos e a implementacao
    // dos metodos estara nas classes que assinarem o contrato com minha interface
    //OBRIGATORIAMENTE todos os metodos declarados na INTERFACE deverão ser implementados 
    //nas classes que assinaram os metodos
    
    public void mudarCanal (int canal);
    public void aumentarVOlume (int volume);
    public void dimVolume (int volume);
    public boolean ligar();
    public boolean desligar();
}
