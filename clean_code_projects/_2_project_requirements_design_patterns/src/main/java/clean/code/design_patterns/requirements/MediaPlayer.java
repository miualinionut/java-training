package clean.code.design_patterns.requirements;

// Adapter Design Pattern
// Avem un mediaplayer care suporta numai fisiere de tip mp3, insa ne dorim sa-l adaptam pentru a putea sa reda
// si fisiere de tip vlc, mp4, wav si raw.

public interface MediaPlayer {
    public void play(String audioType, String fileName);
}
