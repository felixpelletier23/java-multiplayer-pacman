package pathFinder;

import java.awt.Point;
import java.util.ArrayList;

public class Node {

	

	private int compteur = 0;
	private Point point;
	
	public Node(Point point, int compteur){
		this.point = point;
		this.compteur = compteur;
	}
	
	public boolean isBest(ArrayList<Node> nodes){
		for(Node otherNode : nodes){
			if(this.point.equals(otherNode.point) && this.getCompteur() >= otherNode.getCompteur()){
				return false;
			}
		}
		return true;
	}
	
	public int getCompteur() {
		return compteur;
	}

	public void setCompteur(int compteur) {
		this.compteur = compteur;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}
	
}