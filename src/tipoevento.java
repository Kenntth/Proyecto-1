/**
 * Clase "tipoevento" de tipo enum ayuda a la verificacion de los datos
 */
public enum tipoevento {
    creado,
    asignar,
    mover,
    solucion;

public void mostrarevento(){
  tipoevento[] listaevento=tipoevento.values();
  for (int i =0; i< listaevento.length; i++){
      System.out.println((i+1)+")"+listaevento[i]);
  }
    }


}
