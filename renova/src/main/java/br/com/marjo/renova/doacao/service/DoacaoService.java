package br.com.marjo.renova.doacao.service;

import br.com.marjo.renova.doacao.domain.Doacao;
import br.com.marjo.renova.doacao.respository.DoacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DoacaoService {
        @Autowired
        private DoacaoRepository doacaoRepository;

        public Doacao adicionarDoacao(Doacao novaDoacao){
            return doacaoRepository.save(novaDoacao);
        }

        public List<Doacao> listarDoacao(){
            return  doacaoRepository.findAll();
        }

        public Optional<Doacao> buscarDoacao(Integer idDoacao){
            return doacaoRepository.findById(idDoacao);
        }
}
