package org.lessons.java.shop;

public class Smartphone extends Prodotto {

	private float memory;
	private long imei;	

	public Smartphone(String nome, String marca, float prezzo, float iva, float memory, long imei) {
		super(nome, marca, prezzo, iva);
		this.memory = memory;
		this.imei = imei;
	}

	public float getMemory() {
		return memory;
	}

	
	public void setMemory(float memory) {
		this.memory = memory;
	}
	
	public long getImei() {
		return imei;
	}

	public void setImei(long imei) {
		this.imei = imei;
	}
	

}
