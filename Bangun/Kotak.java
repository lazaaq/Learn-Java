public class Kotak extends Bangun{
    public Kotak(int panjang, int lebar){
        super(panjang, lebar);
    }
    public String toString(){
        return "panjang = "+getPanjang() + ", lebar = " + getLebar();
    }
}
