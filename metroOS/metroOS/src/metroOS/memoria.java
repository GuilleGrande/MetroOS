/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metroOS;

import static java.lang.Math.floor;
import java.util.ArrayList;
import java.util.Formatter;

/**
 *
 * @author Vin
 */
public class memoria 
{
    private int size;
    private boolean[] marco;
    private int[] idProceso;
    private int[] idPagina;
    private int sizePage;

    public memoria(int size, int tamPag) 
    {
        this.size = size;
        int aux = size/tamPag;
        this.marco = new boolean[aux];
        this.idProceso = new int[aux];
        this.idPagina = new int[aux];
        for (int i = 0; i < aux; i++) 
        {
            marco[i] = false;
        }
        this.sizePage = tamPag;
    }

    public int getSize() 
    {
        return size;
    }

    public void setSize(int size) 
    {
        this.size = size;
    }

    public boolean[] getMarco() 
    {
        return marco;
    }

    public void setMarco(boolean[] marco) 
    {
        this.marco = marco;
    }

    public int[] getIdProceso() 
    {
        return idProceso;
    }

    public int[] getIdPaginas() 
    {
        return idPagina;
    }
    
    public void setIdPaginas(int[] idPagina) 
    {
        this.idPagina = idPagina;
    }
    
    public void imprimirPosicion(int i)
    {
        System.out.print("    ["+cero(i)+i+"]");
    }
    
    public void imprimirDesplazamiento(int posicion)
    {  
        Formatter formateador = new Formatter();
        formateador.format("%06d", sizePage * (posicion+1));
        System.out.print("["+formateador+"]");
        formateador.format("0", 0);
      
    }
    
    public void imprimirIdProceso(int i, int id)
    {
        if (!marco[i])
        {
            System.out.print("  [P  ."); 
        }
        else
        {
            System.out.print("  [P"+cero(id)+""+this.idProceso[i]+".");   
        }
    }
    
    public void imprimirIDPagina(int posicion)
    {   
        if (!marco[posicion])
        {
            System.out.print("  ]  "); 
        }
        else
        {
            System.out.print(cero(idPagina[posicion])+""+this.idPagina[posicion]+"]  ");  
            
        } 
    }
    
    public void imprimirMarco(int posicion)
    {
        if (marco[posicion])
        {
            System.out.print("["+marco[posicion]+" ]");
        }
        else
        {
           System.out.print("["+marco[posicion]+"]"); 
        }
         
    }
    
    public void imprimirMemoria(int i, int id)
    {
        this.imprimirPosicion(i);
        this.imprimirDesplazamiento(i);
        this.imprimirIdProceso(i, id);
        this.imprimirIDPagina(i);
        this.imprimirMarco(i);
    }
    
    public int marcosDisponibles()
    {
        int cont = 0;
        for (int i = 0; i < marco.length; i++) 
        {
            if (!marco[i])
            {
                cont ++;
            }
        }
        return cont;
    }
    
    public int marcosUsados()
    {
        int cont = 0;
        for (int i = 0; i < marco.length; i++) 
        {
            if (marco[i])
            {
                cont ++;
            }
        }
        return cont;
    }
    
    public boolean validadorAccesoMemoriaP(int numPagP)
    {
        int n = numPagP / 2 + ((numPagP % 2 == 0) ? 0 : 1);
        if (marcosDisponibles() >= n) 
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public int agregarPaginasPrincipal(int id, int pagAgregar)
    {
        int pag = 0;
        for (int i = 0; i < marco.length; i++) 
        {
            if (!marco[i])
            {   
                idProceso[i] = id;
                idPagina[i] = pag;
                marco[i] = true;
                pag ++;
            }
            if (pag == pagAgregar)
            {
                i = marco.length;
            }
        }
        return pag;
    }
    
    public boolean agregarPaginasSecundariaDesdePrincipal(int id, int incio, int parada)
    {
        int pag = incio;
        for (int i = 0; i < marco.length; i++) 
        {
            if (!marco[i])
            {   
                idProceso[i] = id;
                idPagina[i] = pag;
                marco[i] = true;
                pag ++;
            }
            if (pag == parada)
            {
                return false;
            }
        }
        return true;
    }
        
    public int agregarPaginasSecundaria(int id, int pagAgregar)
    {
        int pag = 0;
        for (int i = 0; i < marco.length; i++) 
        {
            if (!marco[i])
            {   
                idProceso[i] = id;
                idPagina[i] = pag;
                marco[i] = true;
                pag ++;
            }
            if (pag == pagAgregar)
            {
                return pag;
            }
        }
        return pag;
    }
    
    public int agregarPaginasSecundariaSuspender(int id, int pagAgregar, ArrayList idPaginasAgregar)
    {
        int cont = 0;
        for (int i = 0; i < marco.length; i++) 
        {
            if (!marco[i])
            {   
                idProceso[i] = id;
                idPagina[i] = (int) idPaginasAgregar.get(0);
                idPaginasAgregar.remove(0);
                marco[i] = true;
                cont ++;
            }
            if (cont == pagAgregar)
            {
                return cont;
            }
        }
        return cont;
    }
    
    public ArrayList limpiarPaginas(int idProcesoEliminado)
    {
        ArrayList<Integer> idProcesosEliminados = new ArrayList<Integer>();
        for (int i = 0; i < marco.length; i++) 
        {
            if (idProceso[i] == idProcesoEliminado)
            {
                marco[i] = false;
                idProcesosEliminados.add(this.idPagina[i]);
            }
        }  
        return idProcesosEliminados;
    }
    
    public int agregarPaginasPrincipalActivar(int id, int pagAgregar, ArrayList idPaginasAgregar)
    {
        for (int i = 0; i < idPaginasAgregar.size(); i++) 
        {
            System.out.print("[ID AGREGAR: "+idPaginasAgregar.get(i)+"]  "); 
        }
        System.out.println("Se van a agregar: "+pagAgregar);
        int cont = 0;
        for (int i = 0; i < marco.length; i++) 
        {
            if (!marco[i])
            {   
                idProceso[i] = id;
                System.out.println("i esta en "+i);
                idPagina[i] = (int) idPaginasAgregar.get(0);
                idPaginasAgregar.remove(0);
                marco[i] = true;
                cont++;
            }
            if (cont == pagAgregar)
            {
                break;
            }
        }
        return cont;
    }
    
    public ArrayList limpiarPaginasActivar(int idPocesoActivado, int pagLimpiar)
    {
       ArrayList<Integer> idProcesosEliminados = new ArrayList<Integer>();
       int cont = 0;
        for (int i = 0; i < marco.length; i++) 
        {
            if (idProceso[i] == idPocesoActivado) 
            {
                marco[i] = false;
                cont++;
                idProcesosEliminados.add(idPagina[i]);
            }
            if (cont == pagLimpiar)
            {
                return idProcesosEliminados;
            }
        }
        return idProcesosEliminados;
    }
    
    public int espacioDisponible()
    {     
          int y = size - (marcosUsados()*sizePage);
          return y/1024;
    }
 
    public String cero(int num)
    {
        if (num < 10)
        {
            return "0";
        }
        else 
        {
            return "";
        }
    }
    
    public int devolverPosicionPagina(int idProceso, int idPagina)
    {
        for (int i = 0; i < marco.length; i++) 
        {
            if(this.idProceso[i] == idProceso && this.idPagina[i] == idPagina)
            {
                return i;
            }
        }
        return -1;
    }
}
