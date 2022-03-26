public class Cachorro extends Animal{
    
    public Cachorro(){};
    public Cachorro(String raça){
        this.raça = raça;
    }

    public void fazerBarulho(){
        System.out.println("Au, Au, Au!");
    }

    public void comer(){
        System.out.println("Comendo ração para cachorros");

    }
    
    public void dormir(){
        System.out.println("O cachorro esta dormindo!");
    }

    public void brincarNoParque(){
        System.out.println("O cachorro esta brincando no parque!");
    }
}
