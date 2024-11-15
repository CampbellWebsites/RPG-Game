import javax.swing.ImageIcon;
import java.util.ArrayList;

public final class Caitlyn extends Characters {
    public Caitlyn() {
        super();
    }

    public Caitlyn(int x, int y){
    
        super(x,y, 200, 250, 2, new ImageIcon("caitlyn.png"), setList() ,"Caitlyn","Caitlyn is a female movie star. She attends red carpet events every weekend. She is most famous for her rom com based on her high school love story, titled Caitlyn in Paradise");
                getClothes().setX(super.getX()+super.getW());
                setClothes(setList());
            }
        
            public String toString(){
                return "Caitlyn";
            }
        
            public static ArrayList <Clothes> setList(){
        ArrayList <Clothes> temp = new ArrayList <Clothes> ();
        temp.add(new YellowShirt());
        temp.add(new YellowShirt());
        temp.add(new YellowShirt());
        return temp;
    }

}
//new Lolly(x,y)