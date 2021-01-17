package veterinerlerBirligi;

public class Kedi extends Hayvan {

    private String tur;
    private String cins;

    public Kedi(String dogumTarihi,boolean kayitli,String cins){
        super(dogumTarihi,kayitli);
        this.tur="Kedi";
        this.cins=cins;
    }


    @Override
    public void bilgileriGoster() {
        System.out.println(toString()+super.toString());
    }

    @Override
    public String toString() {
        return "Kedi{" +
                "tur='" + tur + '\'' +
                ", cins='" + cins + '\'' +
                '}';
    }
}
