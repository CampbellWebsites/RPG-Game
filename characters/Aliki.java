package characters;

import javax.swing.ImageIcon;

import other.Characters;

public class Aliki extends Characters {
    public Aliki() {
        super();
    }

    public Aliki(int x, int y){
        super(x,y, 200, 250, 0, new ImageIcon("Aliki.png"),setList(), "Aliki", "Aliki is a basketball star. She is in the WNBA and was the first draft pic of the 2024 season!");
    }

    public String toString(){
        return "Aliki";
    }
}
//asdf