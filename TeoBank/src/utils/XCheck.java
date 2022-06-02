/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import javax.swing.JTextField;

/**
 *
 * @author thaip
 */
public class XCheck {
    public static void read(JTextField txt, int type){
        if (type == 0){
            String pattern = "^[0-9]+$";
            if (!txt.getText().matches(pattern)){
                try {
                    txt.setText(txt.getText().substring(0, txt.getText().length()-1));
                } catch (Exception e) {}
            }
        }
        if (type == 1){
            String pattern = "^[a-zA-Z ]+$";
            if (!txt.getText().matches(pattern) && type == 1){
                try {
                    txt.setText(txt.getText().substring(0, txt.getText().length()-1));
                } catch (Exception e) {}
            }
        }
    }
}
