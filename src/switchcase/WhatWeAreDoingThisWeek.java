package switchcase;

import java.util.Scanner;

public class WhatWeAreDoingThisWeek {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		WeekDay Day = new WeekDay();
		System.out.println("Enter Your Day: ");
		String dayGiven = sc.nextLine();
		String whatToDo = Day.getWeekDay(dayGiven);
		System.out.println(whatToDo);
	}

}
