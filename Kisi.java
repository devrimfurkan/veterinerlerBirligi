package veterinerlerBirligi;

import java.util.ArrayList;

abstract public class Kisi {
    private String tcKimlik;
    private String isim;
    private ArrayList<Hayvan> musteriHayvanlari;

    public Kisi(String tcKimlik,String isim){
        this.tcKimlik=tcKimlik;
        this.isim=isim;
        musteriHayvanlari=new ArrayList<>();
    }
    public void MusteriHayvanlari(Hayvan hayvan){
        musteriHayvanlari.add(hayvan);
        System.out.println(hayvan+""+getIsim()+" Musterisine eklendi.");
    }

    public String getIsim(){ return isim; }
    abstract public void kendiniTanit();

    @Override
    public String toString() {
        return "Kisi{" +
                "tcKimlik='" + tcKimlik + '\'' +
                ", isim='" + isim + '\'' +
                '}';
    }
}
