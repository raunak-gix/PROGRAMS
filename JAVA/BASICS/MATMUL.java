public class MATMUL {
    public static void main(String args[])
    {
        int i,j,k,a=0,b=0,c=0;
        int mat1[][]={{1,2,3,},{4,5,6},{7,8,9}};
        int mat2[][]={{9,8,7},{6,5,4},{3,2,1}};
        int mat3[][]=new int[3][3];
        System.out.println("The matrix is :-");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                for(k=0;k<3;k++)
                {
                    if(k==0)
                    {
                        a+=mat1[i][j]*mat2[j][k];
                    }
                    if(k==1)
                    {
                        b+=mat1[i][j]*mat2[j][k];
                    }
                    if(k==2)
                    {
                        c+=mat1[i][j]*mat2[j][k];
                    }
                }
            }
            System.out.print(a+" "+b+" "+c);
            System.out.println();
        }
    }
}
