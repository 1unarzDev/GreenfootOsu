import greenfoot.*; 

public class Beat extends GameObject
{
    //private int group, time;
    private int speed = Config.getBeatSpeed();
    public Beat(){
        //this.group = group;
        //this.time = time;
        
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
        setLocation(getX(), getY() + speed);
        if (getY() > getWorld().getHeight()) {
            getWorld().removeObject(this);
            }   
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
        }   
}