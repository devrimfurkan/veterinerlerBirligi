package veterinerlerBirligi;

public class Musteri extends Kisi {

    private String adres;


    public Musteri(String adres,String tcKimlik,String isim){
        super(tcKimlik,isim);
        this.adres=adres;
    }
    @Override
    public void kendiniTanit() {
        System.out.println(toString()+" Ben bir Müşteriyim.");
    }

    @Override
    public String toString() {
        return super.toString()+" Musteri{" +
                "adres='" + adres + '\'' +
                '}';
    }
}
