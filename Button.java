import greenfoot.*;  

public class Button extends Actor
{
    private GreenfootImage image;
    private String label;
    private String type;
    private String pressType;
    private String button;
    private World targetWorld;
    private Color baseColor;
    private Color hoverColor;
    private int width;
    private int height;
    private String font = "Aller Bold";
    private int fontSize = 18;
    
    // Creates a button with a label printed on it with a Type, and a world to target.
    public Button(int width, int height, Color baseColor, Color hoverColor, String label, String type, String pressType, String button, World targetWorld) {
        this.label = label;
        this.type = type;
        this.targetWorld = targetWorld;
        this.width = width;
        this.height = height;
        this.pressType = pressType;
        this.button = button;
        this.baseColor = baseColor;
        this.hoverColor = baseColor;
        updateColor(baseColor);
    }
    
    // Checks if the button is being hovered or clicked
    public void act() {
        switch (pressType){
            case "MOUSE":
                if (Greenfoot.mouseMoved(this)) {
                    updateColor(hoverColor);
                } else{
                    updateColor(baseColor);
                }
                if (Greenfoot.mouseClicked(this)) {
                    performAction();
                }
                break;
            case "KEYBOARD":
                if(Greenfoot.isKeyDown(button)){
                    performAction();
                }
                break;
            default:
                System.out.println("Type is unknown");
                break;
        }
    }
    
    //Updates the color and Font when called
    private void updateColor(Color color) {
        image = new GreenfootImage(width, height);
        image.setColor(color);  
        image.fillRect(0, 0, width, height);
        Font customFont = new Font(font, true, false, fontSize);
        image.setFont(customFont);
        image.setColor(Color.BLACK);
        image.drawString(label, 50, 25);
        setImage(image);
    }
    
    //Checks the type of the button and performs actions accordingly
    public void performAction() {
        System.out.println("Button " + label + " of type " + type + " was clicked");
        switch (type) {
            case "EXIT":
                Greenfoot.stop();
                break;
            case "START":
                Greenfoot.setWorld(targetWorld);
                break;
            case "CREDIT":
                Greenfoot.setWorld(targetWorld);
                break;
            default:
                System.out.println("Type is unknown");
                break;
        }
    }
}