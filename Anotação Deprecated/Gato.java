public class Gato extends Animal{
    
    public Gato(){};

    public Gato(String raça){
        this.raça = raça;
    }

    public void fazerBarulho(){
        System.out.println("Miau, Miau, Miau");
    }

    public void comer(){
        System.out.println("Comendo ração para gatos");

    }

    public void dormir(){
        System.out.println("O gato está dormindo!");
    }

    public void brincarNoParque(){
        System.out.println("O gato esta brincando no parque!");
    }
}
