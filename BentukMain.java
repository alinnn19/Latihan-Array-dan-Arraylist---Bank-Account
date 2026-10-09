public class BentukMain {
    public static void main(String[] args) {
        Bentuk rupa = new Bentuk("HITAM");
        BujurSangkar kotak = new BujurSangkar(5, "MERAH");
        Lingkaran bulat = new Lingkaran(7, "MERAH");
        Silinder tabung = new Silinder (12, 7, "PUTIH");

        rupa.printInfo();
        System.out.println("kotak punya sisi = " + kotak.getSisi());
        kotak.printInfo();
        System.out.println("bulat punya radius = " + bulat.getRadius());
        bulat.printInfo();
        System.out.println("tabung punya radius = " + tabung.getRadius() + " dan punya tinggi = " + tabung.getTinggi());
        tabung.printInfo();

        
    }
}
