package telran.enums.controller;

import telran.enums.model.Month;

public class MonthAppl {

	public static void main(String[] args) {
		Month month = Month.FEB;
		System.out.println(month.plusMonth(2));//APR
		System.out.println(Month.SEP.plusMonth(48));//NOV
		String name = Month.getName(1);
		System.out.println(name);//JAN
		System.out.println(Month.getName(14));//FEB
	}

}
