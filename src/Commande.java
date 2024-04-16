public class Commande {

    private Paiment paiment;

    public void effctuerPaiment(){
        paiment.payer();
    }

    public Commande(Paiment paiment) {
        this.paiment = paiment;
    }

    public void setPaiment(Paiment paiment) {
        this.paiment = paiment;
    }

    public Paiment getPaiment() {
        return paiment;
    }
}
