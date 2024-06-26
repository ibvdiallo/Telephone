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
import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class CreerTelephone extends javax.swing.JFrame implements IAppel {
    private JFrame telephone1 = null, telephone2 = null;
    private AppelEntrant appelEntrant = new AppelEntrant();    
    private AppelSortant appelSortant = new AppelSortant();
    private AppelEnCours appelEnCours1;
    private AppelEnCours appelEnCours2;
    private Historique historique1 = new Historique();
    private Historique historique2 = new Historique();
    private List<String> historiqueTelephone1 = new ArrayList<>();
    private List<String> historiqueTelephone2 = new ArrayList<>();
    private List<Contact> listeContacts1 = new ArrayList<>();
    private List<Contact> listeContacts2 = new ArrayList<>();
    private ContactsEnregistres contactsEnregistres1;
    private ContactsEnregistres contactsEnregistres2;
    private JPanel paneParentTelephone1;
    private JPanel paneParentTelephone2;
  //  private Historique historique = new Historique();
    private List<String> numerosCrees = new ArrayList<>();
    
    private List<Appel> listeAppels = new ArrayList<>();
    private String numeroCible; // Ajout de la variable numeroCible
    private static Clip clip;
    int dureeAppel = 0;
    private boolean isTelephone1EmitCall = false;
    
    private Timer timer;
    private String numero;
    private List<Contact> listeContactsTelephone1;
    private List<Contact> listeContactsTelephone2;
    private Date date;
    
    public CreerTelephone() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNumero = new javax.swing.JTextField();
        btnCreerPhone = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCreerPhone.setText("Creer");
        btnCreerPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreerPhoneActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Veuillez Saisir Un numero");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCreerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCreerPhone)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreerPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreerPhoneActionPerformed
        // TODO add your handling code here:
            if (telephone1 == null) {
        String numero = txtNumero.getText();
        //if (validerNumero(numero)) {
            telephone1 = new FenetreTelephone(date);
            FenetreTelephone.setListener(this);
            telephone1.setVisible(true);
            paneParentTelephone1 = (JPanel) telephone1.getContentPane();
            this.numero = numero;
            telephone1.setTitle("Tel : " + this.numero);
            txtNumero.setText("");
            
            // Ajouter le numéro de téléphone à la liste des numéros créés
            numerosCrees.add(numero);
            
        //} else {
        //    JOptionPane.showMessageDialog(this, "Le numéro de téléphone doit respecter le format spécifié.", "Erreur de validation", JOptionPane.ERROR_MESSAGE);
        //}
    } else {
        // Vérifier si telephone2 est null et créer un nouveau téléphone
        if (telephone2 == null) {
            String numero = txtNumero.getText();
            if (/*validerNumero(numero) &&*/ !numero.equals(this.numero)) {
                telephone2 = new FenetreTelephone(date);
                FenetreTelephone.setListener(this);
                telephone2.setVisible(true);
                paneParentTelephone2 = (JPanel) telephone2.getContentPane();
                this.numero = numero;
                telephone2.setTitle("Tel : " + this.numero);
                txtNumero.setText("");
                
                // Ajouter le numéro de téléphone à la liste des numéros créés
                numerosCrees.add(numero);
            } else {
                JOptionPane.showMessageDialog(this, "Le numéro de téléphone doit respecter le format spécifié et être différent du premier numéro.", "Erreur de validation", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this,"Impossible de créer un 3e téléphone");
        }
    }

    }//GEN-LAST:event_btnCreerPhoneActionPerformed
 private boolean validerNumero(String numero) {
        // Vérifier si le numéro contient exactement 9 chiffres
        //return numero.matches("\\d{9}");
        return numero.matches("((62[0-9])|(61[0-3])|(66[0-9]))[0-9][0-9][0-9][0-9][0-9][0-9]");
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
            java.util.logging.Logger.getLogger(CreerTelephone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreerTelephone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreerTelephone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreerTelephone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreerTelephone().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreerPhone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onClickDecrocher(String phoneSourceTitle) {
        clip.stop();
        appelEnCours1 = new AppelEnCours();
        appelEnCours2 = new AppelEnCours();
        
        if (phoneSourceTitle.equals(telephone1.getTitle())) {
            appelEnCours1.setNumero(telephone2.getTitle().substring(5));
            appelEnCours2.setNumero(phoneSourceTitle.substring(5));
        } else {
            appelEnCours2.setNumero(telephone1.getTitle().substring(5));
            appelEnCours1.setNumero(phoneSourceTitle.substring(5));
        }
        appelEnCours1.setListener(this);
        appelEnCours2.setListener(this);
        telephone1.setContentPane(appelEnCours1);
        telephone2.setContentPane(appelEnCours2);
        telephone1.setVisible(true);
        telephone2.setVisible(true);
        
        timer = new Timer(1000, (ActionEvent e) -> {
            dureeAppel++;
            if (dureeAppel < 10) {
                 appelEntrant.setNumeroEntrant("Appel Entrant \n" + telephone1.getTitle().substring(5));
                appelSortant.setNumeroSortant("Appel Sortant\n" + telephone2.getTitle().substring(5));
                appelEnCours1.setTemps("00:0" + String.valueOf(dureeAppel));
                appelEnCours2.setTemps("00:0" + String.valueOf(dureeAppel));
            } else {
                appelEntrant.setNumeroEntrant("Appel Entrant" + telephone2.getTitle().substring(5));
                appelSortant.setNumeroSortant("Appel Sortant" + telephone1.getTitle().substring(5));
                appelEnCours1.setTemps("00:" + String.valueOf(dureeAppel));
                appelEnCours2.setTemps("00:" + String.valueOf(dureeAppel));
            }
        });
        
        timer.start();
    }
    @Override
    public void onClickCouper(String phoneSourceTitle) {
        clip.close();
        timer.stop();
        telephone1.setContentPane(paneParentTelephone1);
        telephone2.setContentPane(paneParentTelephone2);

        double tauxParSeconde = 0.2; // Par exemple, un taux de 0.2 euro par seconde
        double coutAppel = dureeAppel * tauxParSeconde;
        // FenetreTelephone.addHistory(String.valueOf(dureeAppel), "sortant", phoneSourceTitle, coutAppel);

        DecimalFormat df = new DecimalFormat("#.##");
        String coutFormate = df.format(coutAppel);
        
        JOptionPane.showMessageDialog(this, "Appel terminé. Durée: " + dureeAppel + " secondes.", "FInd de l'appel",JOptionPane.INFORMATION_MESSAGE);
        if (isTelephone1EmitCall) {
            historiqueTelephone1.add("00:" + String.valueOf(dureeAppel) + " Sortant " + telephone2.getTitle().substring(5) + " " + coutAppel);
            historiqueTelephone2.add("00:" + String.valueOf(dureeAppel) + " Entrant " + telephone1.getTitle().substring(5) + " Cout : 0");
        } else {
            historiqueTelephone2.add("00:" + String.valueOf(dureeAppel) + " Sortant " + telephone1.getTitle().substring(5) + " " + coutAppel);
            historiqueTelephone1.add("00:" + String.valueOf(dureeAppel) + " Entrant " + telephone2.getTitle().substring(5) + " Cout : 0");
        }
        
        dureeAppel = 0;
   }
    public void addHistory(String text, String type, String numero, double cout) {
        String phoneSourceTitle = telephone1.getTitle().substring(5);
        String otherPhoneTitle = telephone2.getTitle().substring(5);
        String contact = type.equals("Sortant") ? otherPhoneTitle : phoneSourceTitle;
        //historique = new ArrayList<>();
        //historique.add("Appel " + type + " duree " + text + "\ncontact " + contact + ", coût : " + cout * 100
        //        + " GNF " + LocalDate.now() + "\n________________");
    }

    @Override
    public void onClickAppeler(String phoneSourceNumber, String numeroCible) {
    // Vérifier si le numéro cible correspond exactement au titre du téléphone
     // Vérifier si le numéro cible fait partie des numéros créés
     if (numerosCrees.contains(numeroCible)) {
        //Appel appel = new Appel();
        if (telephone2 != null && telephone2.getTitle().contains(numeroCible)) {
            for (Contact contact : listeContacts1) {
                if (contact.getNumero().equals(numeroCible)) {
                    numeroCible = contact.getNom();
                }
            }
            
            for (Contact contact : listeContacts2) {
                if (contact.getNumero().equals(phoneSourceNumber)) {
                    phoneSourceNumber = contact.getNom();
                }
            }
            
            appelEntrant.setNumeroEntrant("Appel Entrant \n" + phoneSourceNumber);
            appelSortant.setNumeroSortant("Appel Sortant \n" + numeroCible );
            appelEntrant.setListener(this);
            appelSortant.setListener(this);
            telephone1.setContentPane(appelSortant); // Inverser l'affichage sur telephone1
            telephone1.setVisible(true);
            telephone2.setContentPane(appelEntrant); // Inverser l'affichage sur telephone2
            telephone2.setVisible(true);
            this.isTelephone1EmitCall = true;
        } else if (telephone1 != null && telephone1.getTitle().contains(numeroCible)) {
            for (Contact contact : listeContacts2) {
                if (contact.getNumero().equals(numeroCible)) {
                    numeroCible = contact.getNom();
                }
            }
            
            for (Contact contact : listeContacts1) {
                if (contact.getNumero().equals(phoneSourceNumber)) {
                    phoneSourceNumber = contact.getNom();
                }
            }
            
            appelEntrant.setNumeroEntrant("Appel Entrant \n" + phoneSourceNumber);
            appelSortant.setNumeroSortant("Appel Sortant \n" +numeroCible );
            appelEntrant.setListener(this);
            appelSortant.setListener(this);
            telephone2.setContentPane(appelSortant); // Inverser l'affichage sur telephone2
            telephone2.setVisible(true);
            telephone1.setContentPane(appelEntrant); // Inverser l'affichage sur telephone1
            telephone1.setVisible(true);
            this.isTelephone1EmitCall = false;

        } else {
            JOptionPane.showMessageDialog(this, "Une erreur s'est produite lors de l'appel.", "Erreur", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //listeAppels.add(appel);
         CreerTelephone.playSound("sone.wav");
    } else {
        JOptionPane.showMessageDialog(this, "Le numéro cible n'existe pas parmi les téléphones créés.", "Erreur", JOptionPane.ERROR_MESSAGE);
    }
}



    @Override
    public void onClickFermer(String phoneSourceTitle) {
        clip.close();
        telephone1.setContentPane(paneParentTelephone1);
        telephone2.setContentPane(paneParentTelephone2);
    
      /*  if (phoneSourceTitle.equals(telephone1.getTitle())) {
            telephone1.setContentPane(paneParentTelephone1);
        } else { 
            telephone2.setContentPane(paneParentTelephone2);
        }*/
    }
    
     public static void playSound(String soundFilePath) {
        try {
            File soundFile = new File(soundFilePath);
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(soundFile));
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onClickAfficherContacts(String phoneSourceTitle) {
        if (telephone1.getTitle().equals(phoneSourceTitle)) {
            contactsEnregistres1 = new ContactsEnregistres();
            contactsEnregistres1.setListener(this);
            paneParentTelephone1 = (JPanel) telephone1.getContentPane();
            contactsEnregistres1.setListContacts(listeContacts1);
            telephone1.setContentPane(contactsEnregistres1);
            telephone1.setVisible(true);
        } else {
            contactsEnregistres2 = new ContactsEnregistres();
            contactsEnregistres2.setListener(this);
            paneParentTelephone2 = (JPanel) telephone2.getContentPane();
            contactsEnregistres2.setListContacts(listeContacts2);
            telephone2.setContentPane(contactsEnregistres2);
            telephone2.setVisible(true);
        }
    }

    @Override
    public void onClickHistorique(String phoneSourceTitle) {
        if (telephone1.getTitle().equals(phoneSourceTitle)) {
            historique1.setListHistorique(historiqueTelephone1);
            historique1.setListener(this);
            paneParentTelephone1 = (JPanel) telephone1.getContentPane();
            telephone1.setContentPane(historique1);
            telephone1.setVisible(true);
        } else {
            historique2.setListHistorique(historiqueTelephone2);
            historique2.setListener(this);
            paneParentTelephone2 = (JPanel) telephone2.getContentPane();
            telephone2.setContentPane(historique2);
            telephone2.setVisible(true);
        }
    }
    
    @Override
    public void onClickFermerHistorique(String phoneSourceTitle) {
        if (telephone1.getTitle().equals(phoneSourceTitle)) {
            telephone1.setContentPane(paneParentTelephone1);
        } else {
            telephone2.setContentPane(paneParentTelephone2);
        }
    }
    
    @Override
    public void onClickEnregistrerContact(String phoneSourceTitle, Contact contact) {
        if (telephone1.getTitle().equals(phoneSourceTitle)) {
            listeContacts1.add(contact);
        } else {
            listeContacts2.add(contact);
        }
    }
}




