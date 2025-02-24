import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.PriorityQueue;

public class Note extends Actor implements Comparable<Note>
{
    private long start, end;
    private int column;
    private int width, height;
    private boolean alive = false;
    
    public Note(long start, long end, int column, Map map)
    {
        // for readability
        this.height = (int) (Config.getNoteScale() * (end - start));
        this.width = Config.getStep();
        this.column = column;
        
        GreenfootImage img = new GreenfootImage(width, height);
        img.setColor(Config.getNoteColor());
    }
    
    public void act()
    {
        if(alive)
        {
            setLocation(getX(), getY() + Config.getSpeed());   
        }
    }
    
    public void spawn()
    {
        setLocation(-width / 2, Config.getStep() * column + width / 2);
        alive = true;
    }
    
    // TODO
    public int score()
    {
        return 0;
    }
    
    public long getStart()
    {
        return start;
    }
    
    @Override
    public int compareTo(Note other)
    {
        return Long.compare(this.start, other.start);
    }
}
