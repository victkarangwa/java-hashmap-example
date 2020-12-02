import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("Rwanda", "Kigali");
        capitalCities.put("Burundi", "Bujumbura");
        capitalCities.put("Uganda", "Kampala");
        capitalCities.put("Tanzania", "Dar Es Salam");
        capitalCities.put("DRC", "Kinshasa");

        //       Print keys
        for(String i : capitalCities.keySet()) {
            System.out.println("Key: "+i);
        }
        System.out.println("===================================");

        //       Print values
        for(String i : capitalCities.values()) {
            System.out.println("Value: "+i);
        }
        System.out.println("===================================");
//       Print keys with values
        for(String i : capitalCities.keySet()) {
            System.out.println("Key: "+i+", Value: " + capitalCities.get(i));
        }
        System.out.println("===================================");
        //       Access an item
        var item = capitalCities.get("Rwanda");
            System.out.println("Accessed item: "+ item);
        System.out.println("===================================");

        //       Remove an item
        var itemToRemove = capitalCities.remove("Burundi");
        System.out.println("Removed item: "+ itemToRemove);

        System.out.println("===================================");

        //       Items left after removal
        for(String i : capitalCities.keySet()) {
            System.out.println("Key: "+i+", Value: " + capitalCities.get(i));
        }
    }

}
