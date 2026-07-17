/*    
            INPUT :         iRow : 6        iCol : 6

            OUTPUT :   
                                1       2       3       4       5       6
                                1       2                               6
                                1               3                       6
                                1                       4               6
                                1                               5       6
                                1       2       3       4       5       6        
                                                    
*/

import java.util.*;

class Print
{
    public void Display(int iRow , int iCol)
    {
        int i = 0 , j = 0 ;

        if ( iRow != iCol )
        {
            System.out.println("Invalid Input ");
            System.out.println("Number of Rows and Columns should be same ");
            return ;
        }

        for(i = 1 ; i <= iRow ; i++ )
        {
            for(j = 1 ; j <= iCol ; j++)
            {
                if ( i == j || i == iRow || i == 1 || j == 1 || j == iCol )
                {
                    System.out.print(j +"\t");
                }
                else
                {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
}

class PS28e
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0 , iValue2 = 0;

        System.out.println("Enter Number of Rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Number of Columns : ");
        iValue2 = sobj.nextInt();

        Print pobj = new Print();

        pobj.Display(iValue1 , iValue2);

    }
}