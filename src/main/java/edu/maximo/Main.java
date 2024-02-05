package edu.maximo;

public class Main {
    public static int[] sortArray(int[] array) {
        // Extraer impares y contar cuántos hay
        int countOdd = 0;
        for (int j : array) {
            if (j % 2 != 0) countOdd++;
        }
        int[] oddNumbers = new int[countOdd];
        int index = 0;
        for (int j : array) {
            if (j % 2 != 0) oddNumbers[index++] = j;
        }

        // Ordenar los impares con el método de burbuja
        for (int i = 0; i < countOdd - 1; i++) {
            for (int j = 0; j < countOdd - i - 1; j++) {
                if (oddNumbers[j] > oddNumbers[j + 1]) {
                    // Intercambiar
                    int temp = oddNumbers[j];
                    oddNumbers[j] = oddNumbers[j + 1];
                    oddNumbers[j + 1] = temp;
                }
            }
        }

        // Reemplazar los impares en el array original
        index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = oddNumbers[index++];
            }
        }

        return array;
    }
}