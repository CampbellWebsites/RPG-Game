
import java.awt.*;
import java.awt.event.*; 
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.*; 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

//Add hover for character, descripton, and other characteristics (ill change later), add mouse click for select character, add graphics, add class/fix class clothes, add subclass shirts, bottoms, hats, shoes, accessories, 

public class Game extends JPanel implements Runnable, KeyListener, MouseListener, MouseMotionListener{

	
	private BufferedImage back; 
	private int key, x, y; 
	private ArrayList <Characters> charList;
	private String screen;
	private Characters player;
	private ImageIcon startBg;
	private ImageIcon chooseBg; 
	private String welcome;
	private double time;
	private int i;
	private boolean collision;
	private Characters hoveredChar;
	private File saveFile;
	//private ArrayList <Ranged> rangedWeap;
	//private Queue <Enemy> enemies;

	
	public Game() {
		new Thread(this).start();	
		this.addKeyListener(this);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);	
		key =-1; 
		x=0;
		y=0;
		charList = setCharList();
		for(Characters c: charList){
			System.out.println(c);
		}
		screen="start";
		startBg=new ImageIcon("startbackground.png");
		chooseBg=new ImageIcon("classroom.png");
		welcome = "Welcome to Campbell's School Game";
		time=System.currentTimeMillis();
		collision=false;
		//rangedWeap = new ArrayList <Ranged>();
		//enemies = setEs();
		saveFile = new File("saved_file2.0txt");
	}

	// public Queue <Enemy> setEs(){
	// 	Queue <Enemy> temp = new LinkedList <>();
	// 	temp.add(new Caitlyn(100,100));
	// 	temp.add(new Caitlyn(300,100));
	// 	temp.add(new Caitlyn(400,100));
	// 	return temp;
	// }

	public void createFile(){
            try {
			if(saveFile.createNewFile()){
				System.out.println("Successfully createdfile!");
			}
			else{
				System.out.println("File already exists!");
			}
            } catch (IOException ex) {
            }
	}
	
	public void writeToFile(){
		FileWriter myWriter = null;
            try {
                myWriter = new FileWriter(saveFile);
			if(charList.isEmpty()){
				myWriter.write("win");
			}
			else{
				myWriter.write("You have" + charList.size() + "enemies left");
			}
            } catch (IOException ex) {
            } finally {
                try {
                    myWriter.close();
                } catch (IOException ex) {
                }
            }
	}


	public void readFile(){
            try {
			Scanner sc = new Scanner(saveFile);
			while(sc.hasNext()){
				System.out.println(sc.nextLine());
			}
            } catch (FileNotFoundException ex) {
            }
	}

	public ArrayList <Characters> setCharList(){
        ArrayList <Characters> temp = new ArrayList <>();
		temp.add(new Caitlyn(100,100));
		temp.add(new Marinne(250,100));
		temp.add(new Campbell(400,100));
		temp.add(new Jules(550,100));
		temp.add(new Aliki(700,100));


		return temp;
    }
	
	public void run()
	   {
	   	try
	   	{
	   		while(true)
	   		{
	   		   Thread.currentThread().sleep(5);
	            repaint();
	         }
	      }
	   		catch(Exception e)
	      {
	      }
	  	}
	

	
	
	
	public void paint(Graphics g){
		
		Graphics2D twoDgraph = (Graphics2D) g; 
		if( back ==null)
			back=(BufferedImage)( (createImage(getWidth(), getHeight()))); 
		

		Graphics g2d = back.createGraphics();
	
		g2d.clearRect(0,0,getSize().width, getSize().height);
	
		g2d.setFont( new Font("Broadway", Font.BOLD, 35));
		
		g2d.drawString("Hello!" , x, y);

		drawScreens(g2d);

		welcome.substring(0,i);

		// s.substring(0,i);
		// i++;

		// if(i>=s.length){
		// 	i=s.length;
		// }

		// if(timer%400==0){
		// 	i++;
		// }
		
		twoDgraph.drawImage(back, null, 0, 0);

	}

public void drawStartScreen(Graphics g2d){
	g2d.drawImage(startBg.getImage(),0,0,getWidth(),getHeight(),this);
	g2d.drawString(welcome.substring(0,i),500 ,400);
	if (i<welcome.length()){
		if(System.currentTimeMillis()-time>100){
			time=System.currentTimeMillis();
			i++;
		}
	}
}

public void drawChooseScreen(Graphics g2d){
	g2d.drawImage(chooseBg.getImage(),0,0,getWidth(),getHeight(),this);
	for(Characters c: charList){
		System.out.println(c);
		c.drawChar(g2d);
	}

	if (hoveredChar != null) {
        g2d.setFont(new Font("Arial", Font.PLAIN, 20));
        g2d.setColor(Color.WHITE);
        g2d.drawString("Name: " + hoveredChar.getName(), 50, 50);
        g2d.drawString("Description: " + hoveredChar.getDescription(), 50, 170);
    }
}

	public void drawSelectScreen(Graphics g2d) {
		if(player !=null) {
			player.drawChar(g2d);
			g2d.drawString("You picked "+player.toString(), 200, 500);
		}
	}

	public void drawAssignmentScreen(Graphics g2d)
{
	
}
	private void drawScreens(Graphics g2d) {
		switch(screen) {
			case "start":
			drawStartScreen(g2d);
			break;
			case "choose":
			drawChooseScreen(g2d);
			break;
			case "selection":
			drawSelectScreen(g2d);
			case "assignments":
			draw
		}
	}


	//DO NOT DELETE
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}




//DO NOT DELETE
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		key= e.getKeyCode();
		System.out.println(key);
		if(key==32){
			screen="choose";
		}
		if(key==49){
			screen="selection";
			player=charList.get(0);
		}
		if(key==50){
			screen="selection";
			player=charList.get(1);
		}
		if(key==51){
			screen="selection";
			player=charList.get(2);
		}
		if(key==52){
			screen="selection";
			player=charList.get(3);
		}
		if(key==53){
			screen="selection";
			player=charList.get(4);
		}
		
// 	49 -- 1
// 50 -- 2
// 51 -- 3
// 52 -- 4
// 53 -- 5
	
	}


	//DO NOT DELETE
	@Override
	public void keyReleased(KeyEvent e) {
		
		
		
		
	}



	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		x=arg0.getX();
		y=arg0.getY();

		hoveredChar = null;
		for (Characters c : charList) {
        if (x >= c.getX() && x <= c.getX() + c.getW() &&
            y >= c.getY() && y <= c.getY() + c.getH()) {
            hoveredChar = c; // Set the character being hovered
            break;
        }
    }

    repaint(); 
	}



	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		//check to see if on start screen 
		//for loop to check through all mainChars
		//have something in calendar class to check for mouse collision
		//if mouse collision check in characters class return is true )mouce colliosn)
		//player = loop.get(i)
	}



	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("entered");
	}



	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("exited");
	}



	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		System.out.println("you clicked at"+ arg0.getY());
		x=arg0.getX();
		y=arg0.getY();
		
		// if ((arg0.getX() >= Marinne.getX() && arg0.getX() <= Marinne.getX() + Marinne.getW()) && (arg0.getY() >= Marinne.getY() && arg0.getY() <= Marinne.getY() + Marinne.getH())){
		// }
		for (Characters c : charList) {
        if (x >= c.getX() && x <= c.getX() + c.getW() &&
            y >= c.getY() && y <= c.getY() + c.getH()) {
            player = c; // Assign clicked character to player
            screen = "selection"; // Switch to selection screen
            break;
        }
    }
	}



	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}
