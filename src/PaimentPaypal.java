public class PaimentPaypal implements Paiment{

    @Override
    public void payer() {
        System.out.println("payer par Paypal");
    }

    public PaimentPaypal() {
    }
}
