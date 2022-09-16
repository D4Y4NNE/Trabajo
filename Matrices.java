package ejercicio02;

public class Matrices
{
    public int matriz[][];
    public int filas;
    public int columnas;
    public int m;
    public int n;

    public Matrices(int[][] numMatriz, int numFilas, int numColumnas) {
        matriz = numMatriz;
        filas = numFilas;
        columnas = numColumnas;
    }

    public void setMatriz(int[][] numMatriz)
    {
        matriz = numMatriz;
    }
    public void setFilas(int numFilas)
    {
        filas = numFilas;
    }
    public int getFilas()
    {
        return filas;
    }
    public void setColumnas(int numColumnas)
    {
        columnas = numColumnas;
    }
    public int getColumnas()
    {
        return columnas;
    }

    public void mostrarMatriz()
    {
        for(m=0; m<getFilas(); m++)
        {
            for (n=0; n<getColumnas(); n++)
            {
                matriz[m][n]=(int)(Math.random()*(10-1)+1);
            }
        }
        for (m=0; m<getFilas(); m++)
        {
            for (n=0; n<getColumnas(); n++)
            {
                System.out.println(matriz[m][n]);
            }
        }
    }
}
