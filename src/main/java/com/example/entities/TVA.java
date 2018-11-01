package com.example.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("TVA")
public class TVA extends Taxe{

	public TVA() {
		super();
		
	}

	public TVA(String type, Date dateTaxe, double montant, Entreprise entreprise) {
		super(type, dateTaxe, montant, entreprise);
	
	}
	

}
