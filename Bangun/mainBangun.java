public class mainBangun {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang(5,2);
        System.out.println(pp);
        System.out.println(pp.getPanjang());
        System.out.println(pp.getLebar());
        System.out.println(pp.getLuas());
        System.out.println(pp.getKeliling());
        Balok b = new Balok(3,2,6);
        System.out.println(b);
        System.out.println(b.getPanjang());
        System.out.println(b.getLebar());
        System.out.println(b.getTinggi());
        System.out.println(b.getVolume());
        Kotak k = new Kotak(3,4);
        System.out.println(k);
        System.out.println(k.getPanjang());
        System.out.println(k.getLebar());
    }
}
