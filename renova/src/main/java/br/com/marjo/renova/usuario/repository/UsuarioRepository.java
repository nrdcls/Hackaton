package br.com.marjo.renova.usuario.repository;

import br.com.marjo.renova.usuario.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
}
