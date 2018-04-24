package Unit17;

import java.awt.Graphics;
import java.util.ArrayList;

public class Aliens {
private ArrayList aliens = new ArrayList<Alien>();


public ArrayList<Alien> getList(){
	return aliens;
}

public void remove(int index){
	aliens.remove(index);
}

public void add(Alien a){
	aliens.add(a);
}

public void draw(Graphics g){
	for(Alien a : getList()){
		a.draw(g);
	}
}

}
