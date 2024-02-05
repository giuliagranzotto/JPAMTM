package it.betacom.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity

public class Clas implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	
	private int id_clas;
	private String name_clas;
	
	/*
	 * @ManyToMany
	 */

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getId_clas() {
		return id_clas;
	}

	public void setId_clas(int id_clas) {
		this.id_clas = id_clas;
	}

	public String getName_clas() {
		return name_clas;
	}

	public void setName_clas(String name_clas) {
		this.name_clas = name_clas;

	}
}

	