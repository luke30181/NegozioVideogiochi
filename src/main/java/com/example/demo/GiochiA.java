package com.example.demo;

public class GiochiA extends Gioco {
	int qnt;

	public GiochiA(String nome, String casaPr, String dataRilascio, double prezzo, String url, int qnt) {
		super(nome, casaPr, dataRilascio, prezzo, url);
		this.qnt = qnt;
	}

	public int getQnt() {
		return qnt;
	}

	public void setQnt(int qnt) {
		this.qnt = qnt;
	}

	@Override
	public String toString() {
		return "GiochiA [qnt=" + qnt + "]";
	}

}
