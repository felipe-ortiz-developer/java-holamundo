package poo;

public class Caballo extends Animal {
	private String altura;
	
	public String getTipo() {
		return "Caballo Rapido terrestre";
	}
	public Caballo(String altura) {
		super();
		this.altura = altura;
	}
	
	public String getAltura(){
		return this.altura;
	}
}
