public class PersegiPanjang extends Bangun{
    private int luas, keliling;
    public PersegiPanjang(int panjang, int lebar){
        super(panjang, lebar);
    }
    public int getLuas(){
        luas = getPanjang() * getLebar();
        return luas;
    }
    public int getKeliling(){
        keliling = 2*(getPanjang()+getLebar());
        return keliling;
    }
    public String toString(){
        return "panjang = "+getPanjang() + ", lebar = " + getLebar() + ", keliling = "+ getKeliling() + ", luas = "+getLuas();
    }
}
