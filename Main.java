package ejercicio02;

public class Main
{
    public static void main(String[] args)
    {

        int numBase[][] = {{0, 0, 0}, {0, 0, 0}};
        Matrices sumaMatriz = new Matrices(numBase, 2, 3);
        int matriz1[][] = {{1, 2}, {3, 4}};
        int matriz2[][] = {{5, 6}, {7, 8}};

        SumaMatrices sumaMatrices = new SumaMatrices(matriz1, matriz2, numBase, 2, 2);
        MultiplicacionMatrices multiplicacionMatrices = new MultiplicacionMatrices(matriz1, matriz2, numBase, 2, 2);
        {
            sumaMatriz.setColumnas(3);
            sumaMatriz.setFilas(2);
            sumaMatriz.setMatriz(numBase);

            System.out.println(" Matriz ");
            sumaMatrices.mostrarMatriz();
        }

        {
            sumaMatrices.setColumnas(2);
            sumaMatrices.setFilas(2);
            sumaMatrices.setMatriz01(matriz1);
            sumaMatrices.setMatriz02(matriz2);
            sumaMatrices.setSumaMatriz(numBase);

            System.out.println(" Suma de Matrices ");

            sumaMatrices.mostrarMatriz();
            sumaMatrices.sumarMatrices();
        }

        {
            multiplicacionMatrices.setColumnas(2);
            multiplicacionMatrices.setFilas(2);
            multiplicacionMatrices.setMatriz01(matriz1);
            multiplicacionMatrices.setMatriz02(matriz2);
            multiplicacionMatrices.setMultiplicacionMatriz(numBase);

            System.out.println(" Multiplicacion de Matrices ");
            multiplicacionMatrices.mostrarMatriz();
            multiplicacionMatrices.multiplicacionMatriz();
        }
    }
}
