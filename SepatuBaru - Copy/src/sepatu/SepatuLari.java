
package sepatu;

class SepatuLari extends Sepatu {
    private final String jenis;

    public SepatuLari(String merk, int ukuran, String jenis) {
        super(merk, ukuran);
        this.jenis = jenis;
    }

    @Override
    public void displayInfo() {
        System.out.println("Sepatu Lari:");
        System.out.println("Merk: " + merk);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Jenis: " + jenis);
    }
}
