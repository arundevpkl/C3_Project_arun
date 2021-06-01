import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    private static List<Restaurant> restaurants = new ArrayList<>();

    public Restaurant findRestaurantByName(String restaurantName){
        for (Restaurant restaurant : getRestaurants()) {

            if (restaurant.getName().equals(restaurantName)) {
                return restaurant;
               }

        }
        /*if(getRestaurants().contains(restaurantName)){
            return restaurantName;
        }*/


        return null;
    }


    public Restaurant addRestaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        Restaurant newRestaurant = new Restaurant(name, location, openingTime, closingTime);
        restaurants.add(newRestaurant);
        return newRestaurant;
    }

    public Restaurant removeRestaurant(String restaurantName) throws restaurantNotFoundException {
        Restaurant restaurantToBeRemoved = findRestaurantByName(restaurantName);
        restaurants.remove(restaurantToBeRemoved);
        return restaurantToBeRemoved;
    }

    public List<Restaurant> getRestaurants() {
        Restaurant restaurant1=new Restaurant("name1", "location1", null,null);
        restaurants.add(restaurant1);
        Restaurant restaurant2=new Restaurant("name2", "location2", null,null);
        restaurants.add(restaurant2);
        Restaurant restaurant3=new Restaurant("name3", "location3", null,null);
        restaurants.add(restaurant3);
        return restaurants;
    }
}
