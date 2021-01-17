package veterinerlerBirligi;

import java.util.ArrayList;

public class SehirVeterinerleri {

    private String sehir;
    private ArrayList<Veteriner> sehirdekiVeterinerler;
    private int toplamVeterinerSayisi;

    public SehirVeterinerleri(String sehir){
        this.sehir=sehir;
        sehirdekiVeterinerler =new ArrayList<>();
        toplamVeterinerSayisi=0;
    }
    public void sehireVeterinerEkle(Veteriner veteriner){
        sehirdekiVeterinerler.add(veteriner);
        toplamVeterinerSayisi++;
    }
    public void sehirdekiToplamVeterinerler(){
        System.out.println(toplamVeterinerSayisi);
    }
}
