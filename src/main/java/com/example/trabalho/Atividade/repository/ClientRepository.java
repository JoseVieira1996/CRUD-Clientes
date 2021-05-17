package com.example.trabalho.Atividade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.trabalho.Atividade.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
