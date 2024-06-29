package br.com.marjo.renova.usuario.domain;


import br.com.marjo.renova.doacao.domain.Doacao;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Entity
@Data
@EqualsAndHashCode
@Table(name = "Usuario")

public class Usuario {

    @Column(name = "NOME_USUARIO")
    private String NomeUsuario;

    @Id
    @Column(name = "CPF_USUARIO")
    private String CpfUsuario;

    @Column(name = "ENDERECO_USUARIO")
    private String endereco;

    @Column(name = "TELEFONE_USUARIO")
    private String telefone;

    @OneToMany(mappedBy = "doador", fetch = FetchType.EAGER)
    private List<Doacao> doacoes;
}