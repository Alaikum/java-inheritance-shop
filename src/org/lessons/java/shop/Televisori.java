package org.lessons.java.shop;

public class Televisori extends Prodotto {

	private boolean smart;
	private float h,l,p;
	public Televisori(String nome, String marca, float prezzo, float iva, boolean smart, float h, float l, float p) {
		super(nome, marca, prezzo, iva);
		this.smart = smart;
		this.h = h;
		this.l = l;
		this.p = p;
	}
	
	public boolean isSmart() {
		return smart;
	}
	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	public float getH() {
		return h;
	}
	public void setH(float h) {
		this.h = h;
	}
	public float getL() {
		return l;
	}
	public void setL(float l) {
		this.l = l;
	}
	public float getP() {
		return p;
	}
	public void setP(float p) {
		this.p = p;
	}
	
	
	}

}
