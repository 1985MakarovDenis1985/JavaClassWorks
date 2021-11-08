package temporalAdjaster.adjuster;

import org.junit.jupiter.api.Test;
import temporalAdjaster.controller.TemporalApp;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class NonLeapYearsAdjusterTest{

    @Test
    void adjustInto() {
        LocalDate ld = LocalDate.of(2021, 8, 15);
        assertEquals(2023, ld.with(new NonLeapYearsAdjuster(2)).getYear());
        assertEquals(2025, ld.with(new NonLeapYearsAdjuster(3)).getYear());
    }
}