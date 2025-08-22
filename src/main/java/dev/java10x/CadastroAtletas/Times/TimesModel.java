package dev.java10x.CadastroAtletas.Times;

import dev.java10x.CadastroAtletas.Atletas.AtletaModel;
import jakarta.persistence.*;

import java.util.List;
@Entity
@Table (name = "tb_times")
public class TimesModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numeroTime;

    private AtletaModel atleta;

    // @OneToMany - um time para varios atletas
    @OneToMany(mappedBy = "atleta")
    private List<AtletaModel>Atleta;

}
