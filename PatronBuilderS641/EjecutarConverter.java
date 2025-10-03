// Clase principal del programa
// Sirve para probar el funcionamiento de los diferentes convertidores

public class EjecutarConverter {
    public static void main(String[] args) {
        
        //Creación de los objetos de tipo Converter
        Converter objASCII = new ASCIIConverter();
        Converter objPostScript = new PostScriptConverter();
        Converter objPDF = new PDFConverter();

        //Creación de los objetos de tipo Lector
        Reader objLector1 = new Reader("LINE", objASCII);
        Reader objLector2 = new Reader("TABLE", objPDF);
        Reader objLector3 = new Reader("PARAGRAPH", objPostScript);

        objLector1.parseInput();
        objLector2.parseInput();
        objLector3.parseInput();




    }
}