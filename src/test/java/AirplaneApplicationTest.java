import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirplaneApplicationTest {

    AirplaneApplication airplaneTest = new AirplaneApplication();

    @Test
    @DisplayName("checks the course route with answer 510")
    public void checksIfCourseInExampleIsRight() {

        List<String> exampleCourse = List.of(
                "forward 4",
                "up 2",
                "forward 8",
                "down 1",
                "forward 2",
                "up 3",
                "forward 3"
        );
        assertEquals(airplaneTest.instructions(exampleCourse), "510");
    }
}
