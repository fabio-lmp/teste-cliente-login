package br.com.fabioporto.teste_cliente_login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import br.com.fabioporto.teste_cliente_login.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
 
    UserDetails findByLogin(String login);

}
