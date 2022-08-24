package snakeGame.elements_of_game;

public class Meal {
	private OrderedPair position;
	public meal (int x, int y){
	position = new OrderedPair (x,y);
	}
	public OrderedPair getPosition(){
	return position;
	}
	public void setPosition (int x, int y){
	position = new OrderedPair (x,y)
	}
	@Override
	public void beEaten(){}
	}

	public class OrderedPair{
	private int x;
	private int y;

	public int getX(){
	return x;
	}
	public int getY(){
	return y;
	}
	public void setX(int theX){
	x = theX;
	}
	public void setY(int theY){
	y = theY;
	}

	public OrderedPair (int theX, int theY){
	x = theX;
	y = theY;
	}

}
