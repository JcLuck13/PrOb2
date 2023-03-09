package Modelo;
/**
 * @author JcLuck
 *
 */
public class Partida {
	private int Val_resultado;
	private Superhero Atacante;
	private Superhero Victima;
	private Escudo escudo;
	private Arma arma;
	
	public Partida () {}
	//Los defino getters y setters

	public int getVal_resultado() {
		return Val_resultado;
	}

	public void setVal_resultado(int val_resultado) {
		Val_resultado = val_resultado;
	}

	public Superhero getAtacante() {
		return Atacante;
	}

	public void setAtacante(Superhero atacante) {
		Atacante = atacante;
	}

	public Superhero getVictima() {
		return Victima;
	}

	public void setVictima(Superhero victima) {
		Victima = victima;
	}

	public Escudo getEscudo() {
		return escudo;
	}

	public void setEscudo(Escudo escudo) {
		this.escudo = escudo;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}
}
