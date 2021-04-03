public class balok extends persegipanjang {
    private double tinggi;
    public balok(String warna, double panjang, double lebar, double tinggi){
        super(warna, panjang, lebar);
        this.tinggi = tinggi;
    }
    public double getTinggi(){
        return tinggi;
    }
    public void setTinggi(double tinggi){
        if (tinggi > 0){
            this.tinggi = tinggi;
        }
    }
    public double getLuas(){
        return 2*(getPanjang()*getLebar() + getPanjang()*getTinggi() + getLebar()*getTinggi());
    }
    public double getKeliling(){
        return 4*(getPanjang() + getLebar() + getTinggi());
    }
    public double getVolume(){
        return getPanjang()*getLebar()*getTinggi();
    }
    public String toString(){
        return "Panjang : "+ getPanjang() + ", Lebar : "+ getLebar()+
        ", Tinggi : "+ getTinggi() +", Warna : "+ getWarna() + 
        ", Luas : " + getLuas() + ", Keliling : " + getKeliling() + ", Volume : "+ getVolume();
    }
}
