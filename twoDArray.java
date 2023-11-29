import java.util.*;
public class twoDArray {
    //decleration of 2D arrays
    // type[][] arrayname = new type[rows][columns];
    // int[][] numbers[][] = new int [3][5];
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // int row = input.nextInt();
        // int column = input.nextInt();

        // int[][] numbers = new int[row][column];

        // for(int i=0;i<row;i++){
        //     for(int j=0;j<column;j++){
        //         System.out.print("Enter number "+(i+1)+","+(j+1)+" :");
        //         numbers[i][j] =input.nextInt();
        //     }
        // }
        // for(int i=0;i<row;i++){
        //     for(int j=0;j<column;j++){
        //         System.out.print(" Number "+(i+1)+","+(j+1)+" :"+numbers[i][j]);
        //     }
        //     System.out.println();
        // }
        // System.out.print("Enter the number you want to find:");
        // int searchNum = input.nextInt();
        // for(int i=0;i<row;i++){
        //     for(int j=0;j<column;j++){
        //         if(numbers[i][j]==searchNum){
        //             System.out.println("This number in Row-"+i+" and in column-"+j+".");
        //         }
        //     }
        // }
        

        // int[] number = {1,2,3,4,5,6,7,8,9};
        int matrix[][] = new int[4][4];
        int value = 1;
        int n=4,m=4;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("");
                if(j==3){
                    for(i=0;i<n;i++){
                        System.out.println();
                        System.out.print(i+""+j+" ");
                    }
                }
            }
            n=n-1;
            m=m-1;   
            System.out.println();
        }
    }
}
