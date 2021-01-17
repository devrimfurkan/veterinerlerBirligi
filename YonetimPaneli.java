package veterinerlerBirligi;

public class YonetimPaneli<T> {

    public void bilgileriGoster(T nesne){
        System.out.println(nesne);
    }
    public <T extends Veteriner> void veterinerMusterileriniGoster(T veteriner){

        veteriner.musterileriListele();
    }
}
