package br.com.marjo.renova.doacao.resource;

import br.com.marjo.renova.doacao.domain.Doacao;
import br.com.marjo.renova.doacao.service.DoacaoService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/doacoes")
public class DoacaoResource {

    @Autowired
    private DoacaoService doacaoService;

    @Operation(summary = "Adicionar Doação", description = "O recurso adiciona uma doação")
    @PostMapping
    public ResponseEntity<Doacao> adicionarDoacao(@RequestBody Doacao novaDoacao) {
        Doacao doacaonova = doacaoService.adicionarDoacao(novaDoacao);
        return new ResponseEntity<>(doacaonova, HttpStatus.CREATED);
    }

    @GetMapping("/{cpfdoador}")
    public ResponseEntity<List<Doacao>> listarDoacao() {
        List<Doacao> pets = doacaoService.listarDoacao();
        return ResponseEntity.ok(pets);
    }

    @GetMapping("/{idDoacao}")
    public ResponseEntity<Doacao> buscarDoacao(@PathVariable Integer idDoacao) {
        return doacaoService.buscarDoacao(idDoacao)
                .map(pet -> new ResponseEntity<>(pet,HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
