package br.com.marjo.renova.usuario.service;

import br.com.marjo.renova.usuario.domain.Usuario;
import br.com.marjo.renova.usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
@Autowired
     private UsuarioRepository usuarioRepository;

    public Usuario adicionarUsuario(Usuario usuarioNovo){
        return usuarioRepository.save(usuarioNovo);
    }

    public List<Usuario> listarUsuario(){
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> buscarUsuario(Integer cpfUsuairo){
        return usuarioRepository.findById(cpfUsuairo);
    }


}
