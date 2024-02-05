# Sort the odd
- https://www.codewars.com/kata/578aa45ee9fd15ff4600090d/java

## Análisis paso a paso del problema

### 1. Extraer y contar impares: Recorremos el array original dos veces. La primera para contar los impares y la segunda para llenar un nuevo array con ellos.
### 2. Aplicamos la ordenación por el método de la burbuja: Utilizamos el algoritmo de burbuja para ordenar el array que contiene solo los números impares.
### 3. Reemplamos los impares ordenados: Finalmente, recorremos nuevamente el array original y reemplazamos los números impares por los ordenados en el paso anterior.

## Pseudocódigo

        funtion int[] sortArray(int[] array) {
        // Extraer impares y contar cuántos hay
        int countOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) countOdd++;
        }
        
        int[] oddNumbers = new int[countOdd];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) oddNumbers[index++] = array[i];
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
