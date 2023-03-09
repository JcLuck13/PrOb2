package Modelo;
/**
 * @author JcLuck
 *
 */
public class Arma {
	private String arma;
	private int Val_resultado;
	
	public Arma (String arma, int Val_resultado) {
		this.arma=arma;
		this.Val_resultado=Val_resultado;
	}
	public Arma () {}
	//Luego los defino getters y setters
	public String getArma() {
		return arma;
	}
	public void setArma(String arma) {
		this.arma = arma;
	}
	public int getVal_resultado() {
		return Val_resultado;
	}
	public void setVal_resultado(int val_resultado) {
		Val_resultado = val_resultado;
	}
}