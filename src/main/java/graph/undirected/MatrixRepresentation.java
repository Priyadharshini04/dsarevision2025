package graph.undirected;

public class MatrixRepresentation {
    // Space Complexity: O(V*V)
    // TC: update O(1) , edge checking O(1) , edges for particular node O(V)
    // Edge add /delete : O(1) , Addition / Deletion Vertex: O(V*V)
    // Building representation matrix: O(V*V)
    public void printMatrixRepresentation(int[][] edges,int v)
    {
        int[][] matrixRep=new int[v][v];
        for(int i=0;i<edges.length;i++)
        {
            int node1=edges[i][0];
            int node2=edges[i][1];
            matrixRep[node1][node2]=1;
            matrixRep[node2][node1]=1;
        }
        printMatrix(matrixRep);
    }
    void printMatrix(int[][] matrixRep)
    {
        for(int i=0;i<matrixRep.length;i++)
        {
            System.out.print(i+" ==> ");
            for(int j=0;j<matrixRep[i].length;j++)
            {
                System.out.print(matrixRep[i][j]);
            }
            System.out.println();
        }
    }
}
