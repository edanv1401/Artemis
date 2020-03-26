
package com.artemis.test;

import javax.swing.UIManager;


public class listLandF {

 
    public static void main(String[] args) {

        UIManager.LookAndFeelInfo[] lafInfo = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo lookAndFeelInfo : lafInfo) {
            System.out.println(lookAndFeelInfo.getName());
        }
    }

}
