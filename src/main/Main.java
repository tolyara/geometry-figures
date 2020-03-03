package main;

import java.util.Random;

import figures.Circle;
import figures.Figure;
import figures.Square;
import figures.Trapeze;
import figures.Triangle;

public class Main {

	private static final int MAX_CAPACITY_OF_FIGURES_ARRAY = 25;

	private static final int NUMBER_OF_FIGURE_TYPES = 4;

	public static void main(String[] args) {

		Random random = new Random();
		int randomCapacityOfFiguresArray = random.nextInt(MAX_CAPACITY_OF_FIGURES_ARRAY);
		Figure[] figures = new Figure[randomCapacityOfFiguresArray];

		for (int i = 0; i < figures.length; i++) {
			figures[i] = generateRandomFigure();
		}
		
		for (Figure figure : figures) {
			System.out.println(figure);
		}

	}

	private static Figure generateRandomFigure() {

		Random random = new Random();
		int randomFigureNumber = random.nextInt(NUMBER_OF_FIGURE_TYPES) + 1;

		Figure figure;
		switch (randomFigureNumber) {
		case 1:
			figure = new Square("blue", 11);
			break;
		case 2:
			figure = new Triangle("green", 3, 4);
			break;
		case 3:
			figure = new Circle("red", 8);
			break;
		case 4:
			figure = new Trapeze("black", 2, 6, 4);
			break;
		default:
			throw new RuntimeException("Unexpected ramdom figure number!");
		}

		return figure;
	}

}
