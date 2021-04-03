public class Bangun {
    private int panjang, lebar, luas, keliling;
    public Bangun(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    //setter
    public void setPanjang(int panjang){
        this.panjang = panjang;
    }
    public void setLebar(int lebar){
        this.lebar = lebar;
    }
    //getter
    public int getPanjang(){
        return panjang;
    }
    public int getLebar(){
        return lebar;
    }
}
