import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Map extends World
{    
    private int bpm = 128; // Beats per minute of the song
    private int interval; // Interval in milliseconds
    private long lastTime; // Last time a note was spawned
    private long startTime;
    private Track[] tracks;
    private Hitbox[] hitboxes;
    private GreenfootSound music;
    //private Score scoreHolder;
    //private Score score;
    public Map()
    {    
        super(1200, 800, 1);
        GreenfootImage bg = new GreenfootImage("king.png");
        bg.scale(super.getWidth(), super.getHeight() );
        this.setBackground(bg);
        startTime = System.currentTimeMillis();
        interval = 60000 / bpm;
        lastTime = System.currentTimeMillis();
        playMusic();
        tracks = new Track[4];
        hitboxes = new Hitbox[4];
        for (int i = 0; i < tracks.length; i++) {
            tracks[i] = new Track(i);
            addObject(tracks[i], 100 + i * 100, getHeight() / 2);
        }
        for (int i = 0; i < hitboxes.length; i++) {
            hitboxes[i] = new Hitbox(i);
            addObject(hitboxes[i], 100 + i * 100, getHeight() - 50 );
        }
        //addObject(new Score(), getWidth() - 130, 50);
    }
    private void playMusic() {
        music = new GreenfootSound("PUK.mp3");
        music.play();
    }

    public void act() {
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastTime >= interval) {
            spawnNote();
            lastTime = currentTime;
        }
    }

    private void spawnNote() {
        int track = Greenfoot.getRandomNumber(4); // Randomly select one of the 4 tracks
        addObject(new Beat(), 100 + track * 100, 0);
    }
    /*
    public Score getScore() {
        return score;
    }
    */
}
