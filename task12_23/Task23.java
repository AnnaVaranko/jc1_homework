package task12_23;

public class Task23 {
    public static void getButterfly(){
        int[][] myArr = new int[4][4];

        for(int i = 0; i < myArr.length/2 +1; i++){
            for(int j = 0; j < myArr[i].length; j++){
                if(j < i || j > myArr[i].length - 1 - i)
                    myArr[i][j] = 0;
                else myArr[i][j] = 1;
            }
        }
        for(int i = myArr.length - 1; i > myArr.length/2 - 1; i--){
            for(int j = 0; j < myArr[i].length; j++){
                if(j < myArr[i].length -1 -i || j > i)
                    myArr[i][j] = 0;
                else myArr[i][j] = 1;
            }
        }

        for (int[] ints : myArr) {
            for (int anInt : ints) System.out.print(anInt + " ");
            System.out.print("\n");
        }

    }

    public static void main(String[] args) {
        getButterfly();
    }
}
