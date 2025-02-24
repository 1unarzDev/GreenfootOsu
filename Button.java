import greenfoot.*;  

public class Button extends Actor
{
    private GreenfootImage image;
    private String label;
    private String type;
    private Color baseColor;
    private Color hoverColor;
    private String font = "Aller Bold";
    private int fontSize = 18;
    
    // Creates a button with a label printed on it with a Type
    public Button(String label, String type) {
        this.label = label;
        this.type = type;
        baseColor = Color.PINK;
        hoverColor = Color.WHITE;
        updateColor(baseColor);
    }
    
    // Checks if the button is being hovered or clicked
    public void act() {
        if (Greenfoot.mouseMoved(this)) {
            updateColor(hoverColor);
        } else{
            updateColor(baseColor);
        }
        if (Greenfoot.mouseClicked(this)) {
            performAction();
        }
    }
    
    //Updates the color and Font when called
    private void updateColor(Color color) {
        image = new GreenfootImage(150, 50);
        image.setColor(color);
        image.fillRect(0, 0, 150, 50);
        Font customFont = new Font(font, true, false, fontSize);
        image.setFont(customFont);
        if(color == color.PINK){
            image.setColor(Color.WHITE);
        }
        else{
            image.setColor(Color.PINK);
        }
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
            default:
                System.out.println("Type is unknown");
        }
    }
}