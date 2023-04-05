
public class Cane extends Animale{

	boolean isFelice;
	Cane(String nome, String genere, int zampe, String verso, String movimento, boolean isParolaFemminile,boolean iniziaConVocale, boolean isFelice ) {
		super(nome, genere, zampe, verso, movimento, isParolaFemminile,iniziaConVocale);
		// TODO Auto-generated constructor stub
		this.isFelice=isFelice;
	}
	
	public void gioca() {
		System.out.println("Al cane piace giocare con la palla");
	}
	
	public void sentimento() {
		if(isFelice) {
			System.out.println("Il cane scodinsola");
		}
	}
}
