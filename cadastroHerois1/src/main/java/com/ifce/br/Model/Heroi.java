package com.ifce.br.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Heroi {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

private long ID;
	
	@Column(name = "Nome")
private String Nome;
	@Column(name = "Classe")

private String Classe;
	@Column(name = "Ranking")

private String Ranking;
	@Column(name = "Poder")

private String Poder;

public Heroi(){
	
}

public long getID() {
	return ID;
}
public void setID(long iD) {
	ID = iD;
}
public String getNome() {
	return Nome;
}
public void setNome(String nome) {
	Nome = nome;
}
public String getClasse() {
	return Classe;
}
public void setClasse(String classe) {
	Classe = classe;
}
public String getRanking() {
	return Ranking;
}
public void setRanking(String ranking) {
	Ranking = ranking;
}
public String getPoder() {
	return Poder;
}
public void setPoder(String poder) {
	Poder = poder;
}


}
