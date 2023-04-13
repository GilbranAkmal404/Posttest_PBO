
package sepatu;

class SepatuBasket extends Sepatu {
    private final String tipe;

    public SepatuBasket(String merk, int ukuran, String tipe) {
        super(merk, ukuran);
        this.tipe = tipe;
    }

    @Override
    public void displayInfo() {
        System.out.println("Sepatu Basket:");
        System.out.println("Merk: " + merk);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Tipe: " + tipe);
    }
}