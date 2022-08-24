package snakeGame.elements_of_game;

public class Map {
	private ElementsOfGame [][] matrix:
		private int size;

		public int getSize(){
		return size:
		}
		public ElementsOfGame[][] getMap(){
		return matrix;
		}

		public Map (int theSize){
		size = theSize;
		matriz = new ElementsOfGame [size][size];
		}

		@Override
		public void setMap(OrderedPair headPosition, ArrayList <OrderedPair> tailPosition, OrderedPair mealPosition){
		for (int i = 0; i<size; i++){
		for (int j = 0; j<size; j++){
		matriz [i][j] = ElementsOfGame.freeCell;
		}
		}
		for (int i = 0; i<tailPosition.size(); i++){
		matrix[tailPosition.getX()][tailPosition.getY()] = ElementsOfGame.snakeTail;
		}
		matrix[headPosition.getX()][headPosition.getY()] = ElementsOfGame.snakeHead;
		matrix[mealPosition.getX()][mealPosition.getY()] = ElementsOfGame.meal;
		}

		@Override
		public boolean isInTheMap (OrderedPair position){
		return position.getX() >= 0 && position.getY() >=0 && position.getX()< size && position.getY() <size;
		}
}
