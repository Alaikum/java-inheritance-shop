package org.lessons.java.shop;

public class Televisore extends Prodotto {

	private boolean smart;
	private float x, y, z;

	public Televisore(String nome, String marca, float prezzo, float iva, boolean smart, float x, float y, float z) {
		super(nome, marca, prezzo, iva);
		this.smart = smart;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {

		this.smart = smart;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}

	@Override
	public String toString() {

		String dati = super.toString();
		dati = dati + "\nIl Televisore ha anche queste qualità \nDimensioni in cm " + getX() + "/" + getX() + "/"
				+ getX() + "\nFunzione Smart: " + isSmart();
		return dati;
	}

}
