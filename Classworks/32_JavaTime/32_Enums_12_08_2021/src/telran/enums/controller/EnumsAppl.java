package telran.enums.controller;

import telran.enums.model.MathConst;
import telran.enums.model.Season;

public class EnumsAppl {

	public static void main(String[] args) {
		Season season = Season.AUTUMN;
		System.out.println(season);
		season = Season.WINTER;
		System.out.println(season);
		Season[] seasons = Season.values();
		for (int i = 0; i < seasons.length; i++) {
			System.out.println(seasons[i]);
		}
		int index = season.ordinal();
		System.out.println(index);
		index = Season.SUMMER.ordinal();
		System.out.println(index);
		String name = season.name();
		System.out.println(name);
		season = Season.valueOf("AUTUMN");
		System.out.println(season);
		System.out.println(MathConst.PI.getValue());
	}

}
