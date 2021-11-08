package telran.temporal.adjusters;

import java.time.Year;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class NonLeapYearsAdjuster implements TemporalAdjuster {
	int nYears;

	public NonLeapYearsAdjuster(int nYears) {
		this.nYears = nYears;
	}

	@Override
	public Temporal adjustInto(Temporal temporal) {
		int year = temporal.get(ChronoField.YEAR);
		for (int i = 0; i < nYears; i++) {
			year++;
			if (Year.isLeap(year)) {
				year++;
			}
		}
		return temporal.with(ChronoField.YEAR, year);
	}

}
