public class App {
    public static void main(String[] args) throws Exception {
        Metodos metodosBubble = new Metodos();

        int[] arreglo={5,7,30,12,9};

        int[] arregloOrdenadoAs=metodosBubble.sortbyBubble(arreglo);
        metodosBubble.printArreglo(arregloOrdenadoAs);
        int[] arregloOrdenadoDes= metodosBubble.sortbyBubbleDes(arreglo);
        metodosBubble.printArreglo(arregloOrdenadoDes);

        // ORDENAR PALABRAS ALFABETICAMENTE
        String cadena=" este es ejemplo de texto para ordenar";
        String[] palabras=cadena.split(" ");
        String[] palabrasOrdenadas=metodosBubble.sortbyBubblePalabras(palabras);
        
    }

}
