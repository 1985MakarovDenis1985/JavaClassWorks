package telran.city.controller;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

import telran.city.model.City;

public class CityAppl {

	public static void main(String[] args) {
		City[] usa = new City[8];
		usa[0] = new City("Denver", 600_000);
		usa[1] = new City("Chicago", 2_700_000);
		usa[2] = new City("Atlanta", 470_000);
		usa[3] = new City("Boston", 600_000);
		usa[4] = new City("New York", 85_000);
		usa[5] = new City("Dallas", 1_300_000);
		usa[6] = new City("New York", 5_000);
		usa[7] = new City("New York", 8_500_000);
		printArray(usa);
//		Arrays.sort(usa);
//		printArray(usa);
		Comparator<City> comp = (c1, c2) -> {
			int res = c1.getName().compareTo(c2.getName());
			return res != 0 ? res : -Integer.compare(c1.getPopulation(), c2.getPopulation());
		};
		Arrays.sort(usa, comp);
		printArray(usa);
		City city = new City("New York", 600_000);
		int index = Arrays.binarySearch(usa, city, comp);
		System.out.println("index = " + index);
		System.out.println("=========== Copy ============");
		City[] usa1 = Arrays.copyOf(usa, usa.length *2);
		Arrays.sort(usa1, 0, usa.length);
		printArray(usa1);
		printArray(usa);
		City[] usa2 = Arrays.copyOfRange(usa, 2, 7);
		printArray(usa2);
		City[] usa3 = new City[4];
		System.arraycopy(usa, 1, usa3, 0, 4);
		printArray(usa3);
		System.out.println("======== Keep sort ==============");
		printArray(usa);
		//city = new City("Kanzas-City", 1_000_000);
		city = new City("Boston", 700_000);
		index = Arrays.binarySearch(usa, city, comp);
		index = index >= 0 ? index : -index - 1;
		City[] res = new City[usa.length + 1];
		System.arraycopy(usa, 0, res, 0, index);
		System.arraycopy(usa, index, res, index + 1, usa.length - index);
		res[index] = city;
		printArray(res);
	}

	private static City[] copyArray(City[] arr) {
		City[] res = new City[arr.length];
		for (int i = 0; i < arr.length; i++) {
			res[i] = arr[i];
		}
		return res;
	}

	private static void printArray(City[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("==================");
	}

}
