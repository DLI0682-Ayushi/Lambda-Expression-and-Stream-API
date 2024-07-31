import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterList {
    public static void main(String[] args) {
    List<String> list = Arrays.asList("Ayushi","Aradhya","Anil","Rekha","Yash");
    List<String> filteredString = list.stream().filter(s -> s.startsWith("A") ).collect(Collectors.toList());
        System.out.println("Filtered String: " + filteredString);
    }
}
