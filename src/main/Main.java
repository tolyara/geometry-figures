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

	private static final int MAX_NUMBER_VALUE = 10;
	
	private static Random random = new Random();

	public static void main(String[] args) {

		int CapacityOfArray = random.nextInt(MAX_CAPACITY_OF_FIGURES_ARRAY);
		Figure[] figures = new Figure[CapacityOfArray];

		for (int i = 0; i < figures.length; i++) {
			figures[i] = generateRandomFigure();
		}
		
		for (Figure figure : figures) {
			System.out.println(figure);
		}

	}

	private static Figure generateRandomFigure() {

		int randomFigureNumber = random.nextInt(NUMBER_OF_FIGURE_TYPES) + 1;

		Figure figure;
		switch (randomFigureNumber) {
		case 1:
			figure = new Square(generateRandomColour(), generateRandomNumber());
			break;
		case 2:
			figure = new Triangle(generateRandomColour(), generateRandomNumber(), generateRandomNumber());
			break;
		case 3:
			figure = new Circle(generateRandomColour(), generateRandomNumber());
			break;
		case 4:
			figure = new Trapeze(generateRandomColour(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber());
			break;
		default:
			throw new RuntimeException("Unexpected ramdom figure number!");
		}

		return figure;
		
	}
	
	private static int generateRandomNumber() {		
		
		return random.nextInt(MAX_NUMBER_VALUE);	
		
	}
	
	private static String generateRandomColour() {
		
		String[] colours = {"red", "orange", "yellow", "green", "blue"};		
		return colours[random.nextInt(colours.length)];
		
	}

}
