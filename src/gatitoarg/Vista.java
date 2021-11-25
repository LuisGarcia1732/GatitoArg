package gatitoarg;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;

public final class Vista extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();
    boolean estado = true;
    ImageIcon siguientejuego;
    ImageIcon turno;
    ImageIcon PACMAN;
    ImageIcon FANTASMA;
    JLabel lbs[] = new JLabel[9];
    int win[][] = {{1, 2, 3},
    {4, 5, 6},
    {7, 8, 9},
    {1, 4, 7},
    {2, 5, 8},
    {3, 6, 9},
    {1, 5, 9},
    {3, 5, 7}};

    public Vista() {
        this.setContentPane(fondo);
        initComponents();
        this.setLocationRelativeTo(null);
        this.lbs[0] = PrimerCelda;
        this.lbs[1] = SegundaCelda;
        this.lbs[2] = TercerCelda;
        this.lbs[3] = CuartaCelda;
        this.lbs[4] = QuintaCelda;
        this.lbs[5] = SextaCelda;
        this.lbs[6] = SeptimaCelda;
        this.lbs[7] = OctavaCelda;
        this.lbs[8] = NovenaCelda;
        ImageIcon iconopacman = new ImageIcon(getClass().getResource("/imagenes/pacman.png"));
        ImageIcon ghost = new ImageIcon(getClass().getResource("/imagenes/fantasmaceleste64px.jpg"));
        this.siguientejuego = ghost;
        this.turno = iconopacman;
        this.PACMAN = iconopacman;
        this.FANTASMA = ghost;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagen = new FondoPanel();
        jPanel2 = new javax.swing.JPanel();
        PrimerCelda = new javax.swing.JLabel();
        CuartaCelda = new javax.swing.JLabel();
        QuintaCelda = new javax.swing.JLabel();
        SegundaCelda = new javax.swing.JLabel();
        SextaCelda = new javax.swing.JLabel();
        TercerCelda = new javax.swing.JLabel();
        OctavaCelda = new javax.swing.JLabel();
        NovenaCelda = new javax.swing.JLabel();
        SeptimaCelda = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        reinicio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fan = new javax.swing.JLabel();
        VictoriasX = new javax.swing.JLabel();
        VictoriasO = new javax.swing.JLabel();
        detalles = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        Creditos = new javax.swing.JButton();
        inicia = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Turno = new javax.swing.JLabel();
        Turno1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        imagen.setBackground(new java.awt.Color(255, 255, 255));
        imagen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setToolTipText("");
        jPanel2.setOpaque(false);

        PrimerCelda.setBackground(new java.awt.Color(204, 255, 255));
        PrimerCelda.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        PrimerCelda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PrimerCelda.setMaximumSize(new java.awt.Dimension(385, 450));
        PrimerCelda.setMinimumSize(new java.awt.Dimension(385, 450));
        PrimerCelda.setOpaque(true);
        PrimerCelda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrimerCeldaMouseClicked(evt);
            }
        });

        CuartaCelda.setBackground(new java.awt.Color(204, 255, 255));
        CuartaCelda.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        CuartaCelda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CuartaCelda.setMaximumSize(new java.awt.Dimension(385, 450));
        CuartaCelda.setMinimumSize(new java.awt.Dimension(385, 450));
        CuartaCelda.setOpaque(true);
        CuartaCelda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CuartaCeldaMouseClicked(evt);
            }
        });

        QuintaCelda.setBackground(new java.awt.Color(204, 255, 255));
        QuintaCelda.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        QuintaCelda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuintaCelda.setMaximumSize(new java.awt.Dimension(385, 450));
        QuintaCelda.setMinimumSize(new java.awt.Dimension(385, 450));
        QuintaCelda.setOpaque(true);
        QuintaCelda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QuintaCeldaMouseClicked(evt);
            }
        });

        SegundaCelda.setBackground(new java.awt.Color(204, 255, 255));
        SegundaCelda.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        SegundaCelda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SegundaCelda.setMaximumSize(new java.awt.Dimension(385, 450));
        SegundaCelda.setMinimumSize(new java.awt.Dimension(385, 450));
        SegundaCelda.setOpaque(true);
        SegundaCelda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SegundaCeldaMouseClicked(evt);
            }
        });

        SextaCelda.setBackground(new java.awt.Color(204, 255, 255));
        SextaCelda.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        SextaCelda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SextaCelda.setMaximumSize(new java.awt.Dimension(385, 450));
        SextaCelda.setMinimumSize(new java.awt.Dimension(385, 450));
        SextaCelda.setOpaque(true);
        SextaCelda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SextaCeldaMouseClicked(evt);
            }
        });

        TercerCelda.setBackground(new java.awt.Color(204, 255, 255));
        TercerCelda.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        TercerCelda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TercerCelda.setMaximumSize(new java.awt.Dimension(385, 450));
        TercerCelda.setMinimumSize(new java.awt.Dimension(385, 450));
        TercerCelda.setOpaque(true);
        TercerCelda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TercerCeldaMouseClicked(evt);
            }
        });

        OctavaCelda.setBackground(new java.awt.Color(204, 255, 255));
        OctavaCelda.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        OctavaCelda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OctavaCelda.setMaximumSize(new java.awt.Dimension(385, 450));
        OctavaCelda.setMinimumSize(new java.awt.Dimension(385, 450));
        OctavaCelda.setOpaque(true);
        OctavaCelda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OctavaCeldaMouseClicked(evt);
            }
        });

        NovenaCelda.setBackground(new java.awt.Color(204, 255, 255));
        NovenaCelda.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        NovenaCelda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NovenaCelda.setMaximumSize(new java.awt.Dimension(385, 450));
        NovenaCelda.setMinimumSize(new java.awt.Dimension(385, 450));
        NovenaCelda.setOpaque(true);
        NovenaCelda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NovenaCeldaMouseClicked(evt);
            }
        });

        SeptimaCelda.setBackground(new java.awt.Color(204, 255, 255));
        SeptimaCelda.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        SeptimaCelda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SeptimaCelda.setMaximumSize(new java.awt.Dimension(385, 450));
        SeptimaCelda.setMinimumSize(new java.awt.Dimension(385, 450));
        SeptimaCelda.setOpaque(true);
        SeptimaCelda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SeptimaCeldaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(PrimerCelda, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(SegundaCelda, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SeptimaCelda, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CuartaCelda, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QuintaCelda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OctavaCelda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SextaCelda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NovenaCelda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TercerCelda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SegundaCelda, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TercerCelda, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrimerCelda, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CuartaCelda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SextaCelda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuintaCelda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OctavaCelda, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NovenaCelda, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SeptimaCelda, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        PrimerCelda.getAccessibleContext().setAccessibleName("PrimerCelda");
        PrimerCelda.getAccessibleContext().setAccessibleParent(PrimerCelda);
        CuartaCelda.getAccessibleContext().setAccessibleName("CuartaCelda");
        CuartaCelda.getAccessibleContext().setAccessibleParent(CuartaCelda);
        QuintaCelda.getAccessibleContext().setAccessibleName("QuintaCelda");
        QuintaCelda.getAccessibleContext().setAccessibleParent(QuintaCelda);
        SegundaCelda.getAccessibleContext().setAccessibleName("SegundaCelda");
        SegundaCelda.getAccessibleContext().setAccessibleParent(SegundaCelda);
        SextaCelda.getAccessibleContext().setAccessibleName("SextaCelda");
        SextaCelda.getAccessibleContext().setAccessibleParent(SextaCelda);
        TercerCelda.getAccessibleContext().setAccessibleName("TercerCelda");
        TercerCelda.getAccessibleContext().setAccessibleParent(TercerCelda);
        OctavaCelda.getAccessibleContext().setAccessibleName("OctavaCelda");
        OctavaCelda.getAccessibleContext().setAccessibleParent(OctavaCelda);
        NovenaCelda.getAccessibleContext().setAccessibleName("NovenaCelda");
        NovenaCelda.getAccessibleContext().setAccessibleParent(NovenaCelda);
        SeptimaCelda.getAccessibleContext().setAccessibleName("SeptimaCelda");
        SeptimaCelda.getAccessibleContext().setAccessibleDescription("");
        SeptimaCelda.getAccessibleContext().setAccessibleParent(SeptimaCelda);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setText("Gatito Argentino");

        reinicio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reinicio.setText("Reiniciar");
        reinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reinicioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pacman.png"))); // NOI18N

        fan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        fan.setForeground(new java.awt.Color(0, 102, 255));
        fan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fantasmaanaranjado64px.jpg"))); // NOI18N

        VictoriasX.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        VictoriasX.setForeground(new java.awt.Color(0, 102, 255));
        VictoriasX.setText("0");

        VictoriasO.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        VictoriasO.setForeground(new java.awt.Color(0, 102, 255));
        VictoriasO.setText("0");

        detalles.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        detalles.setText("Detalles del Juego");
        detalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detallesActionPerformed(evt);
            }
        });

        salir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        Creditos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Creditos.setText("Creditos");
        Creditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditosActionPerformed(evt);
            }
        });

        inicia.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        inicia.setForeground(new java.awt.Color(0, 102, 255));
        inicia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pacman.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("=");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 255));
        jLabel6.setText("=");

        Turno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pacman.png"))); // NOI18N

        Turno1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Turno1.setForeground(new java.awt.Color(0, 102, 255));
        Turno1.setText("Turno de");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Inicia");

        javax.swing.GroupLayout imagenLayout = new javax.swing.GroupLayout(imagen);
        imagen.setLayout(imagenLayout);
        imagenLayout.setHorizontalGroup(
            imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imagenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(imagenLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addGroup(imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fan, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(30, 30, 30)
                        .addGroup(imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(VictoriasX, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VictoriasO, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imagenLayout.createSequentialGroup()
                        .addGroup(imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(imagenLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(imagenLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel2))
                                    .addGroup(imagenLayout.createSequentialGroup()
                                        .addComponent(inicia)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(imagenLayout.createSequentialGroup()
                                .addComponent(Turno1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Turno, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 43, Short.MAX_VALUE)))
                        .addGap(601, 601, 601)))
                .addGroup(imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Creditos, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(reinicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(detalles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(56, 56, 56))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imagenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(383, 383, 383))
        );
        imagenLayout.setVerticalGroup(
            imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imagenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(imagenLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(imagenLayout.createSequentialGroup()
                                .addComponent(Creditos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(detalles, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(reinicio))
                            .addGroup(imagenLayout.createSequentialGroup()
                                .addGroup(imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(imagenLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(VictoriasX)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(imagenLayout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(fan))
                                    .addGroup(imagenLayout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addGroup(imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(VictoriasO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imagenLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(imagenLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imagenLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inicia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Turno, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(Turno1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        reinicio.getAccessibleContext().setAccessibleName("reinicio");
        VictoriasX.getAccessibleContext().setAccessibleName("VictoriasX");
        VictoriasO.getAccessibleContext().setAccessibleName("VictoriasO");
        detalles.getAccessibleContext().setAccessibleName("detalles");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        imagen.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditosActionPerformed
        Creditos abrir = new Creditos();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CreditosActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void detallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detallesActionPerformed
        Detalles abrir = new Detalles();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_detallesActionPerformed

    private void reinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reinicioActionPerformed
        for (int i = 0; i < lbs.length; i++) {
            lbs[i].setIcon(null);
            lbs[i].setBackground(new Color(204, 255, 255));
        }
        turno = siguientejuego;
        if (siguientejuego.equals(FANTASMA)) {
            siguientejuego = PACMAN;
        } else {
            siguientejuego = FANTASMA;
        }

        inicia.setIcon(turno);
        estado = true;
    }//GEN-LAST:event_reinicioActionPerformed

    private void PrimerCeldaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrimerCeldaMouseClicked
        mover(1);
        PrimerCelda.setEnabled(false);
    }//GEN-LAST:event_PrimerCeldaMouseClicked

    private void TercerCeldaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TercerCeldaMouseClicked
        mover(3);
        TercerCelda.setEnabled(false);
    }//GEN-LAST:event_TercerCeldaMouseClicked

    private void CuartaCeldaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CuartaCeldaMouseClicked
        mover(4);
        CuartaCelda.
    }//GEN-LAST:event_CuartaCeldaMouseClicked

    private void QuintaCeldaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuintaCeldaMouseClicked
        mover(5);
    }//GEN-LAST:event_QuintaCeldaMouseClicked

    private void SegundaCeldaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SegundaCeldaMouseClicked
        mover(2);
    }//GEN-LAST:event_SegundaCeldaMouseClicked

    private void SextaCeldaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SextaCeldaMouseClicked
        mover(6);
    }//GEN-LAST:event_SextaCeldaMouseClicked

    private void OctavaCeldaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OctavaCeldaMouseClicked
        mover(8);
    }//GEN-LAST:event_OctavaCeldaMouseClicked

    private void NovenaCeldaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NovenaCeldaMouseClicked
        mover(9);
    }//GEN-LAST:event_NovenaCeldaMouseClicked

    private void SeptimaCeldaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeptimaCeldaMouseClicked
        mover(7);
    }//GEN-LAST:event_SeptimaCeldaMouseClicked

    public void mover(int casilla) {
        if (lbs[casilla - 1].getText().equals("") && estado) {
            lbs[casilla - 1].setIcon(turno);
            cambiarturno();
            
            comprobarganador();

        }
    }

    public void cambiarturno() {
        if (turno.equals(PACMAN)) {
            System.out.println("fantasma");
            turno = FANTASMA;

        } else {
            System.out.println("pacman");
            turno = PACMAN;
        }
        Turno.setIcon(turno);

    }


    public void comprobarganador() {

        for (int i = 0; i < win.length; i++) {
            if (lbs[win[i][0] - 1].getIcon() == (PACMAN)
                    && lbs[win[i][1] - 1].getIcon() == (PACMAN)
                    && lbs[win[i][2] - 1].getIcon() == (PACMAN)) {
                lbs[win[i][0] - 1].setBackground(Color.yellow);
                lbs[win[i][1] - 1].setBackground(Color.yellow);
                lbs[win[i][2] - 1].setBackground(Color.yellow);
                Icon fotoP = new ImageIcon(getClass().getResource("/imagenes/pacman.png"));
                VictoriasX.setText(Integer.toString(Integer.parseInt(VictoriasX.getText()) + 1));
                estado = false;
                JOptionPane.showMessageDialog(null, "Gano Pac-Man", "¡GANADOR!", JOptionPane.INFORMATION_MESSAGE, fotoP);
            }
            if (lbs[win[i][1] - 1].getIcon() == (FANTASMA)
                    && lbs[win[i][1] - 1].getIcon() == (FANTASMA)
                    && lbs[win[i][2] - 1].getIcon() == (FANTASMA)) {
                lbs[win[i][0] - 1].setBackground(Color.green);
                lbs[win[i][1] - 1].setBackground(Color.green);
                lbs[win[i][2] - 1].setBackground(Color.green);
                Icon fotoF = new ImageIcon(getClass().getResource("/imagenes/fantasmarojo64px.jpg"));
                VictoriasO.setText(Integer.toString(Integer.parseInt(VictoriasO.getText()) + 1));
                estado = false;
                JOptionPane.showMessageDialog(null, "Gano Fantasmita", "¡GANADOR!", JOptionPane.OK_OPTION, fotoF);
            }
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Creditos;
    public static javax.swing.JLabel CuartaCelda;
    public static javax.swing.JLabel NovenaCelda;
    public static javax.swing.JLabel OctavaCelda;
    public static javax.swing.JLabel PrimerCelda;
    public static javax.swing.JLabel QuintaCelda;
    public static javax.swing.JLabel SegundaCelda;
    public static javax.swing.JLabel SeptimaCelda;
    public static javax.swing.JLabel SextaCelda;
    public static javax.swing.JLabel TercerCelda;
    private javax.swing.JLabel Turno;
    private javax.swing.JLabel Turno1;
    private javax.swing.JLabel VictoriasO;
    private javax.swing.JLabel VictoriasX;
    private javax.swing.JButton detalles;
    private javax.swing.JLabel fan;
    private javax.swing.JPanel imagen;
    private javax.swing.JLabel inicia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton reinicio;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondo-de-textura-papel-blanco-agrupado-kraft-horizontal-con-diseño-único-estilo-suave-natural-para-estética-estético-creativo-200245101.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);
            super.paint(g);
        }
    }
}
