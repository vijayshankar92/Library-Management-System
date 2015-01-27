/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author VijayShankar
 */
public class TextLengthSet extends PlainDocument {

    private int length;
    private boolean toUppercase = false;

    TextLengthSet(int length) {
        super();
        this.length = length;
    }

    TextLengthSet(int length, boolean upper) {
        super();
        this.length = length;
        toUppercase = upper;
    }

    public void insertString(int offset, String str, AttributeSet attr)
            throws BadLocationException {
        if (str == null) {
            return;
        }

        if ((getLength() + str.length()) <= length) {
            if (toUppercase) {
                str = str.toUpperCase();
            }
            super.insertString(offset, str, attr);
        }
    }
}
