package clean.code.design_patterns.requirements;

public class WAV implements NewMediaPlayer{
    @Override
    public void playVLC(String fileName){}
    @Override
    public void playMP4(String fileName){}
    @Override
    public void playWAV(String fileName){
        System.out.println("Playing WAV file.Name: "+ fileName);
    }
    @Override
    public void playRAW(String fileName){}
}
