import java.util.HashMap;

import java.util.Locale;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Calculator cc = new Calculator();

		cc.cal();

	}

	public void cal() {

		double count;

		double top = 0;

		double bottom = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the boy's name");

		String boy = sc.nextLine();

		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter the girl's name");

		String girl = sc1.nextLine();

		/*
		 * 
		 * if(boy.contentEquals("hamdan")){
		 * 
		 * System.out.println("tu single hi marega be"); } else if
		 * 
		 * (boy.contentEquals("HAMDAN")){
		 * 
		 * System.out.println("TU SINGLE HI MAREGA BE"); } else if
		 * 
		 * (girl.contentEquals("HAMDAN")){
		 * 
		 * System.out.println("TU SINGLE HI MAREGI "); } else if
		 * 
		 * (girl.contentEquals("hamdan")){
		 * 
		 * System.out.println("tu single hi maregi "); } else {
		 * 
		 */

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		hm.put('a', 15);

		hm.put('b', 10);

		hm.put('c', 25);

		hm.put('d', 11);

		hm.put('e', 8);

		hm.put('f', 1);

		hm.put('g', 6);

		hm.put('h', 12);

		hm.put('i', 13);

		hm.put('j', 14);

		hm.put('k', 15);

		hm.put('l', 16);

		hm.put('m', 17);

		hm.put('n', 18);

		hm.put('o', 19);

		hm.put('p', 20);

		hm.put('q', 21);

		hm.put('r', 22);

		hm.put('s', 23);

		hm.put('t', 24);

		hm.put('u', 25);

		hm.put('v', 26);

		hm.put('w', 27);

		hm.put('x', 28);

		hm.put('y', 29);

		hm.put('z', 30);

		hm.put(' ', 0);

		hm.put('A', 15);

		hm.put('B', 10);

		hm.put('C', 25);

		hm.put('D', 11);

		hm.put('E', 8);

		hm.put('F', 1);

		hm.put('G', 6);

		hm.put('H', 12);

		hm.put('I', 13);

		hm.put('J', 14);

		hm.put('K', 15);

		hm.put('L', 16);

		hm.put('M', 17);

		hm.put('N', 18);

		hm.put('O', 19);

		hm.put('P', 20);

		hm.put('Q', 21);

		hm.put('R', 22);

		hm.put('S', 23);

		hm.put('T', 24);

		hm.put('U', 25);

		hm.put('V', 26);

		hm.put('W', 27);

		hm.put('X', 28);

		hm.put('Y', 29);

		hm.put('Z', 30);

		double top1 = 0;

		try {

			for (int i = 0; i < boy.length(); i++) {

				top = top + hm.get(boy.charAt(i));

				top1 = top;

			}

			double bottom1 = 0;

			for (int j = 0; j < girl.length(); j++) {

				bottom = bottom + hm.get(girl.charAt(j));

				bottom1 = bottom;

			}

			if (top > bottom) {

				count = (bottom / top) * 100;

				int val = (int) count;

				System.out.printf("Your Love Percentage is " + val);

			}

			else if (bottom > top) {

				count = (top / bottom) * 100;

				int val = (int) count;

				System.out.printf("Your Love Percentage is  " + val);

			}

			else {

				System.out.println("Your Love Percentage is 100");

			}

		} catch (Exception e) {

			System.out.println("Please Enter a valid input");

		}

	}

}