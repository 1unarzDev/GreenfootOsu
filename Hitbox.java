import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hitbox extends GameObject
{
    private int hitboxNumber;
    private GreenfootSound music;
    private long lastPressTime = System.currentTimeMillis();
    private int cooldownTime = Config.getCooldown();
    private Score score;
    
    public Hitbox(int hitboxNumber, Score score)
    {
        this.hitboxNumber = hitboxNumber;
        this.score = score;
        GreenfootImage image = new GreenfootImage(50, 50);
        image.setColor(Color.BLACK);
        image.fillRect(0, 0, 50, 50);
        setImage(image);
    }

    public int getHitBoxNumber() 
    {
        return hitboxNumber;
    }
    
    public void act()
    {
        if(cooldown())
        {
            switch (hitboxNumber)
            {
                case 0:
                    if(Greenfoot.isKeyDown("f"))
                        if(isTouching(Beat.class))
                        {
                            deleteBeat();
                        }
                        else
                        {
                            missed();
                        }
                    break;
                case 1:
                    if(Greenfoot.isKeyDown("g"))
                        if(isTouching(Beat.class))
                        {
                            deleteBeat();
                        }
                        else
                        {
                           missed();
                        }
                    break;
                case 2:
                    if(Greenfoot.isKeyDown("h"))
                        if(isTouching(Beat.class))
                        {
                            deleteBeat();
                        }
                        else
                        {
                            missed();
                        }
                    break;
                case 3:
                    if(Greenfoot.isKeyDown("j"))
                        if(isTouching(Beat.class))
                        {
                            deleteBeat();
                        }
                        else
                        {
                            missed();
                        }
                    break;
                default:
                    System.out.println("Unknown hitbox");
                    break;
            }
        }
    }
    
    private void missed()
    {
        score.incrementScore(-Config.getPerfectScore());
        music = new GreenfootSound("21_wood1.wav");
        music.play();
    }
    
    private void deleteBeat() 
    {
        Beat beat = (Beat) getOneIntersectingObject(Beat.class);
        if (beat != null) 
        {
            score.incrementScore(calcScore(beat, Config.getPerfectScore()));
            getWorld().removeObject(beat);
        }
    }
    
    private boolean cooldown()
    {
        if (System.currentTimeMillis() - lastPressTime >= cooldownTime) 
        {
            lastPressTime = System.currentTimeMillis();
            return true;
        }
        return false;
    }
    
    private int calcScore(Beat beat, int perfectScore)
    {
        int dist = Math.abs(this.getY() - beat.getY()) / 10;
        return (dist == 0 ? perfectScore : (perfectScore / dist));
    }
}
