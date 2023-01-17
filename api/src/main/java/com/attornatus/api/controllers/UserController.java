package com.attornatus.api.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import com.attornatus.api.models.UserModel;
import com.attornatus.api.services.UserService;
import java.util.List;


@RestController
@RequestMapping("/usuario")
public class UserController {

@Autowired
private UserService userService;

@Autowired
private ModelMapper modelMapper;

@PostMapping
@ResponseStatus(HttpStatus.CREATED)
public UserModel salvar(@RequestBody UserModel cliente){
    return userService.salvar(cliente);
}

@GetMapping
@ResponseStatus(HttpStatus.OK)
public List<UserModel> listaCliente(){
    return userService.listaCliente();
}

@GetMapping("/{id}")
@ResponseStatus(HttpStatus.OK)
public UserModel buscarClientePorId(@PathVariable("id") Long id){
    return userService.buscarPorId(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente nao encontrado."));
}

@DeleteMapping("/{id}")
@ResponseStatus(HttpStatus.NO_CONTENT)
public void removerCliente(@PathVariable("id") Long id){
    userService.buscarPorId(id)
            .map(cliente -> {
                userService.removerPorId(cliente.getId());
                return Void.TYPE;
            }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente nao encontrado."));
}

@PutMapping("/{id}")
@ResponseStatus(HttpStatus.NO_CONTENT)
public void atualizarCliente(@PathVariable("id") Long id, @RequestBody UserModel cliente){
    userService.buscarPorId(id)
            .map(clienteBase -> {
                modelMapper.map(cliente, clienteBase);
                userService.salvar(clienteBase);
                return Void.TYPE;
            }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente nao encontrado."));
    
}
}





