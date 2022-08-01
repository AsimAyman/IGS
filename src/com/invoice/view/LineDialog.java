/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invoice.view;

import com.invoice.MyFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class LineDialog extends JDialog{
    private JTextField itemNameFd;
    private JTextField itemCountFd;
    private JTextField itemPriceFd;
    private JLabel itemNameLbl;
    private JLabel itemCountLbl;
    private JLabel itemPriceLbl;
    private JButton okBtn;
    private JButton cancelBtn;
    
    public LineDialog(MyFrame frame) {
        itemNameFd = new JTextField(20);
        itemNameLbl = new JLabel("Item Name");
        
        itemCountFd = new JTextField(20);
        itemCountLbl = new JLabel("Item Count");
        
        itemPriceFd = new JTextField(20);
        itemPriceLbl = new JLabel("Item Price");
        
        okBtn = new JButton("OK");
        cancelBtn = new JButton("Cancel");
        
        okBtn.setActionCommand("createLineOK");
        cancelBtn.setActionCommand("createLineCancel");
        
        okBtn.addActionListener(frame);
        cancelBtn.addActionListener(frame);
        setLayout(new GridLayout(4, 2));
        
        add(itemNameLbl);
        add(itemNameFd);
        add(itemCountLbl);
        add(itemCountFd);
        add(itemPriceLbl);
        add(itemPriceFd);
        add(okBtn);
        add(cancelBtn);
        
        pack();
    }

    public JTextField getItemNameField() {
        return itemNameFd;
    }

    public JTextField getItemCountField() {
        return itemCountFd;
    }

    public JTextField getItemPriceField() {
        return itemPriceFd;
    }
}
