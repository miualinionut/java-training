package clean.code.design_patterns.requirements;

public class MP4 implements NewMediaPlayer {
    @Override
    public void playVLC(String fileName){}
    @Override
    public void playMP4(String fileName){
        System.out.println("Playing MP4 file.Name: "+ fileName);
    }
    @Override
    public void playWAV(String fileName){}
    @Override
    public void playRAW(String fileName){}
}
