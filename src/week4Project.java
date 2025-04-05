
public class week4Project {

	public static void main(String[] args) {
		//First array of int called ages with their values
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
        
        // a. Subtract the value of the first element from the last element
        int result = ages[ages.length - 1] - ages[0];
        System.out.println(result);
    
        // b. Create a new array ages2 with 9 elements, added 45 as the last element
        int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 45};
        
        // i. Subtract first element from last in ages2
        int result2 = ages2[ages2.length - 1] - ages2[0];
        System.out.println(result2);
        
        // c. Calculate the average age
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        double averageAge = (double) sum / ages.length;
        System.out.println("Average age: " + averageAge);
        
        //String array with the requested values
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        // a. Calculate the average number of letters per name
        int totalLetters = 0;
        for (String name : names) {
            totalLetters += name.length();
        }
        double averageLetters = (double) totalLetters / names.length;
        System.out.println("Average number of letters per name: " + averageLetters);

        // b. Concatenate all names together, separated by spaces
        String concatenatedNames = "";
        for (String name : names) {
            concatenatedNames += name + " ";
        }
        System.out.println("Concatenated names: " + concatenatedNames);
        
        // 5,6. Access the names array and print out the sum of the names length
        int[] nameLengths = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }
        int totalLength = 0;
        for (int length : nameLengths) {
            totalLength += length;
        }
        System.out.println("Sum of name lengths: " + totalLength);
    }

    // 7. Concatenate a word n number of times
    public static String concatenateWord(String word, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(word);
        }
        return result.toString();
    }

    // 8. Method to return fullName
    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    // 9. Method to check if sum is greater than 100 in int array
    public static boolean isSumGreaterThan100(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum > 100;
    }

    // 11. Method to compare averages of two double arrays
    public static boolean isFirstArrayAverageGreater(double[] array1, double[] array2) {
        return calculateAverage(array1) > calculateAverage(array2);
    }

    // 10. Method to calculate average
    private static double calculateAverage(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // 12. Method willBuyDrink
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }
    
    //Method to calculate and return the product of 2 integers
    public static int equation(int euqals) {
    	int a = 45;
    	int b = 65;
    	int product = a * b;
    	return product;
    	
    }
	}


