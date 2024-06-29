package br.com.marjo.renova.doacao.respository;

import br.com.marjo.renova.doacao.domain.Doacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoacaoRepository extends JpaRepository<Doacao, Integer> {
}
