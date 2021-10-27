package lgs.lviv.ua;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Class description goes here.
 *
 * @version 1.2 28 Oct 2021
 * @author Roman G-sky
 */

public class app_days {

	public static void main(String[] args) throws WrongInputConsoleParametersException, InputMismatchException {

		Mons[] mis = Mons.values(); // array of month
		List<Mons> arraymis = new ArrayList<Mons>();
		arraymis = Arrays.asList(Mons.values());
		Seasons[] siz = Seasons.values(); // array of seasons
		List<Seasons> arraysiz = new ArrayList<Seasons>();
		arraysiz = Arrays.asList(Seasons.values());
		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println("�������� 1 ��� ������ ����� : ");
			System.out.println("�������� 2 ��� ������ ���� ���� : ");
			System.out.println("�������� 3 ��� ������ ������� ��� : ");
			System.out.println("�������� 4 ��� ������ ������� ��� � ���������� ����� : ");
			System.out.println("�������� 5 ��� ������ ������� ��� � ���������� ����� : ");
			System.out.println("�������� 6 ��� ������ ���� ���� : ");
			System.out.println("�������� 7 ��� ������ ���� ���� : ");
			System.out.println("�������� 8 ��� ������� ����� � ������ ������� ��� : ");
			System.out.println("�������� 9 ��� ������� ����� � �� ������ ������� ��� : ");
			System.out.println("�������� 10 ��� ������ ����� : ");

			switch (scan.next())

			{

			case "1": { // check if month is available
				System.out.println("������ ����� : ");
				scan = new Scanner(System.in);
				String monssc = scan.next().toLowerCase();

				arraymis.contains(monssc);

				if (true) {
					System.out.println("�������� ���� ����� ����");
				} else {
					throw new WrongInputConsoleParametersException("�������� ���� ����� �� ������ ����� �� �� ����");
				}
			}
				break;

			case "2": { // check if season is available
				System.out.println("������ ���� ���� : ");
				scan = new Scanner(System.in);
				String seasonsc = scan.next().toUpperCase();

				boolean flag = false;

				for (Mons ms : arraymis) {
					if (ms.getSeason().name().equalsIgnoreCase(seasonsc)) {
						flag = true;
					}
				}

				if (flag == true) {
					System.out.println("������� ���� ���� ���� " + seasonsc + " �� ��� ����� : ");

					for (Mons ms2 : arraymis) {
						if (ms2.getSeason().toString().equalsIgnoreCase(seasonsc)) {
							System.out.println(ms2);
						}
					}
				}

				else {
					throw new WrongInputConsoleParametersException(
							"������� ���� ���� ���� �� ������ ����� �� �� ����");
				}
			}
				break;

			case "3": { // check how many month have similar quantity of days
				System.out.println("������ ������� ��� � ����� : ");
				scan = new Scanner(System.in);
				int daysc = scan.nextInt();

				boolean flag = false;

				for (Mons day : arraymis) {
					{
						if (day.getDay() == daysc) {
							flag = true;
						}
					}
					if (true) {
						System.out.println("������� ������� ��� " + daysc + " �������� � ����� ������: ");
						for (Mons day2 : arraymis) {
							if (day2.getDay() == daysc) {
								System.out.println(day2);
							}
						}
					}
				}
				if (!flag) {
					throw new InputMismatchException("̳���� �� " + daysc + " ������� ��� �� ����");

				}
			}
				break;

			case "4": { // check how many month have less quantity of days
				System.out.println("������ ������� ��� � ����� : ");
				scan = new Scanner(System.in);
				int daysc = scan.nextInt();

				boolean flag = false;

				for (Mons day : arraymis) {
					{
						if (day.getDay() == daysc) {
							flag = true;
						}
					}
					if (true) {
						System.out.println("̳���� �� ������ ������� ��� : ");
						for (Mons day2 : arraymis) {
							if (day2.getDay() < daysc) {
								System.out.println(day2);
							}
						}
					}
				}
				if (!flag) {
					throw new InputMismatchException("̳���� �� " + daysc + " ������� ��� �� ����");
				}
			}
				break;
			case "5": { // check how many month have less quantity of days
				System.out.println("������ ������� ��� � ����� : ");
				scan = new Scanner(System.in);
				int daysc = scan.nextInt();

				boolean flag = false;

				for (Mons day : arraymis) {
					{
						if (day.getDay() == daysc) {
							flag = true;
						}
					}
					if (true) {
						System.out.println("̳���� �� ������ ������� ��� :  ");
						for (Mons day2 : arraymis) {
							if (day2.getDay() > daysc) {
								System.out.println(day2);
							}
						}
					}
				}
				if (!flag) {
					throw new InputMismatchException("̳���� �� " + daysc + " ������� ��� �� ����");
				}
			}
				break;

			case "6": { // check next season
				System.out.println("������ ���� ���� : ");
				scan = new Scanner(System.in);
				String seasonsc = scan.next().toUpperCase();

				boolean flag = false;

				for (Seasons s : arraysiz) {
					if (s.name().equals(seasonsc)) {
						flag = true;
					}
				}
				if (true) {

					Seasons s2 = Seasons.valueOf(seasonsc);
					int i = s2.ordinal();

					if (i == (arraysiz.size() - 1)) {
						i = 0;
						System.out.println("�������� ���� ���� : " + arraysiz.get(i));
					} else {
						System.out.println("�������� ���� ���� : " + arraysiz.get(i + 1));
					}
					if (!flag) {
						throw new WrongInputConsoleParametersException(
								"������� ���� ���� ���� �� ������ ����� �� �� ����");
					}
				}
			}

				break;

			case "7": { // check previous season
				System.out.println("������ ���� ���� : ");
				scan = new Scanner(System.in);
				String seasonsc = scan.next().toUpperCase();

				boolean flag = false;

				for (Seasons s : arraysiz) {
					if (s.name().equals(seasonsc)) {
						flag = true;
					}
				}
				if (flag) {

					Seasons s2 = Seasons.valueOf(seasonsc);
					int i = s2.ordinal();

					if (i == 0) {
						i = (arraysiz.size() - 1);
						System.out.println("��������� ���� ���� : " + arraysiz.get(i));
					} else {
						System.out.println("��������� ���� ����: " + arraysiz.get(i - 1));
					}
					if (!flag) {
						throw new WrongInputConsoleParametersException(
								"�������� ���� ���� ���� �� ������ ����� �� �� ����");
					}
				}
			}
				break;
			case "8": { // check is quantity days of month even number
				for (Mons m : arraymis) {
					if (m.getDay() % 2 == 0) {
						System.out.println("���� ����� : " + m);
					}
				}
			}
				break;

			case "9": { // check is quantity days of month odd number
				for (Mons m : arraymis) {
					if (m.getDay() % 2 != 0) {
						System.out.println("�� ���� ����� : " + m);
					}
				}
			}
				break;

			case "10": { // check is the month even or odd
				System.out.println("������ ����� : ");
				scan = new Scanner(System.in);
				String monssc = scan.next().toLowerCase();

				boolean flag = false;

				for (Mons m : arraymis) {
					if (m.name().equals(monssc)) {
						flag = true;
					}
				}
				if (flag) {

					Mons m2 = Mons.valueOf(monssc);

					if (m2.getDay() % 2 == 0) {
						System.out.println("�������� ���� ����� " + monssc + "������");
					} else {
						System.out.println("�������� ���� ����� " + monssc + " �� ������");
					}
				}
				if (!flag) {

					throw new WrongInputConsoleParametersException("�������� ���� ����� �� ������ ����� �� �� ����");
				}
			}
				break;
			}
		}

	}
}
