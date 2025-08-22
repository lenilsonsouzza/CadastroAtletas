package dev.java10x.CadastroAtletas.Atletas;

import jakarta.persistence.*;

//Entity ele transforma uma classe em uma tabela no banco de dados
//JPA= java persisten API
@Entity
@Table(name="tb_cadastro")
public class AtletaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private int idade;
    private char mensalistaDiadista;

    //@ManyToOne um atleta tem apenas um time
    @ManyToOne
    @JoinColumn(name= "times_id") // Foreing key ou chave estrangeira
    private TimesModel times;

    private List<TimesModel>times;

public AtletaModel(){

}
    public AtletaModel(String nome, int idade, int numeroTelefone, char mensalistaDiadista) {
        this.nome = nome;
        this.idade = idade;
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
