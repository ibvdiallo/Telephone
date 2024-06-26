/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projettelephone;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;


        public class FenetreTelephone extends javax.swing.JFrame {
            private AppelEntrant appelEntrant = new AppelEntrant();    
            private AppelSortant appelSortant = new AppelSortant();
            private String numero;
            private static IAppel listener;
            LocalDateTime now = LocalDateTime.now();
            private ArrayList<String> historique;
            public final ArrayList<Appel> listeAppels = new ArrayList<>();
            //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy, HH'h' mm' '");
            //  String formattedDateTime = now.format(formatter);
             
            private ArrayList<String> messageBox;
            private String nom;
            
            public FenetreTelephone(Date date) {
            initComponents();
            this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
             this.historique = new ArrayList<>(10);  
            // Créer un Timer pour mettre à jour l'heure toutes les secondes
            Timer timer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    updateTime();
                }
            });
            timer.start();
        }

        // Méthode pour mettre à jour l'heure
        private void updateTime() {
            // Obtenir la date et l'heure actuelles
            LocalDateTime maintenant = LocalDateTime.now();
            // Formater la date et l'heure
             DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy, HH'h' mm' 'ss' '");
            String formattedDateTime = formatter.format(maintenant);
            // Mettre à jour le texte de l'heure dans le JLabel vtime
            vtime.setText(formattedDateTime);
            // Centrer le texte horizontalement dans le JLabel vtime
            vtime.setHorizontalAlignment(SwingConstants.CENTER);
        }
      public String getNumero() {
        return numero;
    }

  
    public String getNom() {
        return nom;
    }
     public void setNumero(String numero) {
        this.numero = numero;
    }



    public void setNom(String nom) {
        this.nom = nom;
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        resultat = new javax.swing.JTextField();
        n1 = new javax.swing.JButton();
        n2 = new javax.swing.JButton();
        n3 = new javax.swing.JButton();
        n4 = new javax.swing.JButton();
        n5 = new javax.swing.JButton();
        n6 = new javax.swing.JButton();
        n7 = new javax.swing.JButton();
        n8 = new javax.swing.JButton();
        n9 = new javax.swing.JButton();
        etoile = new javax.swing.JButton();
        n0 = new javax.swing.JButton();
        nguess = new javax.swing.JButton();
        btnEnregistrer = new javax.swing.JButton();
        btnAppeler = new javax.swing.JButton();
        btnEffacer = new javax.swing.JButton();
        btnClavier1 = new javax.swing.JButton();
        btnHistorique1 = new javax.swing.JButton();
        btnContacts1 = new javax.swing.JButton();
        vtime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        resultat.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        resultat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultatActionPerformed(evt);
            }
        });

        n1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n1.setText("1");
        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });

        n2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n2.setText("2");
        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });

        n3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n3.setText("3");
        n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n3ActionPerformed(evt);
            }
        });

        n4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n4.setText("4");
        n4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n4ActionPerformed(evt);
            }
        });

        n5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n5.setText("5");
        n5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n5ActionPerformed(evt);
            }
        });

        n6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n6.setText("6");
        n6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n6ActionPerformed(evt);
            }
        });

        n7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n7.setText("7");
        n7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n7ActionPerformed(evt);
            }
        });

        n8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n8.setText("8");
        n8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n8ActionPerformed(evt);
            }
        });

        n9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n9.setText("9");
        n9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n9ActionPerformed(evt);
            }
        });

        etoile.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        etoile.setText("*");
        etoile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etoileMouseClicked(evt);
            }
        });
        etoile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etoileActionPerformed(evt);
            }
        });

        n0.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n0.setText("0");
        n0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n0ActionPerformed(evt);
            }
        });

        nguess.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nguess.setText("#");
        nguess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nguessActionPerformed(evt);
            }
        });

        btnEnregistrer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEnregistrer.setText("Enregister");
        btnEnregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnregistrerActionPerformed(evt);
            }
        });

        btnAppeler.setBackground(new java.awt.Color(102, 255, 102));
        btnAppeler.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAppeler.setText("Appeler");
        btnAppeler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppelerActionPerformed(evt);
            }
        });

        btnEffacer.setBackground(new java.awt.Color(255, 51, 0));
        btnEffacer.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnEffacer.setText("Effacer");
        btnEffacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEffacerActionPerformed(evt);
            }
        });

        btnClavier1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnClavier1.setText("Clavier");
        btnClavier1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClavier1ActionPerformed(evt);
            }
        });

        btnHistorique1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnHistorique1.setText("Historique");
        btnHistorique1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorique1ActionPerformed(evt);
            }
        });

        btnContacts1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnContacts1.setText("Contacts");
        btnContacts1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContacts1ActionPerformed(evt);
            }
        });

        vtime.setBackground(new java.awt.Color(102, 102, 255));
        vtime.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        vtime.setForeground(new java.awt.Color(255, 255, 255));
        vtime.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vtime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEnregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etoile, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(n8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addComponent(n9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(n0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAppeler, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnEffacer, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(nguess, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(n3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnClavier1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHistorique1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnContacts1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(resultat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(vtime, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etoile, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n0, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nguess, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAppeler, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEffacer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClavier1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHistorique1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnContacts1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAppeler, btnClavier1, btnContacts1, btnEffacer, btnEnregistrer, btnHistorique1, etoile, n0, n1, n2, n3, n4, n5, n6, n7, n8, n9, nguess});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHistorique1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorique1ActionPerformed
        listener.onClickHistorique(this.getTitle());
    }//GEN-LAST:event_btnHistorique1ActionPerformed

    private void btnClavier1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClavier1ActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_btnClavier1ActionPerformed

    private void btnEffacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEffacerActionPerformed
        // TODO add your handling code here:
        this.resultat.setText("");
    }//GEN-LAST:event_btnEffacerActionPerformed

    private void btnAppelerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppelerActionPerformed
        // TODO add your handling code here:
        //interfaceAppel.appeler();
    String numeroCible = resultat.getText(); // Récupérer le numéro cible depuis le champ resultat
    if (!numeroCible.isEmpty()) {
        listener.onClickAppeler(this.getTitle().substring(6), numeroCible);
    }

    }//GEN-LAST:event_btnAppelerActionPerformed

    private void nguessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nguessActionPerformed
        // TODO add your handling code here:
        this.resultat.setText(this.resultat.getText() + nguess.getText());
    }//GEN-LAST:event_nguessActionPerformed

    private void n0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n0ActionPerformed
        // TODO add your handling code here:
        this.resultat.setText(this.resultat.getText() + n0.getText());
    }//GEN-LAST:event_n0ActionPerformed

    private void etoileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etoileActionPerformed
        // TODO add your handling code here:
        this.resultat.setText(this.resultat.getText() + etoile.getText());
    }//GEN-LAST:event_etoileActionPerformed

    private void etoileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etoileMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_etoileMouseClicked

    private void n9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n9ActionPerformed
        // TODO add your handling code here:
        this.resultat.setText(this.resultat.getText() + n9.getText());
    }//GEN-LAST:event_n9ActionPerformed

    private void n8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n8ActionPerformed
        // TODO add your handling code here:
        this.resultat.setText(this.resultat.getText() + n8.getText());
    }//GEN-LAST:event_n8ActionPerformed

    private void n7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n7ActionPerformed
        // TODO add your handling code here:
        this.resultat.setText(this.resultat.getText() + n7.getText());
    }//GEN-LAST:event_n7ActionPerformed

    private void n6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n6ActionPerformed
        // TODO add your handling code here:
        this.resultat.setText(this.resultat.getText() + n6.getText());
    }//GEN-LAST:event_n6ActionPerformed

    private void n5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n5ActionPerformed
        // TODO add your handling code here:
        this.resultat.setText(this.resultat.getText() + n5.getText());
    }//GEN-LAST:event_n5ActionPerformed

    private void n4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n4ActionPerformed
        // TODO add your handling code here:
        this.resultat.setText(this.resultat.getText() + n4.getText());
    }//GEN-LAST:event_n4ActionPerformed

    private void n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n3ActionPerformed
        // TODO add your handling code here:
        this.resultat.setText(this.resultat.getText() + n3.getText());
    }//GEN-LAST:event_n3ActionPerformed

    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ActionPerformed
        // TODO add your handling code here:
        this.resultat.setText(this.resultat.getText() + n2.getText());
    }//GEN-LAST:event_n2ActionPerformed

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
        // TODO add your handling code here:
        this.resultat.setText(this.resultat.getText() + n1.getText());
    }//GEN-LAST:event_n1ActionPerformed

    private void resultatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultatActionPerformed

    private void btnEnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnregistrerActionPerformed
        // TODO add your handling code here:
        String monContact = JOptionPane.showInputDialog(rootPane,"Nom Contact","Creation d'un Contact",JOptionPane.QUESTION_MESSAGE);
        Contact contact = new Contact(resultat.getText(), monContact);
        listener.onClickEnregistrerContact(this.getTitle(), contact);
    }//GEN-LAST:event_btnEnregistrerActionPerformed

    private void btnContacts1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContacts1ActionPerformed
        // TODO add your handling code here:
        /*
        if(ListeContacts.isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Aucun contact");
          
        } else {
            AfficheContact affiche =new AfficheContact(getNom(),getNumero());
            affiche.setVisible(true);
            affiche.setTitle(this.getNumero());
            JTextArea textAreaContact = affiche.getTextAreaContact();

            StringBuilder textAffichage = new StringBuilder();
            for (Contact c : ListeContacts){
                textAffichage.append("Nom: ").append(c.getNom()).append("\nNumero : ").append(c.getNumero()).append("\n\n");
            }
            textAreaContact.setText(textAffichage.toString());
        }
        */
        listener.onClickAfficherContacts(this.getTitle());
    }//GEN-LAST:event_btnContacts1ActionPerformed

    public static void setListener(IAppel listener) {
        FenetreTelephone.listener = listener;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAppeler;
    private javax.swing.JButton btnClavier1;
    private javax.swing.JButton btnContacts1;
    private javax.swing.JButton btnEffacer;
    private javax.swing.JButton btnEnregistrer;
    private javax.swing.JButton btnHistorique1;
    private javax.swing.JButton etoile;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton n0;
    private javax.swing.JButton n1;
    private javax.swing.JButton n2;
    private javax.swing.JButton n3;
    private javax.swing.JButton n4;
    private javax.swing.JButton n5;
    private javax.swing.JButton n6;
    private javax.swing.JButton n7;
    private javax.swing.JButton n8;
    private javax.swing.JButton n9;
    private javax.swing.JButton nguess;
    private javax.swing.JTextField resultat;
    private javax.swing.JLabel vtime;
    // End of variables declaration//GEN-END:variables

}
