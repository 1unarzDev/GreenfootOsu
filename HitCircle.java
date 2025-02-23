import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/*
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.io.File;
import javax.imageio.ImageIO;
*/

public class HitCircle extends GameObject
{
    private int group, time;
    
    public HitCircle(int group, int time, Color color){
        this.group = group;
        this.time = time;
        
        GreenfootImage img = new GreenfootImage("beat.png");
        img.scale(Config.getBeatSize(), Config.getBeatSize());
        // colorFilter(img, color);
        
        this.setImage(img);
    }
    
    /*
    private void colorFilter(GreenfootImage img, Color color){
        BufferedImage bimg = img.getAwtImage();
        
        
        img.dbimg.toGreenfootImage();
    }
    */
    
    public void act()
    {
        
    }
}