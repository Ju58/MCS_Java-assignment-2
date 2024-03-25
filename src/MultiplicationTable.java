public class MultiplicationTable {
    public static void main(String[] args){
        //Display multiplication table
        generateMultiplicationTable();

        //Display squares of numbers 1 to 10
        displaySquares();
    }

    private static void generateMultiplicationTable(){
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                int result = i * j;
                System.out.printf("%dx%d = %d%n",i,j,result);
            }
        }
    }
    private static void displaySquares(){
        for(int num = 1; num <= 10; num++){
            int square = calculateSquare(num);
            System.out.printf("%d square=%d%n",num,square);
        }
    }
    private static int calculateSquare(int num){
        return num * num;
    }
}
