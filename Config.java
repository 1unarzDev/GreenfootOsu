import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Config {
    private static final int HEIGHT = 800;
    private static final int WIDTH = 1200;
    private static final int BEAT_SIZE = 50;
    private static final int BEAT_SPEED = 10;
    private static final int COOLDOWN = 40;
    private static final int PERFECT_SCORE = 100;
    
    public static int getHeight()
    {
        return HEIGHT;
    }
    
    public static int getWidth()
    {
        return WIDTH;
    }
    
    public static int getBeatSize()
    {
        return BEAT_SIZE;
    }
    
    public static int getBeatSpeed()
    {
        return BEAT_SPEED;
    }
    
    public static int getCooldown()
    {
        return COOLDOWN;
    }
    
    public static int getPerfectScore()
    {
        return PERFECT_SCORE;
    }
}

