import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hitbox extends GameObject
{
    private int hitboxNumber;
    private GreenfootSound music;
    private long lastPressTime = System.currentTimeMillis();
    private int cooldownTime = Config.getCooldown();
    public Hitbox(int hitboxNumber) {
        this.hitboxNumber = hitboxNumber;
        GreenfootImage image = new GreenfootImage(50, 50);
        image.setColor(Color.BLACK);
        image.fillRect(0, 0, 50, 50);
        setImage(image);
    }

    public int getHitBoxNumber() {
        return hitboxNumber;
    }
    public void act(){
        if(cooldown()){
            switch (hitboxNumber){
                case 0:
                    if(Greenfoot.isKeyDown("f"))
                        if(isTouching(Beat.class)){
                            deleteBeat();
                        }
                        else{
                            music = new GreenfootSound("21_wood1.wav");
                            music.play();
                        }
                    break;
                case 1:
                    if(Greenfoot.isKeyDown("g"))
                        if(isTouching(Beat.class)){
                            deleteBeat();
                        }
                        else{
                            music = new GreenfootSound("21_wood1.wav");
                            music.play();
                        }
                    break;
                case 2:
                    if(Greenfoot.isKeyDown("h"))
                        if(isTouching(Beat.class)){
                            deleteBeat();
                        }
                        else{
                            music = new GreenfootSound("21_wood1.wav");
                            music.play();
                        }
                    break;
                case 3:
                    if(Greenfoot.isKeyDown("j"))
                        if(isTouching(Beat.class)){
                            deleteBeat();
                        }
                        else{
                            music = new GreenfootSound("21_wood1.wav");
                            music.play();
                        }
                    break;
                default:
                    System.out.println("Unknown hitbox");
                    break;
            }
        }
    }
    private void deleteBeat() {
        Beat beat = (Beat) getOneIntersectingObject(Beat.class);
        if (beat != null) {
            getWorld().removeObject(beat);
        }
    }
    private boolean cooldown(){
        if (System.currentTimeMillis() - lastPressTime >= cooldownTime)
            {
            lastPressTime = System.currentTimeMillis();
            return true;
            }
        else
            return false;
    }
    /*
    private void addScore(int a){
        Map world = (Map) getWorld();
        Score score = world.getScore();
        if (score != null) {
                score.incrementScore(a);
            }
    }
    */
}
