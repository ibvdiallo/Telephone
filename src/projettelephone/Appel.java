
package projettelephone;

public class Appel {
    private String numeroAppelant;
    
    private String numeroRecevant;

    public Appel() {
    }
    
    public void  Appeler(String numeroAppelant, String numeroRecevant) {
        this.numeroAppelant = numeroAppelant;
        this.numeroRecevant = numeroRecevant;
    }
    
}
