package br.com.fabioporto.teste_cliente_login.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fabioporto.teste_cliente_login.entity.Cliente;
import br.com.fabioporto.teste_cliente_login.service.ClienteService;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/clientes")
public class ClienteController {
    
    private ClienteService clienteService;

    
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }


    @PostMapping
    List<Cliente> create(@RequestBody @Valid Cliente cliente) {
        return clienteService.create(cliente);
    }

    @GetMapping
    List<Cliente> list() {
        return clienteService.list();
    }

    @PutMapping
    List<Cliente> update(@RequestBody Cliente cliente) {
        return clienteService.update(cliente);
    }

    @DeleteMapping("{id}")
    List<Cliente> delete(@PathVariable("id") Long id) {
        return clienteService.delete(id);    
    }


}
