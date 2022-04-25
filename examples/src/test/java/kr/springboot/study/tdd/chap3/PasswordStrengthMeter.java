package kr.springboot.study.tdd.chap3;

public class PasswordStrengthMeter {
    public PasswordStrength meter(String s) {
        if (s.length() >= 8) return PasswordStrength.STRONG;
        return PasswordStrength.WEAK;

    }

}
