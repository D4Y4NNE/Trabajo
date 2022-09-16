package ejercicio02;

public class MultiplicacionMatrices
{
    public int matriz01[][] = {{1,2},{3,4}};
    public int matriz02[][]= {{5,6},{7,8}};
    public int multiplicacionMatriz[][]= {{0,0},{0,0}};
    public  int filas;
    public  int columnas;

    public int m;

    public int n;

    public MultiplicacionMatrices(int[][] matriz01, int[][] matriz02, int[][] multiplicacionMatriz, int filas, int columnas) {
        this.matriz01 = matriz01;
        this.matriz02 = matriz02;
        this.multiplicacionMatriz = multiplicacionMatriz;
        this.filas = filas;
        this.columnas = columnas;
    }

    public void setMatriz01(int[][] matrizUno)
    {
        matriz01 = matrizUno;
    }
    public void setMatriz02(int[][] matrizDos)
    {
        matriz02 = matrizDos;
    }
    public void setMultiplicacionMatriz(int[][] multiMatriz)
    {
        multiplicacionMatriz = multiMatriz;
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
        for(m=0; m<getFilas();m++)
        {
            for(n=0; n<getColumnas(); n++)
            {
                System.out.print(matriz01[m][n]);
            }
            System.out.println();
        }
        for(m=0; m<getFilas(); m++)
        {
            for(n=0; n<getColumnas(); n++)
            {
                System.out.print(matriz02[m][n]);
            }
        }
    }
    public void multiplicacionMatriz()
    {
        for(m=0; m<getFilas(); m++)
        {
            for(n=0; n<getColumnas(); n++)
            {
                multiplicacionMatriz[m][n] = matriz01[m][n]*matriz02[m][n];
            }
        }
        for(m=0; m<getFilas(); m++)
        {
            for(n=0; n<getColumnas(); n++)
            {
                System.out.print(multiplicacionMatriz[m][n]);
            }
        }
    }
}