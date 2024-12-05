package com.example.demo;

public class Gioco {
	private String nome;
	private String casaPr;
	private String dataRilascio;
	private double prezzo;
	private String url;

	public Gioco(String nome, String casaPr, String dataRilascio, double prezzo, String url) {
		this.nome = nome;
		this.casaPr = casaPr;
		this.dataRilascio = dataRilascio;
		this.prezzo = prezzo;
		this.url = url;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCasaPr() {
		return casaPr;
	}

	public void setCasaPr(String casaPr) {
		this.casaPr = casaPr;
	}

	public String getDataRilascio() {
		return dataRilascio;
	}

	public void setDataRilascio(String dataRilascio) {
		this.dataRilascio = dataRilascio;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Gioco [nome=" + nome + ", casaPr=" + casaPr + ", dataRilascio=" + dataRilascio + ", prezzo=" + prezzo
				+ ", url=" + url + "]";
	}

}
