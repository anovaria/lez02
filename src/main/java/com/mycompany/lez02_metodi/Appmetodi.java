package com.mycompany.lez02_metodi;

import javax.swing.JOptionPane;

public class Appmetodi {

    public static void main(String[] args) {
        int val1 = Utils.AskInt("Dimmi quantità,1,100");
        float val2 = Utils.AskFloat("Dimmi il peso",0,20);
        float ris = val1 * val2;
        JOptionPane.showMessageDialog(null, ris);
    }

}
