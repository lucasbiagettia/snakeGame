package snakeGame.elements_of_game;

public interface ISnake {
	public void startMoving();
	public void moveSnake();
	public void changeDirection();
	public void death();
	public void eat();
	public OrderedPair ifIMove();
	public int getTailLenght();
	public OrderedPair getHead();
	public ArrayList <OrderedPair> getTail();

}
