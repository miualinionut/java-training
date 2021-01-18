package clean.code.design_patterns.requirements;

public class MediaAdapter implements MediaPlayer{
    NewMediaPlayer newPlayer;

    public MediaAdapter(String audioType){
        switch (audioType) {
            case "VLC":
                newPlayer = new VLC();
                break;
            case "MP4":
                newPlayer = new MP4();
                break;
            case "WAV":
                newPlayer = new WAV();
                break;
            default:
                newPlayer = new RAW();
                break;
        }
    }
    @Override
    public void play(String audioType, String fileName) {

        switch (audioType) {
            case "VLC":
                newPlayer.playVLC(fileName);
                break;
            case "MP4":
                newPlayer.playMP4(fileName);
                break;
            case "WAV":
                newPlayer.playRAW(fileName);
                break;
            default:
                newPlayer.playRAW(fileName);
                break;
        }
    }
}
