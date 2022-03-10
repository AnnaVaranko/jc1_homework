package Task12_23.Task22;

public class NewArray {
    public void getArray(MyArray myArr) {
        for(int j = 0; j < myArr.numbers.length; j++){
            if (j >= (myArr.numbers.length - j - 1)) break;
            int temporary = myArr.numbers[j];
            myArr.numbers[j] = myArr.numbers[myArr.numbers.length - j - 1];
            myArr.numbers[myArr.numbers.length - j - 1] = temporary;
        }
        System.out.print("\nNew array: ");
        for (int index = 0; index < myArr.numbers.length; index++){
            System.out.print(myArr.numbers[index] + " ");
        }
    }
}
