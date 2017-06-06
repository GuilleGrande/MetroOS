/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metroOS;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Vin
 */
public class aplicacion 
{
    public Scanner sc = new Scanner(System.in);
    private memoria mP;
    private memoria mS;
    private int sizeP;
    private int sizeS;
    private int sizePage;
    private int idProcesos = 0;
    private int procesosCreados = 0;
    private ArrayList<proceso> procesos= new ArrayList<proceso>();
    private ArrayList<Integer> idProcesosEliminados = new ArrayList<Integer>();

    public aplicacion(int sizeP, int sizeS, int tamPag) 
    {
        this.sizeP = sizeP;
        this.sizeS = sizeS;
        this.sizePage = tamPag;
        this.mP = new memoria(sizeP, tamPag);
        this.mS = new memoria(sizeS, tamPag);
    }
    
    public ArrayList<proceso> getProcesos()
    {
        return procesos;
    }

    public memoria getmP() 
    {
        return mP;
    }

    public memoria getmS() 
    {
        return mS;
    }
    
    public void imprimirMemorias()
    {
        int tamPrincipal = mP.getMarco().length;
        int tamSecundaria = mS.getMarco().length;
        int tamMayor = devolverMayor(tamPrincipal, tamSecundaria);
        int id, pagina;
        


        System.out.print("[Memoria Principal: "+tamPrincipal+" marcos de pagina]");
        System.out.println("         [Memoria Secundaria: "+tamSecundaria+" marcos de pagina]");
        
        for (int i = 0; i < tamMayor; i++) 
        {
           if(i < tamPrincipal)
           {   
              id = mP.getIdProceso()[i];
              mP.imprimirMemoria(i, id);
              System.out.print("               ");
           }
           else
           {
               System.out.print("                                                  ");
           }
           if (i <tamSecundaria) 
           {
              id = mS.getIdProceso()[i];
              mS.imprimirMemoria(i, id);
           }
           else
           {
                System.out.print("");
           } 
           System.out.println("");
        }
        System.out.println("\n");
    }  
    
    public int asignarID()
    {
        if (procesos.size() > 0 || idProcesosEliminados.size() > 0)
        {
            if (idProcesosEliminados.size() == 0)
            {
                idProcesos++;
                return idProcesos;
            }
            else
            {
                int menor = 99999;
                int posicionAux = 0;
                for (int i = 0; i < idProcesosEliminados.size(); i++) 
                {
                    if (idProcesosEliminados.get(i) < menor) 
                    {
                        menor = idProcesosEliminados.get(i);
                        posicionAux = i;
                    }
  
                }
                idProcesosEliminados.remove(posicionAux);
                return menor;
            }
        }
        else
        {
            idProcesos = 0;
            return 0;
        }  
    }
    
    public int crearProceso(int sizeProces, int bitsNumPag)
    {
        int disponibildaPrincipal = mP.marcosDisponibles();
        int disponibildadSeundaria = mS.marcosDisponibles();
        proceso p = new proceso(sizeProces, sizePage);
        p.calcularPaginas(disponibildaPrincipal);
        boolean validador = mP.validadorAccesoMemoriaP(p.getPaginas());
        if (validador)
        {
            if ((disponibildadSeundaria < p.getPaginasSecundaria())) 
            {
                return 2;
            }
            else
            {
                int id = asignarID();
                p.setId(id);
                p.setEstado("Activo");
                procesos.add(p);
                mP.agregarPaginasPrincipal(id, p.getPaginasPrincipal());  
                if (p.getPaginasSecundaria()>0) 
                {
                    mS.agregarPaginasSecundariaDesdePrincipal(id, p.getPaginasPrincipal(), p.getPaginas());  
                }
                procesosCreados++;
                return 3;
            }    
        }
        else
        {
            if (disponibildadSeundaria < p.getPaginas()) 
            {
                return 2;
            }
            else
            {
                int id = asignarID();
                p.setId(id);
                p.setEstado("Suspendido");
                procesos.add(p);
                p.setPaginasSecundaria(p.getPaginas());
                mS.agregarPaginasSecundaria(id, p.getPaginasSecundaria());
                procesosCreados++;
                return 3;
            }
        }
    }
    
    public void eliminarProceso(int id)
    {
        int posicion = devolverPosicion(id);
        idProcesosEliminados.add(id);
        procesos.remove(posicion);
        mP.limpiarPaginas(id);
        mS.limpiarPaginas(id);
    }
    
    public boolean suspenderProceso(int id)
    {
        int posicion = devolverPosicion(id);
        proceso p = procesos.get(posicion);
        int disponibildadSeundaria = mS.marcosDisponibles();
        if (disponibildadSeundaria < p.getPaginasPrincipal()) 
        {
            System.out.println("Memoria Secundaria LLena **** No se puede suspender proceso");
           return false; 
        }
        else
        {
            ArrayList<Integer> idPaginasAgregar = new ArrayList<Integer>();
            idPaginasAgregar = mP.limpiarPaginas(id);
            mS.agregarPaginasSecundariaSuspender(id, p.getPaginasPrincipal(), idPaginasAgregar);
            p.setPaginasPrincipal(0);
            p.setPaginasSecundaria(p.getPaginas());
            p.setEstado("Suspendido");
            return true;
        }
    }
    
    public boolean activarProceso(int id)
    {
        int posicion = devolverPosicion(id);
        int disponibildadPrincipal = mP.marcosDisponibles();
        proceso p = procesos.get(posicion);
        
        if (mP.validadorAccesoMemoriaP(p.getPaginasSecundaria()))
        {
            if (disponibildadPrincipal >= p.getPaginasSecundaria()) 
            {
              mS.limpiarPaginasActivar(id, p.getPaginasSecundaria());
              mP.agregarPaginasPrincipal(id, p.getPaginas());
              p.setPaginasPrincipal(p.getPaginas());
              p.setPaginasSecundaria(0);
              p.setEstado("Activo");
              return true;
            }
            else if (disponibildadPrincipal <p.getPaginasSecundaria())
            {
                ArrayList<Integer> idPaginasAgregar = new ArrayList<Integer>();
                idPaginasAgregar = mS.limpiarPaginasActivar(id, disponibildadPrincipal);
                mP.agregarPaginasPrincipalActivar(id, disponibildadPrincipal, idPaginasAgregar);
                p.setPaginasPrincipal(disponibildadPrincipal);
                p.setPaginasSecundaria(p.getPaginas() - disponibildadPrincipal);
                p.setEstado("Activo");
                return true;
            }
        }
        else
        {
            System.out.println("Memoria Principal llena **** No se puede activar proceso");
            return false; 
        }  
        return false;
    }
    
    public void bloquearProceso(int id)
    {
        int posicion = devolverPosicion(id);
        procesos.get(posicion).setBloqueado(true);
    }
    
    public void desbloquearProceso(int id)
    {
        int posicion = devolverPosicion(id);
        procesos.get(posicion).setBloqueado(false);
    }
    
    public void imprimirProcesos()
    {
        proceso p;
        for (int i = 0; i < procesos.size(); i++)
        {
            p = procesos.get(i);
            p.imprimirIdProceso();
        }
        System.out.println("\n\n");
    }
    
    public int procesosCreados()
    {
        return procesosCreados;
    }
    
    public int procesosSistema()
    {
        return procesos.size();
    }
    
    public int devolverPosicion(int id)
    {
        int i;
        for (i = 0; i < procesos.size(); i++) 
        {
            if (id == procesos.get(i).getId()) 
            {
                return i;
            }
        }
        return i;
    }
    
    public int devolverMayor(int x, int y)
    {
        return y;
    }
    
    public int calcularBitsDesplazamiento()
    {
        int aux = 2;
        int cont = 1;
        while (aux != sizePage) 
        {
            aux = aux * 2;
            cont++;
        }
        return cont;
    }
    
    public String direccionFisicaBinario(String direccionLogica, int idProceso, int bitsNumPag)
    {
        Formatter formateador = new Formatter();
        String idPaginaBinario = direccionLogica.substring(0, bitsNumPag);
        String desplazamientoBinario = direccionLogica.substring(bitsNumPag, direccionLogica.length());
        
        int idPaginaDecimal = Integer.parseInt(idPaginaBinario, 2);
        
        if (idPaginaDecimal > procesos.get(idProceso).getPaginas()-1) 
        {
            return "La pagina introducida no forma parte del proceso";
        }
        
        int posicionPaginaDecimal = mP.devolverPosicionPagina(idProceso, idPaginaDecimal);
        
        if (posicionPaginaDecimal == -1) 
        {
            return "La Pagina no esta en memoria principal";
        }
        
        String posicionPaginaBinario = Integer.toBinaryString(posicionPaginaDecimal);
        int posicionPaginaBinarioAux = Integer.parseInt(posicionPaginaBinario);
        if (bitsNumPag == 2) 
        {
            formateador.format("%02d", posicionPaginaBinarioAux);
        }
        else if(bitsNumPag == 3)
        {
            formateador.format("%03d", posicionPaginaBinarioAux);       
        }
        else if (bitsNumPag == 4)
        {
            formateador.format("%04d", posicionPaginaBinarioAux);
        }
        else if (bitsNumPag == 5) 
        {
            formateador.format("%05d", posicionPaginaBinarioAux);
        }
        else if (bitsNumPag == 6)
        {
            formateador.format("%06d", posicionPaginaBinarioAux);
        }
        else if (bitsNumPag == 7)
        {
            formateador.format("%07d", posicionPaginaBinarioAux);
        }
        else if (bitsNumPag == 8)
        {
            formateador.format("%08d", posicionPaginaBinarioAux);
        }
        else if (bitsNumPag == 9)
        {
            formateador.format("%09d", posicionPaginaBinarioAux);
        }
        System.out.println("\n\n[La pagina "+idPaginaDecimal+" del proceso "+idProceso+" "
                           + "se encuentra en la posicion "+posicionPaginaDecimal+ "de la memoria principal]");
        return formateador + desplazamientoBinario;
    }
    
    public String direccionFisicaHexadecimal(String direccionfisicaBinario)
    {   
        int direccionFisicaDecimal = Integer.parseInt(direccionfisicaBinario, 2);
        String direccionFisicaHexa = Integer.toHexString(direccionFisicaDecimal);
        return direccionFisicaHexa;
        
    }
    
}
