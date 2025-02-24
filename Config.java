import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Config {
    private static final int HEIGHT = 800; // world height - px 
    private static final int WIDTH = 600; // world width - px
    private static final String[] KEYS = new String[]{"f", "g", "h", "j"}; // game keys for each column
    private static final int[] BUFFERS = new int[]{0, 20, 40, 80}; // great, good, meh, miss - ms
    private static final int SPEED = 60; // game speed - fps
    private static final int STEP = WIDTH / KEYS.length;
    private static final int NOTE_SCALE = 1;
    private static final Color NOTE_COLOR = new Color(100, 0, 0);
    
    public static int getHeight()
    {
        return HEIGHT;
    }
    
    public static int getWidth()
    {
        return WIDTH;
    }
    
    public static String[] getKeys()
    {
        return KEYS;
    }
    
    public static int[] getBuffers()
    {
        return BUFFERS;
    }
    
    public static int getSpeed()
    {
        return SPEED;
    }
    
    public static int getStep()
    {
        return STEP;
    }
    
    public static int getNoteScale()
    {
        return NOTE_SCALE;
    }
    
    public static Color getNoteColor()
    {
        return NOTE_COLOR;
    }
}