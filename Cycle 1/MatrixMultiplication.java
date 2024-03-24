import java.util.*;
class MatrixMultiplication{
    public static void main(String[] args) {
        int i,j;
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the Size of the First matrix (rows,cols): ");
        int r1 = s.nextInt();
        int c1 = s.nextInt();
        System.out.println("Enter the Size of the Second matrix (rows,cols): ");
        int r2 = s.nextInt();
        int c2 = s.nextInt();
        if(c1!=r2){
            System.out.println("The sizr of the Matrices are not multiplication compatable");
            System.exit(0);
        }
        int M1[][]= new int[r1][c1],M2[][]= new int[r2][c2],Mproduct[][]= new int[r1][c2];

        System.out.println("Enter the first matrix : ");
        for(i=0;i<r1;i++){
            for(j=0;j<c1;j++)
            {
                System.out.print("Enter the value of M1["+i+"]["+j+"] : ");
                M1[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter the Second matrix : ");
        for(i=0;i<r2;i++){
            for(j=0;j<c2;j++)
            {
                System.out.print("Enter the value of M2["+i+"]["+j+"] : ");
                M2[i][j]=s.nextInt();
            }
        }
        System.out.print("First ");
        dispMatrix(M1,r1,c1);
        System.out.print("Second ");
        dispMatrix(M2,r2,c2);
        Mproduct=mulMatrix(M1, r1, c1, M2, r2, c2);
        System.out.print("The Product ");
        dispMatrix(Mproduct, r1, c2);
    }
    public static void dispMatrix(int[][] M,int r,int c){
        int i,j;
        System.out.println("Matrix : ");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++)
            {
                System.out.print(M[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    public static int[][] mulMatrix(int[][] M1,int r1, int c1, int[][] M2, int r2,int c2){
        int[][] Mul=new int[r1][c2];
        int i,j,k;
        for(i=0;i<r1;i++){
            for(j=0;j<c2;j++){
                Mul[i][j]=0;
                for(k=0;k<c1;k++)
                Mul[i][j]=Mul[i][j]+M1[i][k]*M2[k][j];
            }
        }
        return Mul;
    }
}