package clean.code.design_patterns.requirements;

public class RAW implements  NewMediaPlayer{
    @Override
    public void playVLC(String fileName){}
    @Override
    public void playMP4(String fileName){}
    @Override
    public void playWAV(String fileName){}
    @Override
    public void playRAW(String fileName){
        System.out.println("Playing RAW file.Name: "+ fileName);
    }
}
