package org.idrice24.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="classe")
public class Classe{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name="classe_name")
	private String classe_name;

	@Column(name="sect")
	private String sect;

	public Classe(){}

	public void setId(long id){
		this.id = id;
	}

	public long getId(){
		return id;
	}

	public void setClasseName(String classe_name){
		this.classe_name = classe_name;
	}

	public String getClasseName(){
		return classe_name;
	}

	public void setSect(String sect){
		this.sect = sect;
	}

	public String getSect(){
		return sect;
	}
}
