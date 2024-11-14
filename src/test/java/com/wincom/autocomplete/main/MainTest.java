package com.wincom.autocomplete.main;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

//    @org.junit.jupiter.api.BeforeEach
//    void setUp() {
//    }
//
//    @org.junit.jupiter.api.AfterEach
//    void tearDown() {
//    }
//
//    @org.junit.jupiter.api.Test
//    void getResults() {
//    }
//
//    @org.junit.jupiter.api.Test
//    void main() {
//    }

    @Test
    public void getResults_caseInsensitiveSearch_suggestionList() {
        Main main = new Main();

        List<String> suggestions = main.getResults("pRo");
        assertEquals(List.of("Proactive", "Processor", "Procurable", "Progenex"), suggestions, "This should retrieve a keyword suggestion list (up to 4 keywords) regardless of capital letters within the input");
    }


    @Test
    public void getResults_noMatches_emptyList() {
        Main main = new Main();

        List<String> suggestions = main.getResults("HZK");
        assertEquals(List.of(), suggestions, "This should retrieve an empty list");
    }

    @Test
    public void getResults_someMatches_fewerThanFour(){
        Main main = new Main();

        List<String> suggestions = main.getResults("Kay");
        assertEquals(List.of("Kayak"), suggestions, "This should retrieve keyword matches when they are less than 4");
    }


    @Test
    public void getResults_limitListSizeToFour_fourKeywords(){
        Main main = new Main();

        List<String> suggestions = main.getResults("pro");
        assertEquals(4, suggestions.size(), "This should retrieve up to 4 keyword suggestions");

    }

    @Test
    public void getResults_sortListAlphabetically_alphabeticallyOrderedList(){
        Main main = new Main();

        List<String> suggestions = main.getResults("p");
        for(int i =0; i < suggestions.size() - 1; i++ ){
            assertTrue(suggestions.get(i).compareTo(suggestions.get(i+1)) <= 0, "This should retrieve a list of keyword suggestions alphabetically ordered");
        }


    }


}