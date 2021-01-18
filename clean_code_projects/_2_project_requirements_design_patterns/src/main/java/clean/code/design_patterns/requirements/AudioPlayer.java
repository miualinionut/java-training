package clean.code.design_patterns.requirements;

public class AudioPlayer implements MediaPlayer{
    MediaAdapter adapt;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equals("MP3")){
            System.out.println("Playing MP3 file. Name: " + fileName);
        }
        else if(audioType.equals("VLC") || audioType.equals("MP4") || audioType.equals("WAV") || audioType.equals("RAW")){
            adapt = new MediaAdapter(audioType);
            adapt.play(audioType, fileName);
        }
        else System.out.println("The format" + audioType + "is not supported.Try another!");
    }
     public static void main(String[] args) {
        AudioPlayer media = new AudioPlayer();

        media.play("MP3", "song1.mp3");
        media.play("MP4", "song2.mp4");
        media.play("VLC", "song3.vlc");
        media.play("WAV", "song4.wav");
        media.play("RAW", "song5.raw");
        media.play("AU", "song6.au");
        media.play("AUDIO", "song7.audio");

    }

}
