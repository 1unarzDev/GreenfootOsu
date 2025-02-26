import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

 public class Score extends Actor
{
    private int score;
    
    public Score()
    {
        score = 0;
    }
    
    public void act()
    {
        displayScore();
    }
    
    private void displayScore() 
    {
        GreenfootImage image = new GreenfootImage("Score: "+ score, 50, Color.WHITE, null);
        setImage(image);
    }
    
    public void incrementScore(int value) 
    {
        score += value;
        displayScore();
    }
}
