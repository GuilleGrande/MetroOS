/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metroOS;

import java.awt.event.KeyEvent;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

/**
 *
 * @author Guillermo
 */
public class Interfaz extends javax.swing.JFrame {

    private aplicacion a;
    private int sizeP;
    private int sizeS;
    private int sizePage;
    private int bitsDesplazamiento;
    private int bitsNumPag;
    private DefaultListModel modelListoActivo, modelListoSuspendido, modelBloqueadoActivo, modelBloqueadoSuspendido;

    /**
     * Creates new form Interfaz
     */
    public Interfaz(int sizeP, int sizeS, int sizePage) 
    {
        initComponents();
        this.sizeP = sizeP;
        this.sizeS = sizeS;
        this.sizePage = sizePage;
        a = new aplicacion(sizeP, sizeS, sizePage);
        update();
        tamPagina.setText(Integer.toString(sizePage));
        bitsDesplazamiento = a.calcularBitsDesplazamiento();
        bitsNumPag = 16 - bitsDesplazamiento;
        bitsNumPagina.setText(Integer.toString(bitsNumPag));
        bitsDesplaz.setText(Integer.toString(bitsDesplazamiento));
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        errorCreacionProceso = new javax.swing.JDialog();
        mensajeErrorCreacionProceso = new javax.swing.JLabel();
        aceptarError = new javax.swing.JButton();
        panelAplicacion = new javax.swing.JPanel();
        panelEstadisticas = new javax.swing.JPanel();
        panelProcesos = new javax.swing.JPanel();
        labelProcesosCreados = new javax.swing.JLabel();
        labelProcesosSistema = new javax.swing.JLabel();
        nProcesosSistema = new javax.swing.JLabel();
        nProcesosCreados = new javax.swing.JLabel();
        panelPaginas = new javax.swing.JPanel();
        labelMemoriaPpl = new javax.swing.JLabel();
        labelPagUsoMPpl = new javax.swing.JLabel();
        labelPagDispMPpl = new javax.swing.JLabel();
        dash = new javax.swing.JLabel();
        labelMemoriaSec = new javax.swing.JLabel();
        labelPagUsoMSec = new javax.swing.JLabel();
        labelPagDispMSec = new javax.swing.JLabel();
        nPagDispMPpl = new javax.swing.JLabel();
        nPagUsoMPpl = new javax.swing.JLabel();
        nPagDispMSec = new javax.swing.JLabel();
        nPagUsoMSec = new javax.swing.JLabel();
        panelMemoria = new javax.swing.JPanel();
        labelMPplDisp = new javax.swing.JLabel();
        labelMSecDisp = new javax.swing.JLabel();
        mSecDisp = new javax.swing.JLabel();
        labelKBytes2 = new javax.swing.JLabel();
        mPplDisp = new javax.swing.JLabel();
        labelKBytes1 = new javax.swing.JLabel();
        panelAdminProcesos = new javax.swing.JPanel();
        labelCrearProceso = new javax.swing.JLabel();
        labelSizeProceso = new javax.swing.JLabel();
        textSizeProceso = new javax.swing.JTextField();
        labelBytes1 = new javax.swing.JLabel();
        btnCrearProceso = new javax.swing.JButton();
        panelProcesosListos = new javax.swing.JPanel();
        panelListoActivo = new javax.swing.JPanel();
        scrollListoActivo = new javax.swing.JScrollPane();
        listListoActivo = new javax.swing.JList<>();
        btnBloquearListoActivo = new javax.swing.JButton();
        btnSuspenderListoActivo = new javax.swing.JButton();
        btnEliminarListoActivo = new javax.swing.JButton();
        panelListoSuspendido = new javax.swing.JPanel();
        scrollListoSuspendido = new javax.swing.JScrollPane();
        listListoSuspendido = new javax.swing.JList<>();
        btnBloquearListoSuspendido = new javax.swing.JButton();
        btnActivarListoSuspendido = new javax.swing.JButton();
        btnElminarListoSuspendido = new javax.swing.JButton();
        panelProcesosBloqueados = new javax.swing.JPanel();
        panelBloqueadoActivo = new javax.swing.JPanel();
        scrollBloqueadoActivo = new javax.swing.JScrollPane();
        listBloqueadoActivo = new javax.swing.JList<>();
        btnDesbloquearBloqueadoActivo = new javax.swing.JButton();
        btnSuspenderBloqueadoActivo = new javax.swing.JButton();
        btnEliminarBloqueadoActivo = new javax.swing.JButton();
        panelBloqueadoSuspendido = new javax.swing.JPanel();
        scrollBloqueadoSuspendido = new javax.swing.JScrollPane();
        listBloqueadoSuspendido = new javax.swing.JList<>();
        btnDesbloquearBloqueadoSuspendido = new javax.swing.JButton();
        btnActivarBloqueadoSuspendido = new javax.swing.JButton();
        btnEliminarBloqueadoSuspendido = new javax.swing.JButton();
        panelDireccionamiento = new javax.swing.JPanel();
        labelIdProceso = new javax.swing.JLabel();
        labelNumPagina = new javax.swing.JLabel();
        labelTamPagina = new javax.swing.JLabel();
        labelTamDireccion = new javax.swing.JLabel();
        labelBitPagina = new javax.swing.JLabel();
        labelBitsDeplazamiento = new javax.swing.JLabel();
        labelDireccionLogica = new javax.swing.JLabel();
        txtDireccionLogica = new javax.swing.JTextField();
        labelDireccionFisica = new javax.swing.JLabel();
        bitsDireccion = new javax.swing.JLabel();
        tamPagina = new javax.swing.JLabel();
        numPaginas = new javax.swing.JLabel();
        bitsNumPagina = new javax.swing.JLabel();
        bitsDesplaz = new javax.swing.JLabel();
        cBoxProcesos = new javax.swing.JComboBox<>();
        labelBytes2 = new javax.swing.JLabel();
        labelBits2 = new javax.swing.JLabel();
        labelBits3 = new javax.swing.JLabel();
        direccionFisicaBinario = new javax.swing.JLabel();
        labelDireccionFisicaHexa = new javax.swing.JLabel();
        direccionFisicaHexa = new javax.swing.JLabel();
        btnTraducirDireccion = new javax.swing.JButton();
        btnImprimirOutput = new javax.swing.JButton();

        errorCreacionProceso.setMinimumSize(new java.awt.Dimension(475, 120));

        mensajeErrorCreacionProceso.setText("Error");

        aceptarError.setText("Aceptar");
        aceptarError.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                aceptarErrorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout errorCreacionProcesoLayout = new javax.swing.GroupLayout(errorCreacionProceso.getContentPane());
        errorCreacionProceso.getContentPane().setLayout(errorCreacionProcesoLayout);
        errorCreacionProcesoLayout.setHorizontalGroup(
            errorCreacionProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(errorCreacionProcesoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mensajeErrorCreacionProceso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, errorCreacionProcesoLayout.createSequentialGroup()
                .addContainerGap(202, Short.MAX_VALUE)
                .addComponent(aceptarError)
                .addContainerGap())
        );
        errorCreacionProcesoLayout.setVerticalGroup(
            errorCreacionProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(errorCreacionProcesoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mensajeErrorCreacionProceso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(aceptarError)
                .addContainerGap())
        );

        setTitle("Simulador de memoria virtual");

        panelAplicacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "metroOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 24))); // NOI18N

        panelEstadisticas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estadísticas del sistema", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 18))); // NOI18N

        panelProcesos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Procesos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 14))); // NOI18N
        panelProcesos.setPreferredSize(new java.awt.Dimension(300, 84));

        labelProcesosCreados.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelProcesosCreados.setText("Cantidad de procesos creados:");

        labelProcesosSistema.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelProcesosSistema.setText("Cantidad de procesos en el sistema:");

        nProcesosSistema.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        nProcesosSistema.setText("0");

        nProcesosCreados.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        nProcesosCreados.setText("0");

        javax.swing.GroupLayout panelProcesosLayout = new javax.swing.GroupLayout(panelProcesos);
        panelProcesos.setLayout(panelProcesosLayout);
        panelProcesosLayout.setHorizontalGroup(
            panelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProcesosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelProcesosCreados)
                    .addComponent(labelProcesosSistema))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nProcesosCreados)
                    .addComponent(nProcesosSistema))
                .addGap(0, 1, Short.MAX_VALUE))
        );
        panelProcesosLayout.setVerticalGroup(
            panelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProcesosLayout.createSequentialGroup()
                .addGroup(panelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelProcesosCreados)
                    .addComponent(nProcesosCreados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelProcesosSistema)
                    .addComponent(nProcesosSistema))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelPaginas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Páginas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 14))); // NOI18N
        panelPaginas.setPreferredSize(new java.awt.Dimension(300, 260));

        labelMemoriaPpl.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        labelMemoriaPpl.setText("Memoria principal");

        labelPagUsoMPpl.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelPagUsoMPpl.setText("Marcos de pagina en uso:");

        labelPagDispMPpl.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelPagDispMPpl.setText("Marcos de pagina disponible:");

        dash.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        dash.setText("-");

        labelMemoriaSec.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        labelMemoriaSec.setText("Memoria secundaria");

        labelPagUsoMSec.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelPagUsoMSec.setText("Marcos de pagina en uso:");

        labelPagDispMSec.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelPagDispMSec.setText("Marcos de pagina disponible:");

        nPagDispMPpl.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        nPagDispMPpl.setText("0");

        nPagUsoMPpl.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        nPagUsoMPpl.setText("0");

        nPagDispMSec.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        nPagDispMSec.setText("0");

        nPagUsoMSec.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        nPagUsoMSec.setText("0");

        javax.swing.GroupLayout panelPaginasLayout = new javax.swing.GroupLayout(panelPaginas);
        panelPaginas.setLayout(panelPaginasLayout);
        panelPaginasLayout.setHorizontalGroup(
            panelPaginasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPaginasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPaginasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPaginasLayout.createSequentialGroup()
                        .addGroup(panelPaginasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPaginasLayout.createSequentialGroup()
                                .addGroup(panelPaginasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelPagUsoMPpl)
                                    .addComponent(labelPagDispMPpl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelPaginasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nPagUsoMPpl)
                                    .addComponent(nPagDispMPpl)))
                            .addGroup(panelPaginasLayout.createSequentialGroup()
                                .addGroup(panelPaginasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelPagUsoMSec)
                                    .addComponent(labelPagDispMSec))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelPaginasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nPagUsoMSec)
                                    .addComponent(nPagDispMSec))))
                        .addGap(0, 44, Short.MAX_VALUE))
                    .addGroup(panelPaginasLayout.createSequentialGroup()
                        .addGroup(panelPaginasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMemoriaPpl)
                            .addComponent(labelMemoriaSec)
                            .addComponent(dash))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelPaginasLayout.setVerticalGroup(
            panelPaginasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPaginasLayout.createSequentialGroup()
                .addComponent(labelMemoriaPpl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPaginasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPagUsoMPpl)
                    .addComponent(nPagUsoMPpl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPaginasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPagDispMPpl)
                    .addComponent(nPagDispMPpl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dash)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMemoriaSec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPaginasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPagUsoMSec)
                    .addComponent(nPagUsoMSec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPaginasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPagDispMSec)
                    .addComponent(nPagDispMSec)))
        );

        panelMemoria.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Memoria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 14))); // NOI18N
        panelMemoria.setPreferredSize(new java.awt.Dimension(300, 136));

        labelMPplDisp.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelMPplDisp.setText("Memoria principal disponible:");

        labelMSecDisp.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelMSecDisp.setText("Memoria secundaria disponible:");

        mSecDisp.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        mSecDisp.setText("0");

        labelKBytes2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelKBytes2.setText("kBytes");

        mPplDisp.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        mPplDisp.setText("0");

        labelKBytes1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelKBytes1.setText("kBytes");

        javax.swing.GroupLayout panelMemoriaLayout = new javax.swing.GroupLayout(panelMemoria);
        panelMemoria.setLayout(panelMemoriaLayout);
        panelMemoriaLayout.setHorizontalGroup(
            panelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMemoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelMSecDisp)
                    .addComponent(labelMPplDisp, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMemoriaLayout.createSequentialGroup()
                        .addComponent(mPplDisp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelKBytes1))
                    .addGroup(panelMemoriaLayout.createSequentialGroup()
                        .addComponent(mSecDisp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelKBytes2)))
                .addGap(0, 87, Short.MAX_VALUE))
        );
        panelMemoriaLayout.setVerticalGroup(
            panelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMemoriaLayout.createSequentialGroup()
                .addGroup(panelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mPplDisp)
                    .addComponent(labelKBytes1)
                    .addComponent(labelMPplDisp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMSecDisp)
                    .addComponent(mSecDisp)
                    .addComponent(labelKBytes2))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelEstadisticasLayout = new javax.swing.GroupLayout(panelEstadisticas);
        panelEstadisticas.setLayout(panelEstadisticasLayout);
        panelEstadisticasLayout.setHorizontalGroup(
            panelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadisticasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelMemoria, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelEstadisticasLayout.setVerticalGroup(
            panelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEstadisticasLayout.createSequentialGroup()
                .addGroup(panelEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelMemoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(panelPaginas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(panelProcesos, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelAdminProcesos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administración de procesos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 18))); // NOI18N

        labelCrearProceso.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        labelCrearProceso.setText("Crear proceso");

        labelSizeProceso.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        labelSizeProceso.setText("Introduzca el tamaño del proceso:");

        textSizeProceso.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        textSizeProceso.setMinimumSize(new java.awt.Dimension(120, 32));
        textSizeProceso.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                textSizeProcesoActionPerformed(evt);
            }
        });
        textSizeProceso.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                textSizeProcesoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                textSizeProcesoKeyTyped(evt);
            }
        });

        labelBytes1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        labelBytes1.setText("Bytes");

        btnCrearProceso.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnCrearProceso.setText("Crear");
        btnCrearProceso.setEnabled(false);
        btnCrearProceso.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCrearProcesoActionPerformed(evt);
            }
        });

        panelProcesosListos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Procesos listos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 16))); // NOI18N

        panelListoActivo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Activos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 12))); // NOI18N

        modelListoActivo = new DefaultListModel();
        listListoActivo.setModel(modelListoActivo);
        scrollListoActivo.setViewportView(listListoActivo);

        btnBloquearListoActivo.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnBloquearListoActivo.setText("Bloquear");
        btnBloquearListoActivo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBloquearListoActivoActionPerformed(evt);
            }
        });

        btnSuspenderListoActivo.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnSuspenderListoActivo.setText("Suspender");
        btnSuspenderListoActivo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSuspenderListoActivoActionPerformed(evt);
            }
        });

        btnEliminarListoActivo.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnEliminarListoActivo.setText("Eliminar");
        btnEliminarListoActivo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEliminarListoActivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelListoActivoLayout = new javax.swing.GroupLayout(panelListoActivo);
        panelListoActivo.setLayout(panelListoActivoLayout);
        panelListoActivoLayout.setHorizontalGroup(
            panelListoActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListoActivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollListoActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelListoActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBloquearListoActivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSuspenderListoActivo, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(btnEliminarListoActivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );
        panelListoActivoLayout.setVerticalGroup(
            panelListoActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListoActivoLayout.createSequentialGroup()
                .addGroup(panelListoActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelListoActivoLayout.createSequentialGroup()
                        .addComponent(btnBloquearListoActivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSuspenderListoActivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarListoActivo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(scrollListoActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelListoSuspendido.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Suspendido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 12))); // NOI18N

        modelListoSuspendido = new DefaultListModel();
        listListoSuspendido.setModel(modelListoSuspendido);
        scrollListoSuspendido.setViewportView(listListoSuspendido);

        btnBloquearListoSuspendido.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnBloquearListoSuspendido.setText("Bloquear");
        btnBloquearListoSuspendido.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBloquearListoSuspendidoActionPerformed(evt);
            }
        });

        btnActivarListoSuspendido.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnActivarListoSuspendido.setText("Activar");
        btnActivarListoSuspendido.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnActivarListoSuspendidoActionPerformed(evt);
            }
        });

        btnElminarListoSuspendido.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnElminarListoSuspendido.setText("Eliminar");
        btnElminarListoSuspendido.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnElminarListoSuspendidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelListoSuspendidoLayout = new javax.swing.GroupLayout(panelListoSuspendido);
        panelListoSuspendido.setLayout(panelListoSuspendidoLayout);
        panelListoSuspendidoLayout.setHorizontalGroup(
            panelListoSuspendidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListoSuspendidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollListoSuspendido, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelListoSuspendidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnActivarListoSuspendido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnElminarListoSuspendido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBloquearListoSuspendido, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panelListoSuspendidoLayout.setVerticalGroup(
            panelListoSuspendidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListoSuspendidoLayout.createSequentialGroup()
                .addGroup(panelListoSuspendidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelListoSuspendidoLayout.createSequentialGroup()
                        .addComponent(btnBloquearListoSuspendido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActivarListoSuspendido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnElminarListoSuspendido)
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addComponent(scrollListoSuspendido, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelProcesosListosLayout = new javax.swing.GroupLayout(panelProcesosListos);
        panelProcesosListos.setLayout(panelProcesosListosLayout);
        panelProcesosListosLayout.setHorizontalGroup(
            panelProcesosListosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProcesosListosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelListoActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelListoSuspendido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelProcesosListosLayout.setVerticalGroup(
            panelProcesosListosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProcesosListosLayout.createSequentialGroup()
                .addGroup(panelProcesosListosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelListoSuspendido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelListoActivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelProcesosBloqueados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Procesos bloqueados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 16))); // NOI18N

        panelBloqueadoActivo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Activos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 12))); // NOI18N

        modelBloqueadoActivo = new DefaultListModel();
        listBloqueadoActivo.setModel(modelBloqueadoActivo);
        scrollBloqueadoActivo.setViewportView(listBloqueadoActivo);

        btnDesbloquearBloqueadoActivo.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnDesbloquearBloqueadoActivo.setText("Desbloquear");
        btnDesbloquearBloqueadoActivo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDesbloquearBloqueadoActivoActionPerformed(evt);
            }
        });

        btnSuspenderBloqueadoActivo.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnSuspenderBloqueadoActivo.setText("Suspender");
        btnSuspenderBloqueadoActivo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSuspenderBloqueadoActivoActionPerformed(evt);
            }
        });

        btnEliminarBloqueadoActivo.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnEliminarBloqueadoActivo.setText("Eliminar");
        btnEliminarBloqueadoActivo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEliminarBloqueadoActivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBloqueadoActivoLayout = new javax.swing.GroupLayout(panelBloqueadoActivo);
        panelBloqueadoActivo.setLayout(panelBloqueadoActivoLayout);
        panelBloqueadoActivoLayout.setHorizontalGroup(
            panelBloqueadoActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBloqueadoActivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollBloqueadoActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBloqueadoActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSuspenderBloqueadoActivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarBloqueadoActivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDesbloquearBloqueadoActivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBloqueadoActivoLayout.setVerticalGroup(
            panelBloqueadoActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBloqueadoActivoLayout.createSequentialGroup()
                .addGroup(panelBloqueadoActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBloqueadoActivoLayout.createSequentialGroup()
                        .addComponent(btnDesbloquearBloqueadoActivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSuspenderBloqueadoActivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarBloqueadoActivo)
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addComponent(scrollBloqueadoActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelBloqueadoSuspendido.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Suspendido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 12))); // NOI18N

        modelBloqueadoSuspendido = new DefaultListModel();

        listBloqueadoSuspendido.setModel(modelBloqueadoSuspendido);
        scrollBloqueadoSuspendido.setViewportView(listBloqueadoSuspendido);

        btnDesbloquearBloqueadoSuspendido.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnDesbloquearBloqueadoSuspendido.setText("Desbloquear");
        btnDesbloquearBloqueadoSuspendido.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDesbloquearBloqueadoSuspendidoActionPerformed(evt);
            }
        });

        btnActivarBloqueadoSuspendido.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnActivarBloqueadoSuspendido.setText("Activar");
        btnActivarBloqueadoSuspendido.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnActivarBloqueadoSuspendidoActionPerformed(evt);
            }
        });

        btnEliminarBloqueadoSuspendido.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnEliminarBloqueadoSuspendido.setText("Eliminar");
        btnEliminarBloqueadoSuspendido.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEliminarBloqueadoSuspendidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBloqueadoSuspendidoLayout = new javax.swing.GroupLayout(panelBloqueadoSuspendido);
        panelBloqueadoSuspendido.setLayout(panelBloqueadoSuspendidoLayout);
        panelBloqueadoSuspendidoLayout.setHorizontalGroup(
            panelBloqueadoSuspendidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBloqueadoSuspendidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollBloqueadoSuspendido, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBloqueadoSuspendidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDesbloquearBloqueadoSuspendido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActivarBloqueadoSuspendido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarBloqueadoSuspendido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBloqueadoSuspendidoLayout.setVerticalGroup(
            panelBloqueadoSuspendidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBloqueadoSuspendidoLayout.createSequentialGroup()
                .addGroup(panelBloqueadoSuspendidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBloqueadoSuspendidoLayout.createSequentialGroup()
                        .addComponent(btnDesbloquearBloqueadoSuspendido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActivarBloqueadoSuspendido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarBloqueadoSuspendido)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(scrollBloqueadoSuspendido, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelProcesosBloqueadosLayout = new javax.swing.GroupLayout(panelProcesosBloqueados);
        panelProcesosBloqueados.setLayout(panelProcesosBloqueadosLayout);
        panelProcesosBloqueadosLayout.setHorizontalGroup(
            panelProcesosBloqueadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProcesosBloqueadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBloqueadoActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBloqueadoSuspendido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelProcesosBloqueadosLayout.setVerticalGroup(
            panelProcesosBloqueadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProcesosBloqueadosLayout.createSequentialGroup()
                .addGroup(panelProcesosBloqueadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBloqueadoActivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBloqueadoSuspendido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelDireccionamiento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Direccionamiento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 12))); // NOI18N

        labelIdProceso.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelIdProceso.setText("ID proceso:");

        labelNumPagina.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelNumPagina.setText("Numero de páginas:");

        labelTamPagina.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelTamPagina.setText("Tamaño de páginas:");

        labelTamDireccion.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelTamDireccion.setText("Tamaño de dirección lógica:");

        labelBitPagina.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelBitPagina.setText("Bits de número de pagina:");

        labelBitsDeplazamiento.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelBitsDeplazamiento.setText("Bits de desplazamiento:");

        labelDireccionLogica.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelDireccionLogica.setText("Dirección lógica");

        txtDireccionLogica.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtDireccionLogica.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtDireccionLogicaActionPerformed(evt);
            }
        });
        txtDireccionLogica.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txtDireccionLogicaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtDireccionLogicaKeyTyped(evt);
            }
        });

        labelDireccionFisica.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelDireccionFisica.setText("Dirección física en binario:");

        bitsDireccion.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        bitsDireccion.setText("16 bits");

        tamPagina.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        tamPagina.setText("-");

        numPaginas.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        numPaginas.setText("-");

        bitsNumPagina.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        bitsNumPagina.setText("0");

        bitsDesplaz.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        bitsDesplaz.setText("0");

        cBoxProcesos.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cBoxProcesosActionPerformed(evt);
            }
        });

        labelBytes2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelBytes2.setText("Bytes");

        labelBits2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelBits2.setText("bits");

        labelBits3.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelBits3.setText("bits");

        direccionFisicaBinario.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        direccionFisicaBinario.setText("-");

        labelDireccionFisicaHexa.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelDireccionFisicaHexa.setText("Dirección física en hexadecimal:");

        direccionFisicaHexa.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        direccionFisicaHexa.setText("-");

        btnTraducirDireccion.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        btnTraducirDireccion.setText("Traducir");
        btnTraducirDireccion.setEnabled(false);
        btnTraducirDireccion.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnTraducirDireccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDireccionamientoLayout = new javax.swing.GroupLayout(panelDireccionamiento);
        panelDireccionamiento.setLayout(panelDireccionamientoLayout);
        panelDireccionamientoLayout.setHorizontalGroup(
            panelDireccionamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDireccionamientoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDireccionamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDireccionamientoLayout.createSequentialGroup()
                        .addGroup(panelDireccionamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelIdProceso)
                            .addComponent(labelNumPagina)
                            .addComponent(labelTamPagina)
                            .addComponent(labelTamDireccion)
                            .addComponent(labelBitPagina)
                            .addComponent(labelBitsDeplazamiento))
                        .addGap(58, 58, 58)
                        .addGroup(panelDireccionamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bitsDireccion)
                            .addComponent(numPaginas)
                            .addGroup(panelDireccionamientoLayout.createSequentialGroup()
                                .addComponent(bitsNumPagina)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelBits3))
                            .addGroup(panelDireccionamientoLayout.createSequentialGroup()
                                .addComponent(bitsDesplaz)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelBits2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDireccionamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cBoxProcesos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelDireccionamientoLayout.createSequentialGroup()
                                    .addComponent(tamPagina)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(labelBytes2))))
                        .addContainerGap(209, Short.MAX_VALUE))
                    .addGroup(panelDireccionamientoLayout.createSequentialGroup()
                        .addComponent(labelDireccionLogica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDireccionLogica, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTraducirDireccion)
                        .addGap(21, 21, 21))
                    .addGroup(panelDireccionamientoLayout.createSequentialGroup()
                        .addGroup(panelDireccionamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDireccionFisica)
                            .addComponent(labelDireccionFisicaHexa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDireccionamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(direccionFisicaBinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(direccionFisicaHexa, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelDireccionamientoLayout.setVerticalGroup(
            panelDireccionamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDireccionamientoLayout.createSequentialGroup()
                .addGroup(panelDireccionamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIdProceso)
                    .addComponent(cBoxProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDireccionamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumPagina)
                    .addComponent(numPaginas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDireccionamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTamPagina)
                    .addComponent(tamPagina)
                    .addComponent(labelBytes2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDireccionamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTamDireccion)
                    .addComponent(bitsDireccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDireccionamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBitPagina)
                    .addComponent(bitsNumPagina)
                    .addComponent(labelBits3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDireccionamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBitsDeplazamiento)
                    .addComponent(bitsDesplaz)
                    .addComponent(labelBits2))
                .addGap(18, 18, 18)
                .addGroup(panelDireccionamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDireccionLogica)
                    .addComponent(btnTraducirDireccion)
                    .addComponent(txtDireccionLogica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDireccionamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDireccionFisica)
                    .addComponent(direccionFisicaBinario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDireccionamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDireccionFisicaHexa)
                    .addComponent(direccionFisicaHexa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelAdminProcesosLayout = new javax.swing.GroupLayout(panelAdminProcesos);
        panelAdminProcesos.setLayout(panelAdminProcesosLayout);
        panelAdminProcesosLayout.setHorizontalGroup(
            panelAdminProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdminProcesosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAdminProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAdminProcesosLayout.createSequentialGroup()
                        .addGroup(panelAdminProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCrearProceso)
                            .addGroup(panelAdminProcesosLayout.createSequentialGroup()
                                .addComponent(labelSizeProceso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelAdminProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelAdminProcesosLayout.createSequentialGroup()
                                        .addComponent(textSizeProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelBytes1))
                                    .addComponent(btnCrearProceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelDireccionamiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAdminProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelProcesosListos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelProcesosBloqueados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelAdminProcesosLayout.setVerticalGroup(
            panelAdminProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdminProcesosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelProcesosListos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelProcesosBloqueados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
            .addGroup(panelAdminProcesosLayout.createSequentialGroup()
                .addComponent(labelCrearProceso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAdminProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSizeProceso)
                    .addComponent(textSizeProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBytes1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrearProceso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDireccionamiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelAplicacionLayout = new javax.swing.GroupLayout(panelAplicacion);
        panelAplicacion.setLayout(panelAplicacionLayout);
        panelAplicacionLayout.setHorizontalGroup(
            panelAplicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAplicacionLayout.createSequentialGroup()
                .addGroup(panelAplicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelAdminProcesos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEstadisticas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAplicacionLayout.setVerticalGroup(
            panelAplicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAplicacionLayout.createSequentialGroup()
                .addComponent(panelEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAdminProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnImprimirOutput.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        btnImprimirOutput.setText("Imprmir Output");
        btnImprimirOutput.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnImprimirOutputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnImprimirOutput)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelAplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnImprimirOutput)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textSizeProcesoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_textSizeProcesoActionPerformed
    {//GEN-HEADEREND:event_textSizeProcesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSizeProcesoActionPerformed

    private void btnBloquearListoActivoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBloquearListoActivoActionPerformed
    {//GEN-HEADEREND:event_btnBloquearListoActivoActionPerformed
       boolean validador = validarJlist(listListoActivo);
        if (validador) 
        {
            int id = Integer.parseInt(listListoActivo.getSelectedValue());
            a.bloquearProceso(id);
            modelListoActivo.removeElementAt(listListoActivo.getSelectedIndex());
            modelBloqueadoActivo.addElement(Integer.toString(id));
            update();
            actualizarComboBox();
        }
    }//GEN-LAST:event_btnBloquearListoActivoActionPerformed

    private void btnBloquearListoSuspendidoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBloquearListoSuspendidoActionPerformed
    {//GEN-HEADEREND:event_btnBloquearListoSuspendidoActionPerformed
       boolean validador = validarJlist(listListoSuspendido);
        if (validador)
        {
            int id = Integer.parseInt(listListoSuspendido.getSelectedValue());
            a.bloquearProceso(id);
            modelListoSuspendido.removeElementAt(listListoSuspendido.getSelectedIndex());
            modelBloqueadoSuspendido.addElement(Integer.toString(id));
            update();  
        }

    }//GEN-LAST:event_btnBloquearListoSuspendidoActionPerformed

    private void btnDesbloquearBloqueadoActivoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDesbloquearBloqueadoActivoActionPerformed
    {//GEN-HEADEREND:event_btnDesbloquearBloqueadoActivoActionPerformed
        boolean validador = validarJlist(listBloqueadoActivo);
        if (validador) 
        {
            int id = Integer.parseInt(listBloqueadoActivo.getSelectedValue());
            a.desbloquearProceso(id);
            modelBloqueadoActivo.removeElementAt(listBloqueadoActivo.getSelectedIndex());
            modelListoActivo.addElement(Integer.toString(id));
            update();
            actualizarComboBox();
        }
    }//GEN-LAST:event_btnDesbloquearBloqueadoActivoActionPerformed

    private void btnDesbloquearBloqueadoSuspendidoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDesbloquearBloqueadoSuspendidoActionPerformed
    {//GEN-HEADEREND:event_btnDesbloquearBloqueadoSuspendidoActionPerformed
        boolean validador = validarJlist(listBloqueadoSuspendido);
        if (validador) 
        {
            int id = Integer.parseInt(listBloqueadoSuspendido.getSelectedValue());
            a.desbloquearProceso(id);
            modelBloqueadoSuspendido.removeElementAt(listBloqueadoSuspendido.getSelectedIndex());
            modelListoSuspendido.addElement(Integer.toString(id));
            update();
        }
    }//GEN-LAST:event_btnDesbloquearBloqueadoSuspendidoActionPerformed

    private void btnActivarBloqueadoSuspendidoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnActivarBloqueadoSuspendidoActionPerformed
    {//GEN-HEADEREND:event_btnActivarBloqueadoSuspendidoActionPerformed
       boolean validador = validarJlist(listBloqueadoSuspendido);
        if (validador)
        {
            int id = Integer.parseInt(listBloqueadoSuspendido.getSelectedValue());
            if (a.activarProceso(id)) 
            {
                modelBloqueadoSuspendido.removeElementAt(listBloqueadoSuspendido.getSelectedIndex());
                modelBloqueadoActivo.addElement(Integer.toString(id));
                update(); 
            }
            else
            {
                errorCreacionProceso.setLocationRelativeTo(null);
                mensajeErrorCreacionProceso.setText("Error: no hay espacio en memoria principal.");
                errorCreacionProceso.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnActivarBloqueadoSuspendidoActionPerformed

    private void btnCrearProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProcesoActionPerformed

        String sP = textSizeProceso.getText();
        int sizeProces = Integer.parseInt(sP);
        int validador = a.crearProceso(sizeProces, bitsNumPag);
        
        if (validador == 2)
        {
            errorCreacionProceso.setLocationRelativeTo(null);
            mensajeErrorCreacionProceso.setText("Error: no hay espacio en memoria.");
            errorCreacionProceso.setVisible(true);
            textSizeProceso.setText("");
        }
        else if(validador == 3)
        {
            textSizeProceso.setText("");
            int id = a.getProcesos().get(a.getProcesos().size()-1).getId();
            int posicion = a.devolverPosicion(id);
            
            if (a.getProcesos().get(posicion).getEstado().equals("Activo")) 
            {
                modelListoActivo.addElement(Integer.toString(id));
                actualizarComboBox();
            }
            else
            {
                modelListoSuspendido.addElement(Integer.toString(id));
            }
        } 
        update(); 
    }//GEN-LAST:event_btnCrearProcesoActionPerformed

    private void aceptarErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarErrorActionPerformed
        // TODO add your handling code here:
        errorCreacionProceso.setVisible(false);
    }//GEN-LAST:event_aceptarErrorActionPerformed

    private void btnEliminarListoActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarListoActivoActionPerformed
       boolean validador = validarJlist(listListoActivo);
        if (validador) 
        {
            int id = Integer.parseInt(listListoActivo.getSelectedValue());
            a.eliminarProceso(id);
            modelListoActivo.removeElementAt(listListoActivo.getSelectedIndex());
            update();   
            actualizarComboBox();
        }
    }//GEN-LAST:event_btnEliminarListoActivoActionPerformed

    private void btnElminarListoSuspendidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElminarListoSuspendidoActionPerformed
       boolean validador = validarJlist(listListoSuspendido);
        if (validador) 
        {
            int id = Integer.parseInt(listListoSuspendido.getSelectedValue());
            a.eliminarProceso(id);
            modelListoSuspendido.removeElementAt(listListoSuspendido.getSelectedIndex());
            update();  
        }
    }//GEN-LAST:event_btnElminarListoSuspendidoActionPerformed

    private void btnEliminarBloqueadoActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarBloqueadoActivoActionPerformed
       boolean validador = validarJlist(listBloqueadoActivo);
        if (validador) 
        {
            int id = Integer.parseInt(listBloqueadoActivo.getSelectedValue());
            a.eliminarProceso(id);
            modelBloqueadoActivo.removeElementAt(listBloqueadoActivo.getSelectedIndex());
            update();  
        }
    }//GEN-LAST:event_btnEliminarBloqueadoActivoActionPerformed

    private void btnEliminarBloqueadoSuspendidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarBloqueadoSuspendidoActionPerformed
       boolean validador = validarJlist(listBloqueadoSuspendido);
        if (validador) 
        {
            int id = Integer.parseInt(listBloqueadoSuspendido.getSelectedValue());
            a.eliminarProceso(id);
            modelBloqueadoSuspendido.removeElementAt(listBloqueadoSuspendido.getSelectedIndex());
            update();  
        }   
    }//GEN-LAST:event_btnEliminarBloqueadoSuspendidoActionPerformed

    private void btnSuspenderListoActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuspenderListoActivoActionPerformed
        boolean validador = validarJlist(listListoActivo);
        if (validador)
        {
            int id = Integer.parseInt(listListoActivo.getSelectedValue());
            if (a.suspenderProceso(id))
            {
                modelListoActivo.removeElementAt(listListoActivo.getSelectedIndex());
                modelListoSuspendido.addElement(Integer.toString(id));
                update(); 
                actualizarComboBox(); 
            }
            else
            {
                errorCreacionProceso.setLocationRelativeTo(null);
                mensajeErrorCreacionProceso.setText("Error: no hay espacio en memoria secundaria.");
                errorCreacionProceso.setVisible(true);  
            }
        }
        else
        {
            
        }
    }//GEN-LAST:event_btnSuspenderListoActivoActionPerformed

    private void btnActivarListoSuspendidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarListoSuspendidoActionPerformed
        boolean validador = validarJlist(listListoSuspendido);
        if (validador)
        {
            int id = Integer.parseInt(listListoSuspendido.getSelectedValue());
            if (a.activarProceso(id)) 
            {
                modelListoSuspendido.removeElementAt(listListoSuspendido.getSelectedIndex());
                modelListoActivo.addElement(Integer.toString(id));
                update(); 
                actualizarComboBox();
            }
            else
            {
                errorCreacionProceso.setLocationRelativeTo(null);
                mensajeErrorCreacionProceso.setText("Error: no hay espacio en memoria principal.");
                errorCreacionProceso.setVisible(true); 
            }

        }
    }//GEN-LAST:event_btnActivarListoSuspendidoActionPerformed

    private void btnSuspenderBloqueadoActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuspenderBloqueadoActivoActionPerformed
        boolean validador = validarJlist(listBloqueadoActivo);
        if (validador)
        {
            int id = Integer.parseInt(listBloqueadoActivo.getSelectedValue());
            if (a.suspenderProceso(id)) 
            {
                modelBloqueadoActivo.removeElementAt(listBloqueadoActivo.getSelectedIndex());
                modelBloqueadoSuspendido.addElement(Integer.toString(id));
                update(); 
            }
            else
            {
                errorCreacionProceso.setLocationRelativeTo(null);
                mensajeErrorCreacionProceso.setText("Error: no hay espacio en memoria secundaria.");
                errorCreacionProceso.setVisible(true); 
            } 
        }
    }//GEN-LAST:event_btnSuspenderBloqueadoActivoActionPerformed

    private void btnImprimirOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirOutputActionPerformed
        a.imprimirMemorias();
        a.imprimirProcesos();
    }//GEN-LAST:event_btnImprimirOutputActionPerformed

    private void cBoxProcesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxProcesosActionPerformed
        if (cBoxProcesos.getSelectedItem()!=null)
        {
            int id = Integer.parseInt((String) cBoxProcesos.getSelectedItem());
            int posicion = a.devolverPosicion(id);
            numPaginas.setText(Integer.toString(a.getProcesos().get(posicion).getPaginas()));
        }
        else
        {

        }
    }//GEN-LAST:event_cBoxProcesosActionPerformed

    private void txtDireccionLogicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionLogicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionLogicaActionPerformed

    private void btnTraducirDireccionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnTraducirDireccionActionPerformed
    {//GEN-HEADEREND:event_btnTraducirDireccionActionPerformed
        String direccionLogica = txtDireccionLogica.getText();
        int id = Integer.parseInt((String) cBoxProcesos.getSelectedItem());
        String direccionfisicaBinario = a.direccionFisicaBinario(direccionLogica, id, bitsNumPag);
        int idPagina = Integer.parseInt(direccionLogica.substring(0, bitsNumPag), 2);
        
        if (direccionfisicaBinario.equals("La pagina introducida no forma parte del proceso")) 
        {
           mensajeErrorCreacionProceso.setText("La pagina "+idPagina+" seleccionada no pertenece al proceso "+id);
           errorCreacionProceso.setLocationRelativeTo(null);
           mensajeErrorCreacionProceso.setText("La pagina "+idPagina+" seleccionada no pertenece al proceso "+id);
           errorCreacionProceso.setVisible(true); 
        }
        else if (direccionfisicaBinario.equals("La Pagina no esta en memoria principal")) 
        {
            mensajeErrorCreacionProceso.setText("La pagina "+idPagina+" perteneciente al proceso "+id+" se encuentra en memoria secundaria");
            errorCreacionProceso.setLocationRelativeTo(null);
            mensajeErrorCreacionProceso.setText("La pagina "+idPagina+" perteneciente al proceso "+id+" se encuentra en memoria secundaria");
            errorCreacionProceso.setVisible(true);
        }
        else
       {
            System.out.println("\n\n[Direccion Fisica Binario: "+direccionfisicaBinario+"]\n\n");
            String direccionFisicaHexadecimal = a.direccionFisicaHexadecimal(direccionfisicaBinario);
            direccionFisicaBinario.setText(direccionfisicaBinario);
            direccionFisicaHexa.setText(direccionFisicaHexadecimal);
        } 
    }//GEN-LAST:event_btnTraducirDireccionActionPerformed

    private void textSizeProcesoKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_textSizeProcesoKeyTyped
    {//GEN-HEADEREND:event_textSizeProcesoKeyTyped
        char c=evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) 
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_textSizeProcesoKeyTyped

    private void txtDireccionLogicaKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtDireccionLogicaKeyTyped
    {//GEN-HEADEREND:event_txtDireccionLogicaKeyTyped
        char c=evt.getKeyChar();
        if (!((c >= '0') && (c <= '1') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) 
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtDireccionLogicaKeyTyped

    private void textSizeProcesoKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_textSizeProcesoKeyReleased
    {//GEN-HEADEREND:event_textSizeProcesoKeyReleased
        if (textSizeProceso.getText().length() > 0)
        {
            btnCrearProceso.setEnabled(true);
        }
        else
        {
            btnCrearProceso.setEnabled(false);
        }
    }//GEN-LAST:event_textSizeProcesoKeyReleased

    private void txtDireccionLogicaKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtDireccionLogicaKeyReleased
    {//GEN-HEADEREND:event_txtDireccionLogicaKeyReleased
        if (txtDireccionLogica.getText().length() == 16 && !(cBoxProcesos.getSelectedIndex() == -1))
        {
            btnTraducirDireccion.setEnabled(true);
        }
        else
        {
            btnTraducirDireccion.setEnabled(false);
        }
    }//GEN-LAST:event_txtDireccionLogicaKeyReleased

    public void update()
    {
            nProcesosCreados.setText(Integer.toString(a.procesosCreados()));
            nProcesosSistema.setText(Integer.toString(a.procesosSistema()));
            nPagUsoMPpl.setText(Integer.toString(a.getmP().marcosUsados()));
            nPagDispMPpl.setText(Integer.toString(a.getmP().marcosDisponibles()));
            nPagUsoMSec.setText(Integer.toString(a.getmS().marcosUsados()));
            nPagDispMSec.setText(Integer.toString(a.getmS().marcosDisponibles()));
            mPplDisp.setText(Integer.toString(a.getmP().espacioDisponible()));
            mSecDisp.setText(Integer.toString(a.getmS().espacioDisponible()));   
    }
    
    public boolean validarJlist(JList aux)
    {
       if(aux.getSelectedValue()==null)
       {
            return false;
       }
       else return true;
    }
    
    public void actualizarComboBox()
    {
        numPaginas.setText("0");
        cBoxProcesos.removeAllItems();
        for (int i = 0; i < a.getProcesos().size(); i++) 
        {
            if (a.getProcesos().get(i).getEstado().equals("Activo") && !a.getProcesos().get(i).getBloqueado()) 
            {
                cBoxProcesos.addItem(Integer.toString(a.getProcesos().get(i).getId()));
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarError;
    private javax.swing.JLabel bitsDesplaz;
    private javax.swing.JLabel bitsDireccion;
    private javax.swing.JLabel bitsNumPagina;
    private javax.swing.JButton btnActivarBloqueadoSuspendido;
    private javax.swing.JButton btnActivarListoSuspendido;
    private javax.swing.JButton btnBloquearListoActivo;
    private javax.swing.JButton btnBloquearListoSuspendido;
    private javax.swing.JButton btnCrearProceso;
    private javax.swing.JButton btnDesbloquearBloqueadoActivo;
    private javax.swing.JButton btnDesbloquearBloqueadoSuspendido;
    private javax.swing.JButton btnEliminarBloqueadoActivo;
    private javax.swing.JButton btnEliminarBloqueadoSuspendido;
    private javax.swing.JButton btnEliminarListoActivo;
    private javax.swing.JButton btnElminarListoSuspendido;
    private javax.swing.JButton btnImprimirOutput;
    private javax.swing.JButton btnSuspenderBloqueadoActivo;
    private javax.swing.JButton btnSuspenderListoActivo;
    private javax.swing.JButton btnTraducirDireccion;
    private javax.swing.JComboBox<String> cBoxProcesos;
    private javax.swing.JLabel dash;
    private javax.swing.JLabel direccionFisicaBinario;
    private javax.swing.JLabel direccionFisicaHexa;
    private javax.swing.JDialog errorCreacionProceso;
    private javax.swing.JLabel labelBitPagina;
    private javax.swing.JLabel labelBits2;
    private javax.swing.JLabel labelBits3;
    private javax.swing.JLabel labelBitsDeplazamiento;
    private javax.swing.JLabel labelBytes1;
    private javax.swing.JLabel labelBytes2;
    private javax.swing.JLabel labelCrearProceso;
    private javax.swing.JLabel labelDireccionFisica;
    private javax.swing.JLabel labelDireccionFisicaHexa;
    private javax.swing.JLabel labelDireccionLogica;
    private javax.swing.JLabel labelIdProceso;
    private javax.swing.JLabel labelKBytes1;
    private javax.swing.JLabel labelKBytes2;
    private javax.swing.JLabel labelMPplDisp;
    private javax.swing.JLabel labelMSecDisp;
    private javax.swing.JLabel labelMemoriaPpl;
    private javax.swing.JLabel labelMemoriaSec;
    private javax.swing.JLabel labelNumPagina;
    private javax.swing.JLabel labelPagDispMPpl;
    private javax.swing.JLabel labelPagDispMSec;
    private javax.swing.JLabel labelPagUsoMPpl;
    private javax.swing.JLabel labelPagUsoMSec;
    private javax.swing.JLabel labelProcesosCreados;
    private javax.swing.JLabel labelProcesosSistema;
    private javax.swing.JLabel labelSizeProceso;
    private javax.swing.JLabel labelTamDireccion;
    private javax.swing.JLabel labelTamPagina;
    private javax.swing.JList<String> listBloqueadoActivo;
    private javax.swing.JList<String> listBloqueadoSuspendido;
    private javax.swing.JList<String> listListoActivo;
    private javax.swing.JList<String> listListoSuspendido;
    private javax.swing.JLabel mPplDisp;
    private javax.swing.JLabel mSecDisp;
    private javax.swing.JLabel mensajeErrorCreacionProceso;
    private javax.swing.JLabel nPagDispMPpl;
    private javax.swing.JLabel nPagDispMSec;
    private javax.swing.JLabel nPagUsoMPpl;
    private javax.swing.JLabel nPagUsoMSec;
    private javax.swing.JLabel nProcesosCreados;
    private javax.swing.JLabel nProcesosSistema;
    private javax.swing.JLabel numPaginas;
    private javax.swing.JPanel panelAdminProcesos;
    private javax.swing.JPanel panelAplicacion;
    private javax.swing.JPanel panelBloqueadoActivo;
    private javax.swing.JPanel panelBloqueadoSuspendido;
    private javax.swing.JPanel panelDireccionamiento;
    private javax.swing.JPanel panelEstadisticas;
    private javax.swing.JPanel panelListoActivo;
    private javax.swing.JPanel panelListoSuspendido;
    private javax.swing.JPanel panelMemoria;
    private javax.swing.JPanel panelPaginas;
    private javax.swing.JPanel panelProcesos;
    private javax.swing.JPanel panelProcesosBloqueados;
    private javax.swing.JPanel panelProcesosListos;
    private javax.swing.JScrollPane scrollBloqueadoActivo;
    private javax.swing.JScrollPane scrollBloqueadoSuspendido;
    private javax.swing.JScrollPane scrollListoActivo;
    private javax.swing.JScrollPane scrollListoSuspendido;
    private javax.swing.JLabel tamPagina;
    private javax.swing.JTextField textSizeProceso;
    private javax.swing.JTextField txtDireccionLogica;
    // End of variables declaration//GEN-END:variables
}
