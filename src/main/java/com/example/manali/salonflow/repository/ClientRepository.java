package com.example.manali.salonflow.repository;

import com.example.manali.salonflow.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
