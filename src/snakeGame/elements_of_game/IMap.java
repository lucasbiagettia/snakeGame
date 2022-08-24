package snakeGame.elements_of_game;

public interface IMap {
	public void setMap (OrderedPair headPosition, ArrayList <OrederedPair> tailPosition, OrderedPair mealPosition);
	public ElementsOfGame [][] getMap();
	public boolean isInTheMap (OrderedPair position);
	public int getSize();

}
