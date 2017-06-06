/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metroOS;

import static java.lang.Math.ceil;
/**
 *
 * @author Vin
 */
public class proceso
{
    private int id;
    private int size;
    private String estado;
    private Boolean bloqueado;
    private int paginas;  
    private int paginasPrincipal;
    private int paginasSecundaria;

    public proceso(int size, int tamPag) 
    {
        this.bloqueado = false;
        this.size = size;
        int n = size / tamPag + ((size % tamPag == 0) ? 0 : 1);
        this.paginas = n;
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    } 
   
    public int getSize() 
    {
        return size;
    }

    public void setSize(int size) 
    {
        this.size = size;
    }
    
    public String getEstado() 
    {
        return estado;
    }

    public void setEstado(String estado) 
    {
        this.estado = estado;
    }
    
    public Boolean getBloqueado() 
    {
        return bloqueado;
    }

    public void setBloqueado(Boolean bloqueado) 
    {
        this.bloqueado = bloqueado;
    }

    public int getPaginas() 
    {
        return paginas;
    }

    public void setPaginas(int paginas) 
    {
        this.paginas = paginas;
    }

    public int getPaginasPrincipal() 
    {
        return paginasPrincipal;
    }

    public void setPaginasPrincipal(int paginasPrincipal) 
    {
        this.paginasPrincipal = paginasPrincipal;
    }

    public int getPaginasSecundaria() 
    {
        return paginasSecundaria;
    }

    public void setPaginasSecundaria(int paginasSecundaria) 
    {
        this.paginasSecundaria = paginasSecundaria;
    }
    
    public void calcularPaginas(int disponibilidadMP)
    {
        if (disponibilidadMP >= paginas) 
        {
            this.paginasPrincipal = paginas;
            this.paginasSecundaria = 0;
        }
        else
        {
            this.paginasPrincipal = disponibilidadMP;
            this.paginasSecundaria = this.paginas - this.paginasPrincipal;
        }
    }
    
    public void imprimirIdProceso()      
    {   
        String estadoA;
        if (estado.equals("Activo")) 
        {
            estadoA = "  Activo  ";
        }
        else
            estadoA = "Suspendido";
        if (bloqueado) {
            
        }
        System.out.print("[P");
        if (id < 10) 
        {
            System.out.print("0");
        }
        System.out.println(id+"]  [Estado: "+devolverBlouqueado()+" "+estadoA+"]  [N° pag: "+cero(paginas)+""+paginas+"]  "
                + "[N° pagP: "+cero(paginasPrincipal)+""+paginasPrincipal+"]  [N° pagS: "+cero(paginasSecundaria)+""+paginasSecundaria+"]");
    }  
    
    public String devolverBlouqueado()
    {
        if (bloqueado) 
        {
            return "Bloqueado";
        }
        else
        {
            return "  Listo  ";
        }
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
}
