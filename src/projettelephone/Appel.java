/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projettelephone;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ibrahim
 */
public class Appel {
    private String numeroCible;
    private List<Appel> listeAppels = new ArrayList<>();
    
    private String type;
    private int duree;
    private int cout;
    private LocalDateTime date;

    // Constructeur, getters et setters

    // Exemple de constructeur
    public Appel(String numeroCible, String type, int duree, int cout, LocalDateTime date) {
        this.numeroCible = numeroCible;
        this.type = type;
        this.duree = duree;
        this.cout = cout;
        this.date = date;
    }

    // Getters et setters pour les propriétés de l'appel
    // ..

    public Appel() {
        
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
