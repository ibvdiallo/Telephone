/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projettelephone;

import javax.swing.JPanel;

/**
 *
 * @author Eclipse
 */
public interface IAppel {
    public void onClickDecrocher(String phoneSourceTitle);
    public void onClickCouper(String phoneSourceTitle);
    public void onClickAppeler(String phoneSourceTitle);
    public void onClickFermer(String phoneSourceTitle);
}
