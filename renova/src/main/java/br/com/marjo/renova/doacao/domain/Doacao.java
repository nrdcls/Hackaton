package br.com.marjo.renova.doacao.domain;

import br.com.marjo.renova.usuario.domain.Usuario;
import jakarta.persistence.Column;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode
@Table(name = "DOACAO")
public class Doacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DOACAO")
    private Integer idDoacao;

    @Column(name = "VALOR_DOACAO")
    private double valorDoacao;

    @Column(name = "CPF_DOADOR")
    private String cpfDoador;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CPF_USUARIO", referencedColumnName = "CPF_USUARIO")
    private Usuario doador;
}
