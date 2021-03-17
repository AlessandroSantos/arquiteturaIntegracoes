package com.alessandrosantos.demoacmeapp.repository;

import com.alessandrosantos.demoacmeapp.domain.Cliente;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    public Optional<Cliente> findByCpf(String cpf);

}
