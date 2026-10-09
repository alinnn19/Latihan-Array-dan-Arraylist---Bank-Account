public class Silinder extends Lingkaran{
    double tinggi;
    public Silinder (double tinggi, double radius, String warna){
        super(radius,warna);
        this.tinggi = tinggi;
    }
    public double getTinggi(){
        return tinggi;
    }
    public void setTinggi (double t){
        tinggi = t;
    }
    public double hitungVolume(){
        return hitungLuas() * tinggi;
    }
    @Override 
    public void printInfo(){
        System.out.println("Silinder berwarna [" + warna + "], volume = [" + hitungVolume() + "] \n" );
    }
}
