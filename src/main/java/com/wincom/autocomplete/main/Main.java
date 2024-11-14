package com.wincom.autocomplete.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    //List of keywords to be shown given an input
    private static final List<String> keywords = List.of(
            "Pandora", "Pinterest", "Paypal", "Pg&e", "Project free tv", "Priceline", "Press democrat", "Progressive", "Project runway",
            "Proactive", "Programming", "Progeria", "Progesterone", "Progenex", "Procurable", "Processor", "Proud", "Print", "Prank",
            "Bowl", "Owl", "River", "Phone", "Kayak", "Stamps", "Reprobe"
    );



    /**
     * Retrieves a list with up to 4 keyword suggestions (alphabetically ordered) that match a given input string.
     *
     * @param input the input string for matching keywords
     * @return a list of up to 4 matching keywords given the input above
     */


    public static List<String> getResults(String input) {

        //convert input to lowercase to ensure case-insensitive matching
        String cleanInput = input.toLowerCase();

        //Create a list to save the keyword suggestions
        List<String> suggestions = new ArrayList<>();

        //search the keywords that match the input typed & add them to the suggestions list
        for (String keyword : keywords){
            if(keyword.toLowerCase().startsWith(cleanInput)){
                suggestions.add(keyword);
            }
        }

        //Order the suggestion list alphabetically
        Collections.sort(suggestions);

        //Limit the suggestion list to show up to 4 keywords
        if (suggestions.size() > 4 ){
            return suggestions.subList(0,4);
        } else {
            return suggestions;
        }

    }

    /**
     * Main method to run the keyword autocomplete functionality
     * @param arg Comand-line arguments (not used)
     */

    public static void main(String[] arg){

        //Use example
        String input = "pro";
        List<String> results = getResults(input);

        //Print the results
        for (String suggestion: results){
            System.out.println(suggestion);

        }

    }

}
