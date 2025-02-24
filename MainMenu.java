import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MainMenu extends World
{
    public MainMenu()
    {          
        super(1200, 800, 1); 
        GreenfootImage background = new GreenfootImage(getWidth(), getHeight());
        background.setColor(Color.BLACK);
        background.fillRect(0, 0, getWidth(), getHeight());
        setBackground(background);
    }
}
