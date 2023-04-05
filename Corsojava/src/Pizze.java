
public class Pizze {

	String impasto;
	String salsa;
	String formaggio;
	String extra;
	
	Pizze(String impasto, String salsa, String formaggio, String extra){
		this.impasto = impasto;
		this.salsa=salsa;
		this.formaggio=formaggio;
		this.extra=extra;
	}
	
	Pizze(String impasto){
		this.impasto = impasto;
	}
	
	Pizze(String impasto, String salsa){
		this.impasto = impasto;
		this.salsa=salsa;
	}
	
	Pizze(String impasto, String salsa, String formaggio){
		this.impasto = impasto;
		this.salsa=salsa;
		this.formaggio=formaggio;
	}
	public String ciao() {
		String string = this.impasto + this.salsa;
		return string;
	}
}
