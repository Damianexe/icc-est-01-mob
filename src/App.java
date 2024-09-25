public class App {
    public static void main(String[] args) throws Exception {
        Metodos metodosBubble = new Metodos();
        // Arreglo que se ordenará
        int[] arreglo = { 5, 7, 30, 12, 9 };

        // Ejecucion del Arreglo en forma Ascendente
        int[] arregloOrdenadoAs = metodosBubble.sortbyBubble(arreglo);
        System.out.print("Arreglo Ascendente: ");
        metodosBubble.printArreglo(arregloOrdenadoAs);

        // Ejecucion del Arreglo en forma Descendente

        int[] arregloOrdenadoDes = metodosBubble.sortbyBubbleDes(arreglo);
        System.out.print("\nArreglo Descendente: ");
        metodosBubble.printArreglo(arregloOrdenadoDes);

        // ORDENAR PALABRAS ALFABETICAMENTE
        String cadena = "este es ejemplo de texto para ordenar";
        String[] palabras = cadena.split(" ");

        String[] palabrasOrdenadas = metodosBubble.sortbyBubblePalabras(palabras);

        System.out.println("\nPALABRAS ORDENADAS ALFABETICAMENTE: ");
        metodosBubble.printpalabrasOrdenadas(palabrasOrdenadas);
    }
}
