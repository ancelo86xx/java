
public abstract class Animale {
	String nome;
	String genere;
	int zampe;
	String verso;
	String movimento;
	boolean isParolaFemminile;
	boolean iniziaConVocale;

	
	Animale(String nome,String genere,int zampe,String verso,String movimento,boolean isParolaFemminile,boolean iniziaConVocale ){
		this.nome=nome;
		this.genere=genere;
		this.zampe=zampe;
		this.movimento=movimento;
		this.verso=verso;
		this.isParolaFemminile=isParolaFemminile;
		this.iniziaConVocale=iniziaConVocale;
	}
	void descrizione() {
		System.out.println((isParolaFemminile? (iniziaConVocale? "L' " : "La ") : "Il ") + nome+ " ha " + zampe+" zampe"+ " ed è un " + genere);
	}
	void verso() {
		System.out.println((isParolaFemminile? (iniziaConVocale? "L' " : "La ") : "Il ") + nome + " "+  verso);
	
	}
	void movimento() {
		System.out.println((isParolaFemminile? (iniziaConVocale? "L' " : "La ") : "Il ") + nome + " "+  movimento);
	}
}
