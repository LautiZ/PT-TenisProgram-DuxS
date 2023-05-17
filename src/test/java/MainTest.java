import com.tenis.Main;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MainTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @org.junit.Test
    public void testPartidoGanaJ1() {
        int probabilidad = 101; // J1 tiene 101% de probabilidad de ganar
        int cantidadSets = 3;
        String nombreJ1 = "Roger Federer";
        String nombreJ2 = "Rafael Nadal";

        // Redirigir la salida estándar
        System.setOut(new PrintStream(outContent));

        // Ejecutar el partido
        Main.partido(probabilidad, cantidadSets, nombreJ1, nombreJ2);

        // Obtener todas las salidas por consola
        String resultadoObtenido = outContent.toString().trim();

        // Normalizar separadores de línea
        resultadoObtenido = normalizeLineSeparators(resultadoObtenido);

        // Verificar que el ganador sea J1
        String resultadoEsperado = "Punto para el J1!\n" +
                "Marcador: 15 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 30 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 40 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 50 - 0\n" +
                "==== JUEGO PARA J1 ====\n" +
                "Punto para el J1!\n" +
                "Marcador: 15 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 30 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 40 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 50 - 0\n" +
                "==== JUEGO PARA J1 ====\n" +
                "Punto para el J1!\n" +
                "Marcador: 15 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 30 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 40 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 50 - 0\n" +
                "==== JUEGO PARA J1 ====\n" +
                "Punto para el J1!\n" +
                "Marcador: 15 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 30 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 40 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 50 - 0\n" +
                "==== JUEGO PARA J1 ====\n" +
                "Punto para el J1!\n" +
                "Marcador: 15 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 30 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 40 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 50 - 0\n" +
                "==== JUEGO PARA J1 ====\n" +
                "Punto para el J1!\n" +
                "Marcador: 15 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 30 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 40 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 50 - 0\n" +
                "==== JUEGO PARA J1 ====\n" +
                "Punto para el J1!\n" +
                "Marcador: 15 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 30 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 40 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 50 - 0\n" +
                "==== JUEGO PARA J1 ====\n" +
                "Punto para el J1!\n" +
                "Marcador: 15 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 30 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 40 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 50 - 0\n" +
                "==== JUEGO PARA J1 ====\n" +
                "Punto para el J1!\n" +
                "Marcador: 15 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 30 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 40 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 50 - 0\n" +
                "==== JUEGO PARA J1 ====\n" +
                "Punto para el J1!\n" +
                "Marcador: 15 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 30 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 40 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 50 - 0\n" +
                "==== JUEGO PARA J1 ====\n" +
                "Punto para el J1!\n" +
                "Marcador: 15 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 30 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 40 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 50 - 0\n" +
                "==== JUEGO PARA J1 ====\n" +
                "Punto para el J1!\n" +
                "Marcador: 15 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 30 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 40 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 50 - 0\n" +
                "==== JUEGO PARA J1 ====\n" +
                "Punto para el J1!\n" +
                "Marcador: 15 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 30 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 40 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 50 - 0\n" +
                "==== JUEGO PARA J1 ====\n" +
                "Punto para el J1!\n" +
                "Marcador: 15 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 30 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 40 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 50 - 0\n" +
                "==== JUEGO PARA J1 ====\n" +
                "Punto para el J1!\n" +
                "Marcador: 15 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 30 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 40 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 50 - 0\n" +
                "==== JUEGO PARA J1 ====\n" +
                "Punto para el J1!\n" +
                "Marcador: 15 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 30 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 40 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 50 - 0\n" +
                "==== JUEGO PARA J1 ====\n" +
                "Punto para el J1!\n" +
                "Marcador: 15 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 30 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 40 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 50 - 0\n" +
                "==== JUEGO PARA J1 ====\n" +
                "Punto para el J1!\n" +
                "Marcador: 15 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 30 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 40 - 0\n" +
                "Punto para el J1!\n" +
                "Marcador: 50 - 0\n" +
                "==== JUEGO PARA J1 ====\n" +
                "6 - 0\n" +
                "6 - 0\n" +
                "6 - 0\n" +
                "El ganador es Roger Federer con: 3 sets ganados";

        resultadoEsperado = normalizeLineSeparators(resultadoEsperado);

        assertEquals(resultadoEsperado, resultadoObtenido);

        // Restaurar System.out
        System.setOut(originalOut);
    }

    @org.junit.Test
    public void testPartidoGanaJ2() {
        int probabilidad = 0; // J1 tiene 0% de probabilidad de ganar
        int cantidadSets = 3;
        String nombreJ1 = "Roger Federer";
        String nombreJ2 = "Rafael Nadal";

        // Redirigir la salida estándar
        System.setOut(new PrintStream(outContent));

        // Ejecutar el partido
        Main.partido(probabilidad, cantidadSets, nombreJ1, nombreJ2);

        // Obtener todas las salidas por consola
        String resultadoObtenido = outContent.toString().trim();

        // Normalizar separadores de línea
        resultadoObtenido = normalizeLineSeparators(resultadoObtenido);

        // Verificar que el ganador sea J1
        String resultadoEsperado = "Punto para el J2!\n" +
                "Marcador: 0 - 15\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 30\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 40\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 50\n" +
                "==== JUEGO PARA J2 ====\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 15\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 30\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 40\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 50\n" +
                "==== JUEGO PARA J2 ====\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 15\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 30\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 40\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 50\n" +
                "==== JUEGO PARA J2 ====\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 15\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 30\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 40\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 50\n" +
                "==== JUEGO PARA J2 ====\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 15\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 30\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 40\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 50\n" +
                "==== JUEGO PARA J2 ====\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 15\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 30\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 40\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 50\n" +
                "==== JUEGO PARA J2 ====\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 15\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 30\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 40\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 50\n" +
                "==== JUEGO PARA J2 ====\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 15\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 30\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 40\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 50\n" +
                "==== JUEGO PARA J2 ====\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 15\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 30\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 40\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 50\n" +
                "==== JUEGO PARA J2 ====\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 15\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 30\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 40\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 50\n" +
                "==== JUEGO PARA J2 ====\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 15\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 30\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 40\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 50\n" +
                "==== JUEGO PARA J2 ====\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 15\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 30\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 40\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 50\n" +
                "==== JUEGO PARA J2 ====\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 15\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 30\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 40\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 50\n" +
                "==== JUEGO PARA J2 ====\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 15\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 30\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 40\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 50\n" +
                "==== JUEGO PARA J2 ====\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 15\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 30\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 40\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 50\n" +
                "==== JUEGO PARA J2 ====\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 15\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 30\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 40\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 50\n" +
                "==== JUEGO PARA J2 ====\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 15\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 30\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 40\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 50\n" +
                "==== JUEGO PARA J2 ====\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 15\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 30\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 40\n" +
                "Punto para el J2!\n" +
                "Marcador: 0 - 50\n" +
                "==== JUEGO PARA J2 ====\n" +
                "0 - 6\n" +
                "0 - 6\n" +
                "0 - 6\n" +
                "El ganador es Rafael Nadal con: 3 sets ganados";

        resultadoEsperado = normalizeLineSeparators(resultadoEsperado);

        assertEquals(resultadoEsperado, resultadoObtenido);

        // Restaurar System.out
        System.setOut(originalOut);
    }

    @org.junit.Test
    public void testPartidoConTieBreak() {
        int probabilidad = 100; // J1 tiene 100% de probabilidad de ganar cada punto

        // Juegos iguales para forzar el tieBreak
        int juegosJ1 = 6;
        int juegosJ2 = 6;

        // cantidad de sets para que funcione correctamente la funcion tieBreak
        int setJ1 = 0;
        int setJ2 = 0;


        // Redirigir la salida estándar
        System.setOut(new PrintStream(outContent));

        // Ejecutar el partido
        String tiebreak = Main.tieBreak(probabilidad, juegosJ1, juegosJ2, setJ1, setJ2);

        // Obtener todas las salidas por consola
        String resultadoObtenido = tiebreak.trim();

        // Normalizar separadores de línea
        resultadoObtenido = normalizeLineSeparators(resultadoObtenido);

        // Verificar que el resultado incluya un tie-break
        String resultadoEsperado = "7 - 6 (0)";

        resultadoEsperado = normalizeLineSeparators(resultadoEsperado);

        // Verificar que el resultado incluya un tie-break
        boolean contieneTieBreak = resultadoObtenido.contains(" (0)");

        assertEquals(resultadoEsperado, resultadoObtenido);
        assertTrue(contieneTieBreak);

        // Restaurar System.out
        System.setOut(originalOut);
    }

    private String normalizeLineSeparators(String input) {
        return input.replaceAll("\r\n", "\n").replaceAll("\r", "\n");
    }
}
