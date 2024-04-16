public class PaimentVirement implements  Paiment{

    @Override
    public void payer() {
        System.out.println("payer par virement");
    }

    public PaimentVirement() {
    }
}
