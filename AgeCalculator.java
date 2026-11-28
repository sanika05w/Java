import java.time.*;

public class AgeCalculator
{
    public static void main(String[] args) {
        LocalDate dob = LocalDate.of(2003, 5, 14);
        LocalDate today = LocalDate.of(2026, 11, 28);
        Period p = Period.between(dob, today);
        System.out.println(p.getYears() + " years, " + p.getMonths() + " months, " + p.getDays() + " days");
    }
}
