package dev.java10x.CadastroAtletas;

import jakarta.persistence.*;

//Entity ele transforma uma classe em uma tabela no banco de dados
//JPA= java persisten API
@Entity
@Table(name="tb_cadastro")
public class AtletaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    private String nome;
    private int idade;
    private int numeroTelefone;
    private char mensalistaDiadista;


public AtletaModel(){

}
    public AtletaModel(String nome, int idade, int numeroTelefone, char mensalistaDiadista) {
        this.nome = nome;
        this.idade = idade;
        this.numeroTelefone = numeroTelefone;
        this.mensalistaDiadista = mensalistaDiadista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public char getMensalistaDiadista() {
        return mensalistaDiadista;
    }

    public void setMensalistaDiadista(char mensalistaDiadista) {
        this.mensalistaDiadista = mensalistaDiadista;
    }




}
