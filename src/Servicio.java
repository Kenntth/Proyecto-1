import java.util.ArrayList;
import java.util.Scanner;

/**
 * Se solicita un programa que efectue la creacion de tickets de atencion de problemas en una cola para ser resueltos
 * Datos de entrada:NIT, problema, fecha, mensaje
 * Datos de salida: La informacion de cambio de estado de los datos
 * Datos extras:Arreglo de lista, enum
 * Siendo clase servicio como la clase principal del programa
 * @autor:Kenneth Alexander Marroquin Abal/7690-21-3512
 */
public class Servicio {

    /**
     *metodo main contiene toda la base de nuestro programa efectuado
     * @param args
     */
    public static void main(String[] args) {
        int opcion, opcion2;
      Scanner leer =new Scanner(System.in);//lector de variables

      do {//ciclo para matener el menu abierto hasta tomar la decision de cerrar
          System.out.println("______Bienvenido al sistema de cola de ticket______"+//menu
                  "\n __Escoja la opcion que desea realizar__"+
                  "\n1-Crear ticket"+
                  "\n2-Trabajar ticket"+
                  "\n3-Reporte"+
                  "\n4-salir");
          opcion=leer.nextInt();
          switch(opcion){//acciones de nuestro menu


              case 1://aqui se realiza las acciones de uestro opcion numero1
                  String nit,pro,est;
                  int ide;
                  ticket nuevoticket=new ticket();
                  System.out.println("ingrese su numero de nit");
                 nit= leer.nextLine();
                 nuevoticket.setNit(nit);
                  System.out.println("ingrese el inconveniente que tiene");
                  pro= leer.nextLine();
                  nuevoticket.setProblema(pro);

                  System.out.println(nuevoticket.toString());
                  System.out.println("ticket añadido a la cola");
                  break;


                case 2://aqui se realiza las acciones de uestro opcion numero2
                    String nite, fe;
                    int asig;
                    bitacora bita=new bitacora();

                  System.out.println("ingrese su numero de NIT");
                  nite= leer.nextLine();
                  bita.setNitsoporte(nite);

                  System.out.println("ingrese la fecha actual dd/mm/yy");
                  fe= leer.nextLine();
                  bita.setFecha(fe);
                    System.out.println(bita.toString());




                  System.out.println("\n1-solicitar asignacion de ticket (ingrese el numero 1 para su asignacion)");
                  asig=leer.nextInt();



                  System.out.println("___INGRESE LA OPCION QUE DESEA REALIZAR___"+//submenu
                          "\n1-escalar ticket"+
                          "\n2-solucionar ticket");
                  opcion2= leer.nextInt();
                    switch (opcion2){//Acciones de nuestro submenu
                   case 1://aqui se realiza las acciones de uestro opcion numero1
                    System.out.println("ticket movido a siguiente cola");


                    break;
                   case 2://aqui se realiza las acciones de uestro opcion numero2
                     System.out.println("ticket solucionado");break;
}
                break;
              case 3://aqui se realiza las acciones de uestro opcion numero3
                  System.out.println("bitacora..............................");

              break;
              case 4://aqui se realiza las acciones de uestro opcion numero4
                  System.out.println("---GRACIAS POR USAR EL SISTEMA----");
              break;
          }

      }while(opcion!=4);




    }
}
