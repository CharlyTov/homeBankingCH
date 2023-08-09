package com.mindhub.homebanking.repositories;

import com.mindhub.homebanking.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// @ Crea una API REST administra la data de la aplicación desde el navegador usando JSON
@RepositoryRestResource
public interface AccountRepository extends JpaRepository<Account, Long> {
}