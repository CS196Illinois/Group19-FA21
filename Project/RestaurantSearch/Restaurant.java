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
    private String id;
    private String url;
    private double lat;
    private double lng;

    // getter
    public String getName() {
        return name;
    }
    public String getCuisine() {
        return cuisine;
    }
    public String getId() {
      return id;
    }
    public String getUrl() {
      return url;
    }
    public double getLat() {
      return lat;
    }
    public double getLng() {
      return lng;
    }


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

    public Restaurant(String setId, String setName, String setCuisine, String setUrl) {
      id = setId;
      name = setName;
      cuisine = setCuisine;
      url = setUrl;
    }
}  