package veterinerlerBirligi;

import java.util.ArrayList;

public class Veteriner extends Kisi {

    private String meuznOlduguOkul;
    private String calismaSuresi;
    private ArrayList<Musteri> veterinerMusterileri;
    private int musteriSayisi;
    public Veteriner(String meuznOlduguOkul,String calismaSuresi,String tcKimlik,String isim){
        super(tcKimlik,isim);
        this.meuznOlduguOkul=meuznOlduguOkul;
        this.calismaSuresi=calismaSuresi;
        veterinerMusterileri=new ArrayList<>();
        musteriSayisi=0;
    }
    @Override
    public void kendiniTanit() {
        System.out.println(toString()+" Ben bir Veterinerim.");
    }

    public void musteriEkle(Musteri musteri){
        veterinerMusterileri.add(musteri);
        musteriSayisi++;
    }
    public void musterileriListele(){
        for (Musteri m:veterinerMusterileri)
            m.kendiniTanit();
    }
    public void toplamMusteri(){
        System.out.println("Toplam Müşteri Sayısı: " +musteriSayisi);
    }


    @Override
    public String toString() {
        return super.toString()+" Veteriner{" +
                "meuznOlduguOkul='" + meuznOlduguOkul + '\'' +
                ", calismaSuresi='" + calismaSuresi + '\'' +
                '}';
    }
}
