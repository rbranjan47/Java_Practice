package extraConcept;

import java.util.ArrayList;

public class TwoDArrayLists {
    public static void main(String[] args){
        ArrayList<String> places = new ArrayList<>();
        places.add("Noida");
        places.add("Mumbai");
        places.add("Pune");
        places.add("Gurugram");
        places.add("Bangalore");

        ArrayList<String> ranks = new ArrayList<>();
        ranks.add("1");
        ranks.add("2");
        ranks.add("3");
        ranks.add("4");
        ranks.add("5");

        ArrayList<String> itValues = new ArrayList<>();
        itValues.add("6.5");
        itValues.add("7.4");
        itValues.add("7.0");
        itValues.add("6.8");
        itValues.add("8.5");

        //Object types i.e. String must be same across all the List
        ArrayList<ArrayList<String>> twoDArrayList = new ArrayList<>();
        twoDArrayList.add(places);
        twoDArrayList.add(ranks);
        twoDArrayList.add(itValues);

        System.out.println(twoDArrayList);
    }
}
