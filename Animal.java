public abstract class Animal{
    public String raça;

    public abstract void fazerBarulho();

    public abstract void comer();

    public abstract void dormir();
    
    @Deprecated
    public abstract void brincarNoParque();
}