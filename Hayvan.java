package veterinerlerBirligi;

abstract public class Hayvan {
    private String dogumTarihi;
    private boolean kayitli;

    abstract public void bilgileriGoster();

    public Hayvan(String dogumTarihi,boolean kayitli){
        this.dogumTarihi=dogumTarihi;
        this.kayitli=kayitli;
    }

    public void setDogumTarihi(String dogumTarihi){
        this.dogumTarihi=dogumTarihi;
    }
    public void setKayitli(boolean kayitli){
        this.kayitli=kayitli;
    }

    public String getDogumTarihi(){
        return dogumTarihi; }
    public boolean isKayitli(){
        return kayitli; }

    @Override
    public String toString() {
        return "Hayvan{" +
                "dogumTarihi='" + dogumTarihi + '\'' +
                ", kayitli=" + kayitli +
                '}';
    }
}
