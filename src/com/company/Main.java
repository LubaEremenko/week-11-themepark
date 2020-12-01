package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int peopleInLine = 90;
        int time = 0;
        int addPeople = 63;
        int leftPeople = 40;

        do {
            peopleInLine = peopleInLine + addPeople - leftPeople;
            time = time + 5;

            System.out.println("It would take " + time + " minutes for 600 people to be in line" );
        }while (peopleInLine <= 600);

    }
}
