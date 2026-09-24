package objetos.ej01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NotaTests {

  @Test
  public void creacionNota() {
    Nota nota = new Nota(-1);
    
    assertNotNull(nota);
    //assertEquals(7, nota.obtenerValor());
  }

  @Test
  public void notaAprobada() {
    Nota nota = new Nota(7);
    assertTrue(nota.aprobado());
  }

  @Test
  public void notaDesaprobada() {
    Nota nota = new Nota(2);
    assertTrue(nota.desaprobado());
  }

  @Test
  public void recuperarNota() {
    Nota nota = new Nota(2);
    assertTrue(nota.desaprobado());
    
    nota.recuperar(6);
    assertTrue(nota.aprobado());
    assertEquals(6, nota.obtenerValor());
  }
}