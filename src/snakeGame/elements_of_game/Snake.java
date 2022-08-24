package snakeGame.elements_of_game;

public class Snake {
	public int tahilLenght;
	public OrderedPair head;
	public ArrayList<OrderedPair> tail;
	public Direction direction;

	public Snake (int x, int y){
	head = newOrderedPair (x, y)
	tail = new ArrayList <OrderedPair>;
	tailLenght = 0;
	}

	public int getTailLength(){
	return tailLenght;
	}

	public OrderedPair getHead(){
	return head;
	}

	public ArrayList <OrderedPair> getTail(){
	return tail;
	}

	public Direction getDirection(){
	return direction;
	}

	@Override public void moveSnake(){
	if (direction != null){
	switch (direction){
	case left: head = new OrderedPair (head.getX() -1, head.getY());
	break;
	case right: head = new OrderedPair (head.getX() +1, head.getY());
	break;
	case down: head = new OrderedPair (head.getX(), head.getY() + 1);
	break;
	case up: head = new OrderedPair (head.getX(), head.getY() - 1);
	break;
	}
	}
	}

	@Override
	public OrderedPair ifIMove(){
	if (direction != null){
	switch (direction){
	case left: 
	return new OrderedPair (head.getX() -1, head.getY());
	break;
	case right: 
	return new OrderedPair (head.getX() +1, head.getY());
	break;
	case down: 
	 return new OrderedPair (head.getX(), head.getY() + 1);
	break;
	case up: 
	return new OrderedPair (head.getX(), head.getY() - 1);
	break;
	}
	return head;
	}

	@Override
	public void startMoving(){}

	@Override
	public void death();

	@Override 
	public void eat (){
	tailLenght ++;
	}

	@Override
	public void changeDirection (Direction newDirection){
	if (direction != null){
	direction = newDirection;
	}
	}

}
