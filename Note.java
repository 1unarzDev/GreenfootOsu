import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.PriorityQueue;

public class Note extends Actor implements Comparable<Note>
{
    private long start, end;
    private int row;
    
    public Note(long start, long end, int column, Map map)
    {
        // for readability
        int height = (int) (Config.getNoteScale() * (end - start));
        int width = Config.getStep();
        
        GreenfootImage img = new GreenfootImage(width, height);
        img.setColor(Config.getNoteColor());
    }
    
    public void act()
    {
        setLocation(getX(), getY() + Config.getSpeed());
    }
    
    public void score()
    {
        
    }
    
    @Override
    public int compareTo(Note other)
    {
        return Long.compare(this.start, other.start);
    }
}
