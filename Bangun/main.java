public class main {
    public static void main(String[] args) {
        System.out.println("-----------------Bangun-------------------");
        bangun bang = new bangun("merah");
        System.out.println(bang);
        bang.setWarna("merah muda");
        System.out.println(bang.getWarna());

        System.out.println();
        System.out.println("--------------Persegi Panjang------------");

        persegipanjang pp = new persegipanjang("biru", 5.3, 4);
        System.out.println(pp.getWarna());
        System.out.println(pp.getLuas());
        System.out.println(pp.getKeliling());
        pp.setLebar(10);
        pp.setPanjang(0);
        System.out.println(pp);
        pp.setWarna("biru langit");
        System.out.println(pp);
    
        System.out.println();
        System.out.println("---------------------Balok---------------");
        balok bal = new balok("ungu", 5.3, 4, 6);
        System.out.println(bal.getWarna());
        System.out.println(bal.getLuas());
        System.out.println(bal.getVolume());
        System.out.println(bal.getKeliling());
        System.out.println(bal);
        bal.setWarna("violet");
        System.out.println(bal);

    }
}