import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task_3 {
    public static void main(String[] args) {
        String planetsString = "Earth Mars Venus Mercury Earth Mercury Mercury Mars Mars Venus Mars";
        List<String> planetList = preparePlanetList(planetsString);
        List<String> uniqueList = getUniqueList(planetList);
        System.out.println(planetList);
        System.out.println("List size: " + planetList.size());
        System.out.println(uniqueList);
        showPlanetsQuantity(planetList, uniqueList);
    }
    private static List<String> preparePlanetList(String planetsString) {
        String[] planetsArray = planetsString.split(" ");
        List<String> planetsList = new ArrayList<>();
        Collections.addAll(planetsList, planetsArray);
        return planetsList;
    }
    private static List<String> getUniqueList(List<String> initialList) {
        List<String> uniqueList = new ArrayList<>();
        for (String planetName : initialList) {
            if (!uniqueList.contains(planetName)) {
                uniqueList.add(planetName);
            }
        }
        return uniqueList;
    }
    private static void showPlanetsQuantity(List<String> initialList, List<String> unigueList) {
        for (String planetName: unigueList) {
            int count = Collections.frequency(initialList, planetName);
            System.out.printf("%s: %d. ", planetName, count);
        }
    }
}
