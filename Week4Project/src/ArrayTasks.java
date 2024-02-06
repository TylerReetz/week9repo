
public class ArrayTasks {
 public static void main(String[] args) {
	 int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

     int result = ages[ages.length - 1] - ages[0];
     System.out.println(result);

     int[] ages2 = new int[9];

     for (int i = 0; i < ages.length; i++) {
         ages2[i] = ages[i];
     }

     int result2 = ages2[ages2.length - 1] - ages2[0];
     System.out.println(result2);

     double sum = 0;
     for (int age : ages) {
         sum += age;
     }
     double averageAge = sum / ages.length;
     System.out.println(averageAge);

     String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

     int totalLetters = 0;
     for (String name : names) {
         totalLetters += name.length();
     }
     double averageLetters = (double) totalLetters / names.length;
     System.out.println(averageLetters);

     StringBuilder concatenatedNames = new StringBuilder();
     for (String name : names) {
         concatenatedNames.append(name).append(" ");
     }
     System.out.println(concatenatedNames.toString().trim());

     // to access the last element in an array use the following code
    // int lastElement = ages[ages.length - 1];

     // to access the first element in an array use the following code
    // int firstElement = ages[0];

     int[] nameLengths = new int[names.length];
     for (int i = 0; i < names.length; i++) {
         nameLengths[i] = names[i].length();
     }

     int sumOfNameLengths = 0;
     for (int length : nameLengths) {
         sumOfNameLengths += length;
     }
     System.out.println(sumOfNameLengths);

    // A method that takes a String, word, and an int and returns the word concatenated to itself n number of times:
    //StringBuilder result = new StringBuilder();
    //for (int i = 0; i < n; i++)
        // result.append(word);
     	// return result.toString();
    
     
     // A method to return a full name:
     // String getFullName(String firstName, String lastName)
     //  return firstName + " " + lastName;

     
     // A method to check if sum of ints in array is greater than 100:
     // boolean isSumGreaterThan100(int[] array) {
     //int sum = 0;
     //for (int value : array) 
     // sum += value;
     //return sum > 100;

     
     // A method to calculate average of elements in double array:
     //double sum = 0;
     //for (double value : array)
     // sum += value;
     //return sum / array.length;

     
     // A method to compare averages of two double arrays:
     //double calculateAverage(double[] array)
     //double sum = 0;
     //for (double value : array) 
     //sum += value;
     //return sum / array.length;
     //boolean compareAverages(double[] array1, double[] array2)
     //double average1 = calculateAverage(array1);
     //double average2 = calculateAverage(array2);
     //return average1 > average2;
     

     //A method to determine if to buy a drink
     //boolean willBuyDrink(boolean isHotOutside, double moneyInPocket)
     //return isHotOutside && moneyInPocket > 10.50;
     
     
     
 }


 }

