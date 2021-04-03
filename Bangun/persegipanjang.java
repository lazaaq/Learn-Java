public class persegipanjang extends bangun {
    private double panjang, lebar;
    public persegipanjang(String warna, double panjang, double lebar){
        super(warna);
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public double getPanjang(){
        return panjang;
    }
    public double getLebar(){
        return lebar;
    }
    public void setPanjang(double panjang){
        if (panjang > 0 && panjang>=lebar){
            this.panjang = panjang;
        }
    }
    public void setLebar(double lebar){
        if (lebar > 0 && lebar<=panjang){
            this.lebar = lebar;
        }
    }
    public double getLuas(){
        return panjang*lebar;
    }
    public double getKeliling(){
        return 2*(panjang+lebar);
    }
    public String toString(){
        return "Warna : "+getWarna()+", Panjang : "+panjang + ", Lebar : " + lebar +
        ", Luas : "+getLuas() + ", Keliling : "+getKeliling();
    }
}
