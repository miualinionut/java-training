package clean.code.design_patterns.requirements;

public class Settings {

    private static volatile Settings instance;
    private Short volumeLevel;
    private Short musicLevel;
    private boolean enhancedGraphicsMode;
    private boolean stereoSound;

    private Settings() {
        this.volumeLevel = 255;
        this.musicLevel = 255;
        this.enhancedGraphicsMode = true;
        this.stereoSound = false;
    }

    public static Settings getInstance()
    {
        if(instance == null)
        {
            synchronized (Settings.class)
            {
                if(instance == null)
                {
                    instance = new Settings();
                }
            }
        }
        return instance;
    }

    public static void changeVolume(int newValue)
    {
        if(newValue <= 0)
            instance.volumeLevel = 0;
        else if(newValue >=255)
            instance.volumeLevel = 255;
        else
            instance.volumeLevel = (short)newValue;
    }

    public static void changeMusic(int newValue)
    {
        if(newValue <= 0)
            instance.musicLevel = 0;
        else if(newValue >=255)
            instance.musicLevel = 255;
        else
            instance.musicLevel = (short)newValue;
    }

    public static void toggleEG()
    {
        if(instance.enhancedGraphicsMode)
            instance.enhancedGraphicsMode = false;
        else
            instance.enhancedGraphicsMode = true;
    }

    public static void toggleEG(boolean val)
    {
        instance.enhancedGraphicsMode = val;
    }

    public static void toggleSS()
    {
        if(instance.stereoSound)
            instance.stereoSound = false;
        else
            instance.stereoSound = true;
    }

    public static void toggleSS(boolean val)
    {
        instance.stereoSound = val;
    }

    public static void showSettings()
    {
        System.out.println("Volume: " + instance.volumeLevel);
        System.out.println("Music: " + instance.musicLevel);
        System.out.println("Enhanced Graphics: " + instance.enhancedGraphicsMode);
        System.out.println("Stereo sound: " + instance.stereoSound);
        System.out.println();
    }
}
