package com.example.demo;

public class GiocoSub extends GiochiA {
	double prezzoSub;

	public GiocoSub(String nome, String casaPr, String dataRilascio, double prezzo, String url, int qnt,
			double prezzoSub) {
		super(nome, casaPr, dataRilascio, prezzo, url, qnt);
		this.prezzoSub = prezzoSub;
	}

	public double getPrezzoSub() {
		return prezzoSub;
	}

	public void setPrezzoSub(double prezzoSub) {
		this.prezzoSub = prezzoSub;
	}
}
