import javax.swing.ImageIcon;

public class Jules extends Characters {
    public Jules() {
        super();
    }

    public Jules(int x, int y){
        super(x,y, 200, 250, 2, new ImageIcon("jules.png"), new YellowShirt(), "Jules", "Jules is a college English professor. In her free time, she teaches English to delinquents in juvenile detention centers. Her life goal is to ensure literacy for all students.");
    }

    public String toString(){
        return "Jules";
    }
}
