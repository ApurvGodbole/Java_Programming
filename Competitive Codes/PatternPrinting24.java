/*
    INPUT : iRow : 5    iCol : 5

    OUTPUT :        *   *   *   *   *
                    *   @   @   @   *
                    *   @   @   @   *
                    *   @   @   @   *
                    *   *   *   *   *

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

        for(i = 1 ; i <= iRow ; i++)
        {
            for(j = 1 ; j <= iCol ; j++)
            {
                if (i == 1 || i == iRow || j == 1 || j == iCol )
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("@\t");
                }
            }
            System.out.println();
        }
    }
}

class PS26d
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