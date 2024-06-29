package br.com.marjo.renova.usuario.resource;

import br.com.marjo.renova.usuario.domain.Usuario;
import br.com.marjo.renova.usuario.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/usuario")
public class UsuarioResource {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Usuario> adicionarUsuario(@RequestBody Usuario usuarioNovo){
        Usuario usuarioAdicionado = usuarioService.adicionarUsuario(usuarioNovo);
        return new ResponseEntity<>(usuarioAdicionado, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> listarUsuario() {
        List<Usuario> usuario = usuarioService.listarUsuario();
        return ResponseEntity.ok(usuario);
    }


    @GetMapping("/{cpfUsuario}")
    public ResponseEntity<Usuario> buscarUsuario(@PathVariable Integer cpfUsuario){
       return usuarioService.buscarUsuario(cpfUsuario)
               .map(usuario -> new ResponseEntity<>(usuario,HttpStatus.OK))
               .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }



}
