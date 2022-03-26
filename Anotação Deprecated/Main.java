public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato("Siamês");
        Cachorro cachorro = new Cachorro("Pitbull");

        gato.fazerBarulho();
        gato.comer();
        gato.dormir();
        gato.brincarNoParque();

        System.out.println("\n");

        cachorro.fazerBarulho();
        cachorro.comer();
        cachorro.dormir();
        cachorro.brincarNoParque();
    }   
}
