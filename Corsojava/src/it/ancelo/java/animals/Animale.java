package it.ancelo.java.animals;

public abstract class Animale {
	private String nome;
	private String genere;
	private int zampe;
	private String verso;
	private String movimento;
	private boolean isParolaFemminile;
	private boolean iniziaConVocale;

	Animale(String nome, String genere, int zampe, String verso, String movimento, boolean isParolaFemminile,
			boolean iniziaConVocale) {
		this.nome = nome;
		this.genere = genere;
		this.zampe = zampe;
		this.movimento = movimento;
		this.verso = verso;
		this.isParolaFemminile = isParolaFemminile;
		this.iniziaConVocale = iniziaConVocale;
	}

	public void descrizione() {
		System.out.println((isParolaFemminile ? (iniziaConVocale ? "L' " : "La ") : "Il ") + nome + " ha " + zampe
				+ " zampe" + " ed è un " + genere);
	}

	public void verso() {
		System.out.println((isParolaFemminile ? (iniziaConVocale ? "L' " : "La ") : "Il ") + nome + " " + verso);

	}

	public void movimento() {
		System.out.println((isParolaFemminile ? (iniziaConVocale ? "L' " : "La ") : "Il ") + nome + " " + movimento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public int getZampe() {
		return zampe;
	}

	public void setZampe(int zampe) {
		this.zampe = zampe;
	}

	public String getVerso() {
		return verso;
	}

	public void setVerso(String verso) {
		this.verso = verso;
	}

	public String getMovimento() {
		return movimento;
	}

	public void setMovimento(String movimento) {
		this.movimento = movimento;
	}

	public boolean isParolaFemminile() {
		return isParolaFemminile;
	}

	public void setParolaFemminile(boolean isParolaFemminile) {
		this.isParolaFemminile = isParolaFemminile;
	}

	public boolean isIniziaConVocale() {
		return iniziaConVocale;
	}

	public void setIniziaConVocale(boolean iniziaConVocale) {
		this.iniziaConVocale = iniziaConVocale;
	}

}
