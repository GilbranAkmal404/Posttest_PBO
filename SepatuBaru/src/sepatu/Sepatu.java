
package sepatu;

abstract class Sepatu {
    protected final String merk;
    protected final int ukuran;

    public Sepatu(String merk, int ukuran) {
        this.merk = merk;
        this.ukuran = ukuran;
    }

    public abstract void displayInfo();
}