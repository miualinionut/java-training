package clean.code.design_patterns.requirements;

public class VLC implements NewMediaPlayer{
    @Override
    public void playVLC(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }
    @Override
    public void playMP4(String fileName){}
    @Override
    public void playWAV(String fileName){}
    @Override
    public void playRAW(String fileName){}

}
