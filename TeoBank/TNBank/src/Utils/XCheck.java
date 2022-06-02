/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import javax.swing.JTextField;

/**
 *
 * @author vietm
 */
public class XCheck {

    public static void read(JTextField txt, int type) {
        if (type == 0) {
            String pattern = "^[0-9]+$";
            if (!txt.getText().matches(pattern)) {
                try {
                    txt.setText(txt.getText().substring(0, txt.getText().length() - txt.getText().length()));
                } catch (Exception e) {
                }
            }
        }
        if (type == 1) {
            String pattern = "^[a-zA-Z ]+$";
            if (!txt.getText().matches(pattern) && type == 1) {
                try {
                    txt.setText(txt.getText().substring(0, txt.getText().length() - txt.getText().length()));
                } catch (Exception e) {
                }
            }
        }
    }
}
