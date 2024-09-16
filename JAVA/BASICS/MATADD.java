public class MATADD {
    public static void main(String args[])
    {
        int i,j;
        int mat1[][]={{1,2,3,},{4,5,6},{7,8,9}};
        int mat2[][]={{11,12,13,},{14,15,16},{17,18,19}};
        int mat3[][]=new int[3][3];
        System.out.println("The matrix is :-");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                mat3[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
