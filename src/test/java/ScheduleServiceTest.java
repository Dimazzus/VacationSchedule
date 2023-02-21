import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScheduleServiceTest {
    @Test
    void shouldCalculateVacationMonths() {
        ScheduleService service = new ScheduleService();
        int expected = 2;
        int actual = service.calculate(100000, 60000, 150000);
        Assertions.assertEquals(expected, actual);

    }
}
