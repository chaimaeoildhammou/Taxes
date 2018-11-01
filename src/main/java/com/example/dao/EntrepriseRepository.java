package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Entreprise;

public interface EntrepriseRepository extends JpaRepository<Entreprise, Long>{
	

}
