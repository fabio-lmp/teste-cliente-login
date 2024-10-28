package br.com.fabioporto.teste_cliente_login.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.fabioporto.teste_cliente_login.entity.Cliente;
import br.com.fabioporto.teste_cliente_login.repository.ClienteRepository;

@Service
public class ClienteService {
    
    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> create(Cliente cliente) {
        clienteRepository.save(cliente);
        return list();
    }

    public List<Cliente> list() {
        Sort sort = Sort.by("nome").ascending();
        return clienteRepository.findAll(sort);
    }

    public List<Cliente> update(Cliente cliente) {
        clienteRepository.save(cliente);
        return list();
    }

    public List<Cliente> delete(Long id) {
        clienteRepository.deleteById(id);
        return list();
    }

}
