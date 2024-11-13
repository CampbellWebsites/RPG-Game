import javax.swing.ImageIcon;

public class Campbell extends Characters {
    public Campbell() {
        super();
    }

    public Campbell(int x, int y){
        super(x,y, 200, 250, 2,5,7674,1, new ImageIcon("campbell.png"), "Campbell", "Campbell is a cancer researcher and a fashion model in NYC. She ");
    }

    public String toString(){
        return "Campbell";
    }
}
