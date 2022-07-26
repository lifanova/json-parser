import ru.lifanova.convert.ConvertUtils;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String jsonFileName = "new_data.json";

        List<String> lines = ConvertUtils.readFromFile(jsonFileName);
        ConvertUtils.processLines(lines);
    }
}
