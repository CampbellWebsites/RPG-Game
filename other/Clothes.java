package other;
public class Clothes {

    int x,y,w,h;
    //ideas: style points, 
    int stylish, ugly, trendy, classy;
    String name;
    String description;
    
    public Clothes(){
        x=0;
        y=0;
        w=0;
        h=0;
        stylish=0;
        ugly=0;
        trendy=0;
        classy=0;
    }
    public Clothes(int xV, int yV, int wV, int hV, int st, int ug, int tre, int cla){
        x=xV;
        y=yV;
        w=wV;
        h=hV;
        stylish=st;
        ugly=ug;
        trendy=tre;
        classy=cla;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getW() {
        return this.w;
    }

    public int getH() {
        return this.h;
    }

    public int getSTYLISH() {
        return this.stylish;
    }

    public int getUGLY() {
        return this.ugly;
    }

    public int getTRENDY() {
        return this.trendy;
    }

    public int getCLASSY() {
        return this.classy;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setW(int w) {
        this.w = w;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setSTYLISH(int stylish) {
        this.stylish = stylish;
    }

}
