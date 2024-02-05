package it.betacom.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;
@Entity
public class Teacher implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id_teacher;
	private String name_teacher;
	private String subject;
	
	@ManyToMany(targetEntity = Clas.class)
	private Set clasSet;
	
	public Teacher(String name_teacher, String subject, Set clasSet) {
		super();
		this.name_teacher = name_teacher;
		this.subject = subject;
		this.clasSet = clasSet;
	}

	public Teacher() {
		super();
		
	}

	public int getId_teacher() {
		return id_teacher;
	}

	public void setId_teacher(int id_teacher) {
		this.id_teacher = id_teacher;
	}

	public String getName_teacher() {
		return name_teacher;
	}

	public void setName_teacher(String name_teacher) {
		this.name_teacher = name_teacher;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
	
	