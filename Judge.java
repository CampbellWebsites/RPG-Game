public class Judge extends Enemy{
    public Judge(){
        super();
    }

    public String toString(){
        return "Judge";
    }
    public Judge(int x, int y){
        super(x,y,50,50,2,172,2000,5,new ImageIcon("judge.png"), new Lolly())
    }
}