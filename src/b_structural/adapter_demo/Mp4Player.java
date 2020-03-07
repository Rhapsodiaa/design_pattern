package b_structural.adapter_demo;

/**
 * Created by Technician on 2019-01-16.
 */
public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        //nic nie rób, to player plików MP4!
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Odtwarzam mp4 o nazwie: "+ fileName);
    }
}
