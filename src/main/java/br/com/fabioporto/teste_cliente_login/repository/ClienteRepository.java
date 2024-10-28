package br.com.fabioporto.teste_cliente_login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fabioporto.teste_cliente_login.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
