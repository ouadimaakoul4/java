package chien;

public class chien {
private String nom;
private String race;

public chien(String nom, String race) {
	this.nom=nom;
	this.race=race;
}
public String getNom() {
	return nom;
}
public String getRace() {
	return race;
}
public void  setNom(String nom) {
	this.nom=nom;
}
public void  setRace(String race) {
	this.race=race;
}
}
