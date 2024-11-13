import javax.swing.ImageIcon;

public class Marinne extends Characters {
    public Marinne() {
        super();
    }

    public Marinne(int x, int y){
        super(x,y, 200, 250, 2,5,7674,1, new ImageIcon("marinne.png"), "Marinne", "She is an old-money woman. She has two kids and lovely husband. She drive a Porsche and goes to pilates weekly with her best friend. She has a husky and her favorite color is pink.");
    }

    public String toString(){
        return "Marinne";
    }
}
