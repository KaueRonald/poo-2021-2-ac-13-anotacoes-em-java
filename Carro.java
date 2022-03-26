public class Carro {

	public void iniciar() {
		System.out.println("Início Padrão");
	}
	public void acelerar() {
		System.out.println("Aceleração Padrão");
	}
	public void frear() {
		System.out.println("Frenagem Padrão");
	}
	
public static void main(String[] args) {
	
	Carro gol = new Gol();
	
	gol.iniciar();
	gol.acelerar();
	gol.frear();
	
	System.out.println();
}
}

class Gol extends Carro{
	
	@Override
	public void iniciar() {
		System.out.println("Iniciando Gol");
	}
  @Override
	public void acelerar() {
		System.out.println("Acelerando Gol");
	}
	public void frear() {
		System.out.println("freando Gol");
	}
}
