import java.util.Scanner;
class MultiArray{
    public static void main(String []args)
    //int[][] matrix =new int[3][3]
    {
        int [][] matrix={{2,3},{7,8,9},{12,13,15}};

        for(int [] row : matrix)
        {
            for(int value : row)
            {
                System.out.print("\t"+value);
            }
        
       // for(int i=0;i<3;i++)
       // {
        //    for(int j=0;j<3;j++)
         // {
         //       System.out.println("\t"+matrix[i][j]);
          // }
           System.out.println();}
        //}

    }

}