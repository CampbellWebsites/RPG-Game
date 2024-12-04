import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Campbell extends Characters {
    public Campbell() {
        super();
    }

    public Campbell(int x, int y){
        super(x,y, 200, 250, 2, new ImageIcon("campbell.png"), setList(), new YellowShirt(), "Campbell", "Campbell is a cancer researcher and a fashion model in NYC. She ");
    }

    public String toString(){
        return "Campbell";
    }
         public static ArrayList <Clothes> setListCampbell(){
        ArrayList <Clothes> temp = new ArrayList <Clothes> ();
        temp.add(new YellowShirt());
        temp.add(new YellowShirt());
        temp.add(new YellowShirt());
        return temp;
}
}
 