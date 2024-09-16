public class LDSUM {
    public static void main(String args[])
    {
        int i,j,Sum=0;
        int mat[][]={{1,2,3,},{4,5,6},{7,8,9}};
        System.out.println("The matrix is :-");
        for(i=0;i<3;i++)
        {
            
            for(j=0;j<3;j++)
            {
                if(i==j)
                {
                    Sum+=mat[i][j];
                }
                // else
                // {
                //     continue;
                // }
            }
            
        }
        System.out.print(Sum);
    }
}

