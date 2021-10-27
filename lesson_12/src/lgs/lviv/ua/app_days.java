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

			System.out.println("Ќатисн≥ть 1 щоб ввести м≥с€ць : ");
			System.out.println("Ќатисн≥ть 2 щоб ввести пору року : ");
			System.out.println("Ќатисн≥ть 3 щоб ввести к≥льк≥сть дн≥в : ");
			System.out.println("Ќатисн≥ть 4 щоб ввести к≥льк≥сть дн≥в ≥ в≥добразити менш≥ : ");
			System.out.println("Ќатисн≥ть 5 щоб ввести к≥льк≥сть дн≥в ≥ в≥добразити б≥льш≥ : ");
			System.out.println("Ќатисн≥ть 6 щоб ввести пору року : ");
			System.out.println("Ќатисн≥ть 7 щоб ввести пору року : ");
			System.out.println("Ќатисн≥ть 8 щоб вивести м≥с€ц≥ з парною к≥льк≥стю дн≥в : ");
			System.out.println("Ќатисн≥ть 9 щоб вивести м≥с€ц≥ з не парною к≥льк≥стю дн≥в : ");
			System.out.println("Ќатисн≥ть 10 щоб ввести м≥с€ць : ");

			switch (scan.next())

			{

			case "1": { // check if month is available
				System.out.println("¬вед≥ть м≥с€ць : ");
				scan = new Scanner(System.in);
				String monssc = scan.next().toLowerCase();

				arraymis.contains(monssc);

				if (true) {
					System.out.println("¬ведений ¬ами м≥с€ць ≥снуЇ");
				} else {
					throw new WrongInputConsoleParametersException("¬ведений ¬ами м≥с€ць на планет≥ «емл€ ше не ≥снуЇ");
				}
			}
				break;

			case "2": { // check if season is available
				System.out.println("¬вед≥ть пору року : ");
				scan = new Scanner(System.in);
				String seasonsc = scan.next().toUpperCase();

				boolean flag = false;

				for (Mons ms : arraymis) {
					if (ms.getSeason().name().equalsIgnoreCase(seasonsc)) {
						flag = true;
					}
				}

				if (flag == true) {
					System.out.println("¬ведена ¬ами пора року " + seasonsc + " маЇ так≥ м≥с€ц≥ : ");

					for (Mons ms2 : arraymis) {
						if (ms2.getSeason().toString().equalsIgnoreCase(seasonsc)) {
							System.out.println(ms2);
						}
					}
				}

				else {
					throw new WrongInputConsoleParametersException(
							"¬ведена ¬ами пора року на планет≥ «емл€ ше не ≥снуЇ");
				}
			}
				break;

			case "3": { // check how many month have similar quantity of days
				System.out.println("¬вед≥ть к≥льк≥сть дн≥в в м≥с€ц≥ : ");
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
						System.out.println("¬ведена к≥льк≥сть дн≥в " + daysc + " присутн€ в таких м≥с€ц€х: ");
						for (Mons day2 : arraymis) {
							if (day2.getDay() == daysc) {
								System.out.println(day2);
							}
						}
					}
				}
				if (!flag) {
					throw new InputMismatchException("ћ≥с€ц€ ≥з " + daysc + " к≥льк≥стю дн≥в не ≥снуЇ");

				}
			}
				break;

			case "4": { // check how many month have less quantity of days
				System.out.println("¬вед≥ть к≥льк≥сть дн≥в в м≥с€ц≥ : ");
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
						System.out.println("ћ≥с€ц≥ ≥з меншою к≥льк≥стю дн≥в : ");
						for (Mons day2 : arraymis) {
							if (day2.getDay() < daysc) {
								System.out.println(day2);
							}
						}
					}
				}
				if (!flag) {
					throw new InputMismatchException("ћ≥с€ц€ ≥з " + daysc + " к≥льк≥стю дн≥в не ≥снуЇ");
				}
			}
				break;
			case "5": { // check how many month have less quantity of days
				System.out.println("¬вед≥ть к≥льк≥сть дн≥в в м≥с€ц≥ : ");
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
						System.out.println("ћ≥с€ц≥ ≥з б≥льшою к≥льк≥стю дн≥в :  ");
						for (Mons day2 : arraymis) {
							if (day2.getDay() > daysc) {
								System.out.println(day2);
							}
						}
					}
				}
				if (!flag) {
					throw new InputMismatchException("ћ≥с€ц€ ≥з " + daysc + " к≥льк≥стю дн≥в не ≥снуЇ");
				}
			}
				break;

			case "6": { // check next season
				System.out.println("¬вед≥ть пору року : ");
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
						System.out.println("Ќаступна пора року : " + arraysiz.get(i));
					} else {
						System.out.println("Ќаступна пора року : " + arraysiz.get(i + 1));
					}
					if (!flag) {
						throw new WrongInputConsoleParametersException(
								"¬ведена ¬ами пора року на планет≥ «емл€ ше не ≥снуЇ");
					}
				}
			}

				break;

			case "7": { // check previous season
				System.out.println("¬вед≥ть пору року : ");
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
						System.out.println("ѕопередн€ пора року : " + arraysiz.get(i));
					} else {
						System.out.println("ѕопередн€ пора року: " + arraysiz.get(i - 1));
					}
					if (!flag) {
						throw new WrongInputConsoleParametersException(
								"¬ведений ¬ами пора року на планет≥ «емл€ ше не ≥снуЇ");
					}
				}
			}
				break;
			case "8": { // check is quantity days of month even number
				for (Mons m : arraymis) {
					if (m.getDay() % 2 == 0) {
						System.out.println("ѕарн≥ м≥с€ц≥ : " + m);
					}
				}
			}
				break;

			case "9": { // check is quantity days of month odd number
				for (Mons m : arraymis) {
					if (m.getDay() % 2 != 0) {
						System.out.println("Ќе парн≥ м≥с€ц≥ : " + m);
					}
				}
			}
				break;

			case "10": { // check is the month even or odd
				System.out.println("¬вед≥ть м≥с€ць : ");
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
						System.out.println("¬казаний ¬ами м≥с€ць " + monssc + "парний");
					} else {
						System.out.println("¬казаний ¬ами м≥с€ць " + monssc + " не парний");
					}
				}
				if (!flag) {

					throw new WrongInputConsoleParametersException("¬ведений ¬ами м≥с€ць на планет≥ «емл€ ше не ≥снуЇ");
				}
			}
				break;
			}
		}

	}
}
