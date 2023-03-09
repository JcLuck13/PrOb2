package Modelo;
/**
 * @author JcLuck
 *
 */
public class Superhero {
	private String nom_heroe;
	private int Salud;
	
	public Superhero(String Orus, int Salud) {
		this.nom_heroe=nom_heroe;
		this.Salud=Salud;
	}
	public Superhero () {}
	//Luego los defino getters y setters
	public String getNom_heroe() {
		return nom_heroe;
	}
	public void setNom_heroe(String nom_heroe) {
		this.nom_heroe = nom_heroe;
	}
	public int getSalud() {
		return Salud;
	}
	public void setSalud(int salud) {
		Salud = salud;
	}
}
