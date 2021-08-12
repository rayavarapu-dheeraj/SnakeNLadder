package com.bridgelabz.snakeandladder;

public class Welcome {
		final static int START = 0;
		static final int NO_PLAY = 0;
		static final int LADDER = 1;
		static final int SNAKE = 2;

		public static void main(String[] args) {
			System.out.println("Welcome to Snake And Ladder game");
			System.out.println("\nStarting the game with Game Point= " + START);
			int dice = (int) (Math.random() * 6) + 1;
			System.out.println("Dice roll: " + dice);
			
			int position = 0;
			int newPosition = 0;
			
			int checkOption = (int) (Math.random() * 3);
			
			switch (checkOption) {
			case NO_PLAY:
				newPosition = 0;
				break;
			case LADDER:
				newPosition = dice;
				break;
			case SNAKE:
				newPosition = -dice;
			}
			position = position + newPosition;
			if (position < 0) {
				position = 0;
			}
			System.out.println("Position: "  + position);
		}
}
