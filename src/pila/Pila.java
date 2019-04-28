// autor @valerio Pelicó Guox
//0901-16-11957  
import java.util.Scanner;
import javax.swing.JOptionPane;
//creamos la clase pila
public class Pila
{   //encapsulamos los elementos
    private int tope,maximo;
    private String pila[];
    //creamos el constructor que tiene un parametro que es el maximo de la pila
    public Pila(int m)

    {
        maximo=m;
        pila=new String[maximo];
        tope=0; 
    }

    //Metodo para agregar un elemento a la´pila
    private void Agregar_elemento(String n)
    {
        //si tope es menor al maximo que puede tener la pila
        if(tope<maximo)
        {
            //el tope de la pila es igual al parametro seleccionado y se incrementa el tope
            pila[tope]=n;
            tope++;
            System.out.println("se ha agregado un dato con exito!!!!!");
        }
        else
        {
            System.out.println("pila llena");
        }
    }
     //Metodo que elimina un dato de la pila
    private void Eliminar()
    {
        //si la pila no esta vacia
        if(tope>0)
        {//dejamos fuera al ultimo elemento de la pila
            tope--;
            System.out.println("+++++Dato eliminado+++++");
        }
        else
        {
            System.out.println("+++++Ya no hay datos para eliminar+++++");
        }
    }
     //Metodo que muestra los datos del ultimo al primero
    private void Mostrar()
    {
        //si la lista no esta vacia
        if(!Vacia())
        {//for que desde el tamaño de la pila a 0 se va decrementando para ir mostrando los datos
            for(int a=(tope-1);a>=0;a--)
            {//se muestran los elemntos en pantalla
                System.out.println(pila[a]);
            }
        }
        else 
            System.out.println("+++++Pila vacia+++++");
    }
    //metodo para buscar un dato en la pila
    private boolean Buscar(String dato)
    {//cramos una variable booleana
        boolean encontrado=false;
        //si la pila no esta vacia
        if(!Vacia())
        {//for que desde el tamaño de la pila a 0 se va decrementando para ir mostrando los datos
            for(int a=(tope-1);a>=0;a--)
            {//si hay un elemento en la pila igual al dato que el usuario uso lo muestra en pantalla
                if(pila[a].equals(dato)) encontrado=true;
            }
        }
        else 
            System.out.println("No hay datos para buscar en la pila");
        return encontrado;
    }
    //Checar si esta vacia
    private boolean Vacia()
    {//si la pila no tiene datos esta vacia
        if(pila==null) return true;
        else return false;
    }
    
    //se crea el main principal
    public static void main(String arg[])
    {
        int intTamaño,opcion;
        String dato;
        Scanner teclado=new Scanner(System.in);
        JOptionPane.showMessageDialog(null,"Bienvenido\n"+"Programa de pilas");
        System.out.println("ingrese el Tamaño de la pila: ");
        intTamaño=teclado.nextInt();
        Pila pila=new Pila(intTamaño);
        //creamos switch para que ejecute el menu mientras el usuario no ingrese el numero 5
       
          do
        {   System.out.println("Que desea hacer? ");
            System.out.println("1. Agregar dato");
            System.out.println("2. Eliminar dato");
            System.out.println("3. Mostrar datos");
            System.out.println("4. Buscar dato");
            System.out.println("5. Salir");
            
            
            opcion=teclado.nextInt();
            switch(opcion)
            {
                case 1:
                    for(int i = 0; i<intTamaño; i++){
                    System.out.println("Escriba un dato: ");
                    dato=teclado.next();
                    pila.Agregar_elemento(dato);
                    }
                    break;
                case 2:
                    pila.Eliminar();
                    break;
                case 3:
                    pila.Mostrar();
                    break;
                case 4:
                    System.out.println("Dato a buscar: ");
                    dato=teclado.next();
                    if(pila.Buscar(dato)) System.out.println("+++++Dato encontrado+++++");
                    else
                        System.out.println("+++++Dato no encontrado+++++");
                    break;
            }
        }while(opcion!=5);
    }}
