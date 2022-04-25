package kr.springboot.study.tdd.chap3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordStrengthMeterTest {

    @Test
    void meetsOnlyUpperCriteria_Then_Weak() {

        PasswordStrengthMeter meter = new PasswordStrengthMeter();
        PasswordStrength result = meter.meter("abcDef");
        assertEquals(PasswordStrength.WEAK, result);

    }

    @Test
    void meetsAllCriteria_Then_Weak() {

        PasswordStrengthMeter meter = new PasswordStrengthMeter();
        PasswordStrength result = meter.meter("abcDef12");
        assertEquals(PasswordStrength.STRONG, result);
        PasswordStrength result2 = meter.meter("aZcDef12");
        assertEquals(PasswordStrength.STRONG, result2);

    }

}
