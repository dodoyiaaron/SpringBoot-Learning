package com.sabs.springboot;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.oracle.tools.packager.Log;
import com.sabs.springboot.entity.Customer;
import com.sabs.springboot.repository.CustomerRepository;

@SpringBootApplication
public class SpringDemo2Application {
	
	private static final Logger log = LoggerFactory.getLogger(SpringDemo2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringDemo2Application.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(CustomerRepository repository) {
		return (args -> {
			// save a couple of customers
			repository.save(new Customer("Jack", "Bauer"));
			repository.save(new Customer("Chloe", "O'Brian"));
            repository.save(new Customer("Kim", "Bauer"));
            repository.save(new Customer("David", "Palmer"));
            repository.save(new Customer("Michelle", "Dessler"));
            
            // fetch all customers
            log.info("customer found with findAll():");
            log.info("------------------------------------------------------------------");
            
            for(Customer customer : repository.findAll()) {
            	log.info(customer.toString());
            }
            
            //fetch an individual customer by ID
            Optional<Customer> customer = repository.findById(1L);
            log.info("Customer found with findOne(1L):");
            log.info("--------------------------------");
            log.info(customer.toString());
            log.info("");
            
         // fetch customers by last name
            log.info("Customer found with findByLastName('Bauer'):");
            log.info("--------------------------------------------");
            for (Customer bauer : repository.findByLastName("Bauer")) {
                log.info(bauer.toString());
            }
            log.info("");
		});
	}
}
