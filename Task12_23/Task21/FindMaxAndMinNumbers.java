package Task12_23.Task21;

public class FindMaxAndMinNumbers {
    public int getMaxAndMinNumbers(int[] numbers) {
        int maxNumber = 0, indexMaxNumber = 0;
        int minNumber = numbers[0], indexMinNumber = 0;
        int difference, differenceNewNumber;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
                indexMaxNumber = i;
            } else if (numbers[i] < minNumber) {
                minNumber = numbers[i];
                indexMinNumber = i;
            } else if (maxNumber == numbers[i]) {
                difference = indexMaxNumber - indexMinNumber;
                difference = Math.abs(difference);
                differenceNewNumber = i - indexMinNumber;
                differenceNewNumber = Math.abs(differenceNewNumber);
                if (differenceNewNumber > difference) {
                    maxNumber = numbers[i];
                    indexMaxNumber = i;
                }
            } else if (minNumber == numbers[i]) {
                difference = indexMaxNumber - indexMinNumber;
                difference = Math.abs(difference);
                differenceNewNumber = i - indexMaxNumber;
                differenceNewNumber = Math.abs(differenceNewNumber);
                if (differenceNewNumber > difference) {
                    minNumber = numbers[i];
                    indexMinNumber = i;
                }
            }
        }
        for(int j = 0; j < numbers.length; j++){
            if(indexMinNumber < indexMaxNumber){
                if (j > indexMinNumber && j < indexMaxNumber) sum += numbers[j];
            } else {
                if (j < indexMinNumber && j > indexMaxNumber) sum += numbers[j];
            }
        }
        System.out.print("\nMax number is " + maxNumber);
        System.out.println(". Min number is " + minNumber);
        return sum;
    }
}
