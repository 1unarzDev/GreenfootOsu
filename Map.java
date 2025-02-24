import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.PriorityQueue;

public class Map extends World
{
    private String[] keys = Config.getKeys();
    private long currFrame = 0;
    private long totalNotes;
    private int speed = Config.getSpeed();
    private ArrayList<PriorityQueue<Note>> noteQueues = new ArrayList<>();
    private long score = 0;
    
    public Map() throws IOException
    {    
        super(Config.getWidth(), Config.getHeight(), 1);
        Greenfoot.setSpeed(speed);
    }
    
    public void act()
    {
        spawnNotes();
        controller();
        currFrame++;
    }
    
    // converts the map to the format {{tn, tc}, {s1, e1, c1}, {s2, e2, c2}, {s3, e3, c3}} then puts it in a queue that sorts the times
    public void readMap(String map) throws IOException
    {
        long[][] in = Files.readAllLines(Paths.get(map))
                           .stream()
                           .map(str -> str.strip().split(","))
                           .map(arr -> Arrays.stream(arr)
                                             .mapToLong(Long::parseLong)
                                             .toArray())
                           .toArray(long[][]::new);
                    
        for(int i = 0; i < in[0][1]; i++)
        {
            noteQueues.add(new PriorityQueue<Note>());
        }
        
        for(int i = 1; i < in.length; i++)
        {
            // start - ms
            Note note = new Note(msToFrame(in[i][0]), msToFrame(in[i][1]), (int) in[i][2], this);
            noteQueues.get((int) in[i][2]).add(note);
        }
        
        totalNotes = in[0][0];
    }
    
    // TODO
    public void writeMap()
    {
        
    }
    
    /* The current system has the potential issue of a 
     * player spamming a key and messing up notes that aren't 
     * even on the screen, but this issue has to be fixed later
     */
    public void controller()
    {
        for(int i = 0; i < keys.length; i++)
        {
            if(Greenfoot.isKeyDown(keys[i]))
            {
                score += noteQueues.get(i).poll().score();
            }
        }
    }
    
    // spawns in the notes as the appropriate frame arrives, this system is easier than ms since you don't need to use dt
    public void spawnNotes()
    {
        for(int i = 0; i < noteQueues.size(); i++)
        {
            if(noteQueues.get(i).peek().getStart() == currFrame)
            {
                noteQueues.get(i).peek().spawn();
            }
        }      
    }
    
    // converts the ms input from the file to the appropriate frame for the note to be displayed
    public long msToFrame(long ms)
    {
        return (long) ((double) ms / 1000 * speed);
    }
    
    // not sure if this will ever be used, may remove later
    public long getCurrFrame()
    {
        return currFrame;
    }
}
