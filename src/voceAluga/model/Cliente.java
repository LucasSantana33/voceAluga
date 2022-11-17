/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voceAluga.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import voceAluga.dao.ClienteDAO;
import voceAluga.dao.Exceptiondao;
import voceAluga.dao.VeiculoDAO;
import voceAluga.dao.conexao;

/**
 *
 * @author lucas
 */
public class Cliente {
    
    private Integer idCliente;
    private String nome;
    private String telefone;
    private String dataNasc;
    private String numCartMotorista;
    private String cpf;
    private String endereco;
    private int idFilial;
    private ArrayList<Reserva> reservas = new ArrayList<Reserva>();

    public Cliente(String nome, String telefone, String dataNasc, String numCartMotorista, String cpf, String endereco, int idFilial) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        this.numCartMotorista = numCartMotorista;
        this.cpf = cpf;
        this.endereco = endereco;
        this.idFilial = idFilial;
    }

    public Cliente() {
        
    }
    
    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getNumCartMotorista() {
        return numCartMotorista;
    }

    public void setNumCartMotorista(String numCartMotorista) {
        this.numCartMotorista = numCartMotorista;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdFilial() {
        return idFilial;
    }

    public void setIdFilial(int idFilial) {
        this.idFilial = idFilial;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    
     public  ArrayList<Cliente> listarClientes(String nome)throws Exceptiondao, SQLException{
        Connection conexao = new conexao().getConnection();
        return new ClienteDAO(conexao).listarClientes(nome);
    
    }

    
    
    
}
