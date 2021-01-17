package veterinerlerBirligi;

public class Main {
    public static void main(String[] args) {

        ilkNesneleriGoster();

    }

    private static void ilkNesneleriGoster() {
        Kedi kedi1=new Kedi("25-06-2018",true,"Short hair");
        Kedi kedi2=new Kedi("16-03-2017",false,"British");
        Kedi kedi3=new Kedi("07-03-2019",true,"Van Kedisi");

        Kopek kopek1=new Kopek("25-10-2017",true,3,"Golden");
        Kopek kopek2=new Kopek("11-05-2020",false,0,"Pitbull");
        Kopek kopek3=new Kopek("03-07-2019",true,5,"Lucy");

        Musteri m1=new Musteri("Ankara","123","Emre");
        Musteri m2=new Musteri("İstanbul","456","Asiye");
        Musteri m3=new Musteri("Zonguldak","789","Kerem");
        m1.MusteriHayvanlari(kopek1);
        m1.MusteriHayvanlari(kedi2);

        Veteriner v1=new Veteriner("Kırklareli","3","101112","Hakan");
        Veteriner v2=new Veteriner("Marmara","7","131415","Merve");
        Veteriner v3=new Veteriner("Beü","5","161718","Ayça");

        v1.musteriEkle(m1);
        v1.musteriEkle(m2);
        v1.musterileriListele();

        System.out.println("---------------------");
        SehirVeterinerleri ankara=new SehirVeterinerleri("ankara");
        ankara.sehireVeterinerEkle(v1);
        ankara.sehirdekiToplamVeterinerler();

    }
}
