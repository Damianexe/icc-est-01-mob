public class Metodos {

    /*
     * public Metodos(){
     * System.out.println("Se creo la clase metodos");
     * }
     */

    // Metodo de ordenacion Ascendente

    public int[] sortbyBubble(int[] arreglo) {

        int tamanio = arreglo.length;

        for (int i = 0; i < tamanio; i++) {
            for (int j = i + 1; j < tamanio; j++) {
                if (arreglo[i] > arreglo[j]) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;

                }

            }
        }

        return arreglo;
    }

    // for - each (metodo mas corto de for)
    public void printArreglo(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
    }
    // Metodo de ordenacion Descendente

    public int[] sortbyBubbleDes(int[] arreglo) {

        int tamanio = arreglo.length;

        for (int i = 0; i < tamanio; i++) {
            for (int j = i + 1; j < tamanio; j++) {
                if (arreglo[i] < arreglo[j]) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;

                }

            }
        }

        return arreglo;
    }


    // Metodo de Ordenacion por palabras

    public String[] sortbyBubblePalabras(String[] palabras) {

        int tamanio = palabras.length;

        for (int i = 0; i < tamanio; i++) {
            for (int j = i + 1; j < tamanio; j++) {
                if (palabras[i].compareToIgnoreCase(palabras[j]) > 0) {
                    String aux = palabras[i];
                    palabras[i] = palabras[j];
                    palabras[j] = aux;

                }

            }
        }

        return palabras;
    }

    public void printpalabrasOrdenadas(String[] arreglo) {
        for (String elemento : arreglo) {
            System.out.println(elemento);
        }
    }

}
