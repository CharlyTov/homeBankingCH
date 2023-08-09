package com.mindhub.homebanking;

import com.mindhub.homebanking.models.Account;
import com.mindhub.homebanking.models.Client;
import com.mindhub.homebanking.repositories.AccountRepository;
import com.mindhub.homebanking.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class HomebankingApplication {

	private ClientRepository clientRepository;
	private LocalDate currentDate = LocalDate.now();
	private LocalDate tomorrowDate = LocalDate.now().plusDays(1);

	public static void main(String[] args) {
		SpringApplication.run(HomebankingApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(ClientRepository clientRepository, AccountRepository accountRepository) {
		return (args) -> {
			// save a couple of customers
			Client client = new Client("Melba", "Morel", "melba@mindhub.com");
			Account account1 = new Account("VIN001", this.currentDate, 5000.0);
			Account account2 = new Account("VIN002", this.tomorrowDate, 7500.0);
			client.addAccount(account1);
			client.addAccount(account2);
			clientRepository.save(client);
			accountRepository.save(account1);
			accountRepository.save(account2);

			Client client2 = new Client("Carlos", "Tovar", "carlos@mindhub.com");
			Account account3 = new Account("VIN003", this.currentDate, 10000.0);
			Account account4 = new Account("VIN004", this.currentDate, 8000.0);
			client2.addAccount(account3);
			client2.addAccount(account4);
			clientRepository.save(client2);
			accountRepository.save(account3);
			accountRepository.save(account4);
		};
	}
}