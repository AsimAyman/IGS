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

public class HeaderDialog extends JDialog {
    private JTextField custNameFd;
    private JTextField invDateFd;
    private JLabel custNameLbl;
    private JLabel invDateLbl;
    private JButton okBtn;
    private JButton cancelBtn;

    public HeaderDialog(MyFrame frame) {
        custNameLbl = new JLabel("Customer Name:");
        custNameFd = new JTextField(20);
        invDateLbl = new JLabel("Invoice Date:");
        invDateFd = new JTextField(20);
        okBtn = new JButton("OK");
        cancelBtn = new JButton("Cancel");
        
        okBtn.setActionCommand("createInvOK");
        cancelBtn.setActionCommand("createInvCancel");
        
        okBtn.addActionListener(frame);
        cancelBtn.addActionListener(frame);
        setLayout(new GridLayout(3, 2));
        
        add(invDateLbl);
        add(invDateFd);
        add(custNameLbl);
        add(custNameFd);
        add(okBtn);
        add(cancelBtn);
        
        pack();
        
    }

    public JTextField getCustNameFd() {
        return custNameFd;
    }

    public JTextField getInvDateFd() {
        return invDateFd;
    }
    
}
