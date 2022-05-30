import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AirplaneApplication {

    public static void main(String[] args) throws Exception {
        List<String> course = Files.readAllLines(Paths.get("src/main/java/course.txt"));
        System.out.println("Result: " +instructions(course));
    }

    public static String instructions(List<String> input) {
        int vertical = 0;
        int horizontal = 0;
        int target = 0;
        for (String line : input) {
            String[] command = line.split(" ");
            int value = Integer.parseInt(command[1]);
            switch (command[0]) {
                case "forward" -> {
                    horizontal += value;
                    vertical += target * value;
                }
                case "dive" -> {
                    horizontal -= value;
                    vertical -= target * value;
                }
                case "up"   -> target += value;
                case "down" -> target -= value;
            }
        }
        return String.valueOf(vertical * horizontal);
    }
}
