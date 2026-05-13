public abstract class ProcesLivrare {


    public final void executaLivrare() {
        preluareColet();
        transportColet();
        predareColet();
        System.out.println("-> Status: Livrare finalizata cu succes!");
    }

    protected abstract void preluareColet();
    protected abstract void transportColet();
    protected abstract void predareColet();
}