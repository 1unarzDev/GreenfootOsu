import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Track extends GameObject
{
    private int trackNumber;

    public Track(int trackNumber) {
        this.trackNumber = trackNumber;
        GreenfootImage image = new GreenfootImage(50, 800);
        image.setColor(Color.GRAY);
        image.fillRect(0, 0, 50, 800);
        setImage(image);
    }

    public int getTrackNumber() {
        return trackNumber;
    }
}