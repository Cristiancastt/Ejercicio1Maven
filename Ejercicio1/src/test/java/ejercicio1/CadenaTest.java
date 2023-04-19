package ejercicio1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.cuatrovientos.ed.Cadena;
import org.junit.jupiter.api.Test;

public class CadenaTest {

  @Test
  public void testLongitud() {
    Cadena c = new Cadena();
    assertEquals(4, c.longitud("Hola"));
    assertEquals(0, c.longitud(""));
  }

  @Test
  public void testVocales() {
    Cadena c = new Cadena();
    assertEquals(2, c.vocales("Hola"));
    assertEquals(0, c.vocales(""));
  }

  @Test
  public void testInvertir() {
    Cadena c = new Cadena();
    assertEquals("aloH", c.invertir("Hola"));
    assertEquals("", c.invertir(""));
  }

  @Test
  public void testContarLetra() {
    Cadena c = new Cadena();
    assertEquals(1, c.contarLetra("Hola", 'o'));
    assertEquals(0, c.contarLetra("", 'o'));
  }

}

