// Author : Dirac Murairi
import java.util.HashMap;

public class Question_2 {
    public static void main(String[] args) {
        // Create a HashMap object
        HashMap < String, String > countryPresident_1 = new HashMap < String, String > ();
        HashMap < String, String > countryPresident_2 = new HashMap < String, String > ();
        HashMap < String, String > countryPresident_3 = new HashMap < String, String > ();
        HashMap < String, String > countryPresident = new HashMap < String, String > ();

        // Add keys and values (Country, City)
        countryPresident_1.put("Cameroon", "Paul Biya");
        countryPresident_1.put("DRCongo", "Felix Tshisekedi");
        countryPresident_1.put("Sierra Leon", "Maada");
        countryPresident_1.put("Rwanda", "Paul Kagame");

        countryPresident_2.put("Congo", " Denis Sassou Nguesso");
        countryPresident_2.put("Angola", " João Lourenço");
        countryPresident_2.put("Uganda", "Yoweri Museveni");
        countryPresident_2.put("Tanznia", " John Magufuli");

        countryPresident_3.put("Egypte", " Abdel Fattah el-Sisi");
        countryPresident_3.put("Algeria", "Abdelmadjid Tebboune");
        countryPresident_3.put("Nigeria", " Muhammadu Buhari");
        countryPresident_3.put("Togo", "Faure Gnassimgbe");

        // copy all values to the last HashMap
        copyMap(countryPresident_1, countryPresident);
        copyMap(countryPresident_2, countryPresident);
        copyMap(countryPresident_3, countryPresident);

        //print all values
        for (String i: countryPresident.keySet()) {
            System.out.println("Key : " + i + ", value : " + countryPresident.get(i));
        };

    }

    // create a function that copy all data into another HashMap
    public static void copyMap(HashMap < String, String > map_1, HashMap < String, String > map_2) {
        map_2.putAll(map_1);
    };
}