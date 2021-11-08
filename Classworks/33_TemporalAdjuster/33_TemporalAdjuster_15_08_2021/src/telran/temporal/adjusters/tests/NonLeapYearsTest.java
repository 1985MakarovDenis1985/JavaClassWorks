package telran.temporal.adjusters.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import telran.temporal.adjusters.NonLeapYearsAdjuster;

class NonLeapYearsTest {

	@Test
	void test() {
		LocalDate ld = LocalDate.of(2021, 8, 15);
		assertEquals(2023, ld.with(new NonLeapYearsAdjuster(2)).getYear());
		assertEquals(2025, ld.with(new NonLeapYearsAdjuster(3)).getYear());
		
	}

}
