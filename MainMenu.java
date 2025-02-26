import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MainMenu extends World
{
    public MainMenu()
    {          
        super(1200, 800, 1); 
        GreenfootImage background = new GreenfootImage(Config.getWidth(), Config.getHeight());
        background.setColor(Color.WHITE);
        background.fillRect(0, 0, Config.getWidth(), Config.getHeight());
        setBackground(background);
        prepare();
    }
    private void prepare()
    {
        GreenfootImage bg = new GreenfootImage("TemuTapper.png");
        bg.scale(Config.getWidth(), Config.getHeight());
        this.setBackground(bg);
    }
    public void act(){
        if(Greenfoot.isKeyDown("s")){
            Greenfoot.setWorld(new Map());
            Greenfoot.playSound("start.wav");
        }
        if(Greenfoot.isKeyDown("c")){
            Greenfoot.setWorld(new Credits());
            Greenfoot.playSound("start.wav");
        }
        if(Greenfoot.isKeyDown("i")){
            Greenfoot.setWorld(new Instructions());
            Greenfoot.playSound("start.wav");
        }
    }
} 
