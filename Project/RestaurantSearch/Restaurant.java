package Project.RestaurantSearch;

import java.util.ArrayList;
import java.util.List;
// import java.util.Scanner;
// import com.fasterxml.jackson.databind.node.ArrayNode;
// import com.fasterxml.jackson.databind.node.JsonNodeFactory;
// import com.fasterxml.jackson.databind.node.ObjectNode;
// import com.opencsv.CSVReader;
// import com.opencsv.CSVReaderBuilder;

public class Restaurant {
    // define variables
    
    private String name;
    private String cuisine;
    public String getName() {
        return name;
    }
    public String getCuisine() {
        return cuisine;
    }

    // load csv file into a list (haven't finished)

    // public static String loadRestaurants() {
    //     String input =
    //         new Scanner(Server.class.getResourceAsStream("/restaurants.csv"), "UTF-8")
    //             .useDelimiter("\\A")
    //             .next();
    //     CSVReader csvReader = new CSVReaderBuilder(new StringReader(input)).withSkipLines(1).build();
    //     ArrayNode restaurants = JsonNodeFactory.instance.arrayNode();
    //     for (String[] parts : csvReader) {
    //       ObjectNode restaurant = JsonNodeFactory.instance.objectNode();
    //       restaurant.put("id", parts[0]);
    //       restaurant.put("name", parts[1]);
    //       restaurant.put("cuisine", parts[2]);
    //       restaurant.put("url", parts[3]);
    //       restaurants.add(restaurant);
    //     }
    //     return restaurants.toPrettyString();
    //   }


    // search restaurants by keyword (matching name and cuisine)

    public static List<Restaurant> search(final List<Restaurant> restaurants, final String search) {
        if (restaurants == null || search == null) {
          throw new IllegalArgumentException();
        }
    
        String fixSearch = search.trim().toLowerCase();
        List<Restaurant> toReturn = new ArrayList<>();
    
        for (Restaurant restaurant : restaurants) {
          if (fixSearch.equals("")) {
            toReturn.add(restaurant);
          } else {
            if (restaurant.cuisine.toLowerCase().equals(fixSearch)) {
              toReturn.add(restaurant);
            }
          }
        }
    
        if (toReturn.size() == 0) {
          for (Restaurant restaurant : restaurants) {
            String name = restaurant.getName().toLowerCase();
            String cuisine = restaurant.getCuisine().toLowerCase();
            if (name.contains(fixSearch) || cuisine.contains(fixSearch)) {
              toReturn.add(restaurant);
              System.out.println(name);
            }
          }
        }
        return toReturn;
      }
}