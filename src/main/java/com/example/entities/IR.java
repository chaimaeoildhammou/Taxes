package com.example.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("IR")
public class IR extends Taxe{

	public IR() {
		super();
		
	}

	public IR(String type, Date dateTaxe, double montant, Entreprise entreprise) {
		super(type, dateTaxe, montant, entreprise);
		
	}

	
}
