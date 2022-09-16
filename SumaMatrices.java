package ejercicio02;

public class SumaMatrices
{
    public int matriz01[][];
    public int matriz02[][];
    public int sumaMatriz[][];
    public  int filas;
    public  int columnas;
    public int m;
    public int n;

    public SumaMatrices(int[][] matriz01, int[][] matriz02, int[][] sumaMatriz, int filas, int columnas)
    {
        this.matriz01 = matriz01;
        this.matriz02 = matriz02;
        this.sumaMatriz = sumaMatriz;
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

    public void setSumaMatriz(int[][] sumaMatriz)
    {
        sumaMatriz = sumaMatriz;
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
            for(n=0; n<getColumnas(); n++)
            {
                System.out.print(matriz01[m][n]);
            }
        }
        for(m=0; m<getFilas(); m++)
        {
            for(n=0; n<getColumnas(); n++)
            {
                System.out.print(matriz02[m][n]);
            }
        }
    }
    public void sumarMatrices()
    {
        for(m=0; m<getFilas(); m++)
        {
            for(n=0; n<getColumnas(); n++)
            {
                sumaMatriz[m][n] = matriz01[m][n] + matriz02[m][n];
            }
        }
        for(m=0; m<getFilas(); m++)
        {
            for(n=0; n<getColumnas(); n++)
            {
                System.out.print(sumaMatriz[m][n]);
            }
        }
    }
}

