package veterinerlerBirligi;

public class Kopek extends Hayvan {

    private int asiSayisi;
    private String tur;
    private String cins;


    public Kopek(String dogumTarihi,boolean kayitli,int asiSayisi,String cins){
        super(dogumTarihi,kayitli);
        this.asiSayisi=asiSayisi;
        this.tur="Kopek";
        this.cins=cins;

    }

    @Override
    public void bilgileriGoster() {
        System.out.println(toString()+super.toString());
    }

    @Override
    public String toString() {
        return "Kopek{" +
                "asiSayisi=" + asiSayisi +
                ", tur='" + tur + '\'' +
                ", cins='" + cins + '\'' +
                '}';
    }
}
