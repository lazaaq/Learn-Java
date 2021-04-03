public class Balok extends Bangun {
    private int tinggi, volume;
    public Balok(int panjang, int lebar, int tinggi){
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    //setter
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    //getter
    public int getTinggi(){
        return tinggi;
    }
    public int getVolume(){
        volume = getPanjang()*getLebar()*getTinggi();
        return volume;
    }
    //toString
    public String toString(){
        return "panjang = "+getPanjang() + ", lebar = " + getLebar() + ", tinggi = "+ getTinggi() + ", volume = "+volume;
    }

}
