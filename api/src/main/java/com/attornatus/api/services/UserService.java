package com.attornatus.api.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.attornatus.api.models.UserModel;
import com.attornatus.api.repository.UserRepository;

@Service
public class UserService{
    
    @Autowired
    private UserRepository clienteRepository;

    public UserModel salvar(UserModel cliente){
        return clienteRepository.save(cliente);
    }

    public List<UserModel> listaCliente(){
        return clienteRepository.findAll();
    }

    public Optional<UserModel> buscarPorId(Long id){
        return clienteRepository.findById(id);
    }

    public void removerPorId(Long id){
        clienteRepository.deleteById(id);
    }

}
