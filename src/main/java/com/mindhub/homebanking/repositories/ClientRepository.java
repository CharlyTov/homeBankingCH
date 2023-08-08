package com.mindhub.homebanking.repositories;

import java.util.List;

import com.mindhub.homebanking.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource //Crea una API REST administra la data de la aplicación desde el navegador usando JSON
public interface ClientRepository extends JpaRepository<Client, Long> {
}