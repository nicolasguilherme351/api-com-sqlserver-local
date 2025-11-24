package com.demo.jpa.sql.server.demo_jpa_sqlserver;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Planta {

	@Id
	Integer id;
	String nome; 
	
}
