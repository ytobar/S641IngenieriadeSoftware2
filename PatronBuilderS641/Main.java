// Clase principal del programa
// Sirve para probar el funcionamiento de los diferentes convertidores
public class Main {
    public static void main(String[] args) {

        // ---------------- Probar con ASCIIConverter ----------------
        // Crear un convertidor ASCII
        Converter ascii = new ASCIIConverter();

        // Procesar elementos con el convertidor ASCII
        Reader reader1 = new Reader("LINE", ascii);     // Línea en ASCII
        reader1.parseInput();

        Reader reader2 = new Reader("PRAGRAPH", ascii); // Párrafo en ASCII
        reader2.parseInput();

        Reader reader3 = new Reader("TABLE", ascii);    // Tabla en ASCII
        reader3.parseInput();

        System.out.println("----------------------------");

        // ---------------- Probar con PDFConverter ----------------
        // Crear un convertidor PDF
        Converter pdf = new PDFConverter();

        // Procesar elementos con el convertidor PDF
        Reader reader4 = new Reader("LINE", pdf);       // Línea en PDF
        reader4.parseInput();

        Reader reader5 = new Reader("PRAGRAPH", pdf);   // Párrafo en PDF
        reader5.parseInput();

        Reader reader6 = new Reader("TABLE", pdf);      // Tabla en PDF
        reader6.parseInput();

        System.out.println("----------------------------");

        // ---------------- Probar con PostScriptConverter ----------------
        // Crear un convertidor PostScript
        Converter post = new PostScriptConverter();

        // Procesar elementos con el convertidor PostScript
        Reader reader7 = new Reader("LINE", post);      // Línea en PostScript
        reader7.parseInput();

        Reader reader8 = new Reader("PRAGRAPH", post);  // Párrafo en PostScript
        reader8.parseInput();

        Reader reader9 = new Reader("TABLE", post);     // Tabla en PostScript
        reader9.parseInput();
    }
}
