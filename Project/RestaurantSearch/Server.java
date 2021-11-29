package Project.RestaurantSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Server {
    // load csv file into a list (haven't finished)

    public static void main() {
        List<Restaurant> restaurants = readRestaurantsFromCSV("restaurants.txt");

    } 


    private static List<Restaurant> readRestaurantsFromCSV(String files) {
        List<Restaurant> restaurants = new ArrayList<>();
        Path pathToFile = Paths.get(files);

        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {

            String line = br.readLine();
             while (line != null) {
                String[] attributes = line.split(",");
                Restaurant restaurant = createRestaurant(attributes);

                restaurants.add(restaurant);

                line = br.readLine();
             }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return restaurants;
    }

    public static Restaurant createRestaurant(String[] data) {
        String id = data[0];
        String name = data[1];
        String cuisine = data[2];
        String url = data[3];
        return new Restaurant(id, name, cuisine, url);
    }
}

