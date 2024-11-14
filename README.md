# Autocomplete Suggestion Tool

This project implements a basic autocomplete functionality similar to Google's autocomplete feature. 
Given a set of keywords, the program suggests up to four keywords based on the input string, sorted alphabetically.

## Features
- Returns up to 4 keyword suggestions based on the input
- Matches are case-insensitive
- Suggestions are returned in alphabetical order

## Usage

To use this functionality, you can call the method `getResults(String input)` by providing and input string in the `main` method. 
This will return up to four suggestions based on that input. 

### Example

For example, given the input `"p"`, the function will return:

Pandora, 
Paypal, 
Pg&e,
Phone

up to 4 keywords
sorted alphabetically.

## Testing

The project includes some JUnit tests to validate the functionality:

### Test Cases

1. **Case Insensitive Search** (`getResults_caseInsensitiveSearch_suggestionList`):
   - Verifies that the search is case-insensitive.
   - Example: Given input `"pRo"`, it should return `["Proactive", "Processor", "Procurable", "Progenex"]`.

2. **No Matches** (`getResults_noMatches_emptyList`):
   - Ensures an empty list is returned if there are no matching keywords.
   - Example: Given input `"HZK"`, it should return an empty list `[]`.

3. **Fewer Than Four Matches** (`getResults_someMatches_fewerThanFour`):
   - Tests that the method returns all matching keywords if there are fewer than four.
   - Example: Given input `"Kay"`, it should return `["Kayak"]`.

4. **Limit List Size to Four** (`getResults_limitListSizeToFour_fourKeywords`):
   - Verifies that the method limits the result list to a maximum of 4 items.
   - Example: Given input `"pro"`, it should return exactly 4 items.

5. **Alphabetical Order** (`getResults_sortListAlphabetically_alphabeticallyOrderedList`):
   - Ensures that the returned list is in alphabetical order.
   - Example: Given input `"p"`, the returned list should be sorted alphabetically.

### Running the Tests

To run the tests:
1. Open the project in IntelliJ IDEA.
2. Right-click on the `AutoCompleteTest` class and select **Run 'AutoCompleteTest'** to execute all tests.
3. Verify that all tests pass to confirm functionality.

## Setup Instructions
1. Clone the repository.
2. Compile the project using Java or Maven.
3. Follow the testing steps above to verify the functionality.


## OPTIONAL 
• What would you change if the list of keywords was large (several millions)?

I would use a Prefix Tree to store the input and retrieve the suggestions. 
The startsWith() function in this data structure allows us to perform fast prefix lookups, which is what we are looking for in this Autocomplete functionality.

The next step to this would be using a database solution.

• What would you change if the requirements were to match any portion of the keywords (example:
for string “pro”, code would possibly return “reprobe”)

Instead of focusing on a prefix matching solution with the startsWith() function, we would focus on a contains() function as a substring matching solution.
