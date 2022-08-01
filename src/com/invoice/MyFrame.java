
package com.invoice;

import com.invoice.model.InvoiceHeader;
import com.invoice.model.InvoiceHeaderTableModel;
import com.invoice.model.InvoiceLine;
import com.invoice.model.InvoiceLineTableModel;
import com.invoice.view.HeaderDialog;
import com.invoice.view.LineDialog;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Assem
 */
public class MyFrame extends javax.swing.JFrame implements ActionListener, ListSelectionListener {
    public MyFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll1 = new javax.swing.JScrollPane();
        invoicesTable = new javax.swing.JTable();
        invoicesTable.getSelectionModel().addListSelectionListener(this);
        createInvoiceButton = new javax.swing.JButton();
        createInvoiceButton.addActionListener(this);
        deleteInvoiceButton = new javax.swing.JButton();
        deleteInvoiceButton.addActionListener(this);
        Label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        Label4 = new javax.swing.JLabel();
        invCustomerNameValTxt = new javax.swing.JTextField();
        invDateValTxt = new javax.swing.JTextField();
        invNumValTable = new javax.swing.JLabel();
        invTotalValLable = new javax.swing.JLabel();
        scroll2 = new javax.swing.JScrollPane();
        invoiceTable = new javax.swing.JTable();
        createLineButton = new javax.swing.JButton();
        createLineButton.addActionListener(this);
        deleteLineButton = new javax.swing.JButton();
        deleteLineButton.addActionListener(this);
        menuBar = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        loadMenuItem = new javax.swing.JMenuItem();
        loadMenuItem.addActionListener(this);
        saveMenuItem = new javax.swing.JMenuItem();
        saveMenuItem.addActionListener(this);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invoicesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scroll1.setViewportView(invoicesTable);

        createInvoiceButton.setText("Create New Invoice");
        createInvoiceButton.setActionCommand("CreateNewInvoice");

        deleteInvoiceButton.setText("Delete Invoice");
        deleteInvoiceButton.setActionCommand("DeleteInvoice");

        Label1.setText("Invoice Number");

        Label2.setText("Invoide Date");

        Label3.setText("Customer name");

        Label4.setText("Invoice Total");

        invoiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scroll2.setViewportView(invoiceTable);

        createLineButton.setText("Create New Line");
        createLineButton.setActionCommand("CreateNewLine");

        deleteLineButton.setText("Delete Line");
        deleteLineButton.setActionCommand("DeleteLine");

        Menu.setText("File");

        loadMenuItem.setText("Load File");
        loadMenuItem.setActionCommand("LoadFile");
        Menu.add(loadMenuItem);

        saveMenuItem.setText("Save File");
        saveMenuItem.setActionCommand("SaveFile");
        Menu.add(saveMenuItem);

        menuBar.add(Menu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Label3)
                                            .addComponent(Label1)
                                            .addComponent(Label2)
                                            .addComponent(Label4))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(invCustomerNameValTxt)
                                            .addComponent(invDateValTxt)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(invNumValTable)
                                                    .addComponent(invTotalValLable))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(scroll2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(createLineButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteLineButton)
                                .addGap(113, 113, 113))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(createInvoiceButton)
                        .addGap(87, 87, 87)
                        .addComponent(deleteInvoiceButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label1)
                            .addComponent(invNumValTable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label2)
                            .addComponent(invDateValTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label3)
                            .addComponent(invCustomerNameValTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label4)
                            .addComponent(invTotalValLable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(scroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createLineButton)
                            .addComponent(deleteLineButton))
                        .addGap(44, 44, 44)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteInvoiceButton)
                    .addComponent(createInvoiceButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createInvoiceButton;
    private javax.swing.JButton createLineButton;
    private javax.swing.JTextField invCustomerNameValTxt;
    private javax.swing.JButton deleteInvoiceButton;
    private javax.swing.JButton deleteLineButton;
    private javax.swing.JTextField invDateValTxt;
    private javax.swing.JTable invoiceTable;
    private javax.swing.JLabel invNumValTable;
    private javax.swing.JLabel invTotalValLable;
    private javax.swing.JTable invoicesTable;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;

    private javax.swing.JMenu Menu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JScrollPane scroll1;
    private javax.swing.JScrollPane scroll2;
    private javax.swing.JMenuItem loadMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables
    private DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    private List<InvoiceHeader> invoiceHeaderLists = new ArrayList<>();
    private InvoiceHeaderTableModel headerInvoiceHeaderTableModel;
    private InvoiceLineTableModel invoiceLieTableModel;
    private HeaderDialog headerDialog;
    private LineDialog lineDialog;

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "CreateNewInvoice":
                showNewInvoDialog();
                break;
            case "DeleteInvoice":
                deleteInvoice();
                break;
            case "CreateNewLine":
                showLineDialog();
                break;
            case "DeleteLine":
                deleteLine();
                break;
            case "LoadFile":
                loadFile();
                break;
            case "SaveFile":
                saveData();
                break;
            case "createInvCancel":
                createInvCancel();
                break;
            case "createInvOK":
                createInvOK();
                break;
            case "createLineCancel":
                createLineCancel();
                break;
            case "createLineOK":
                createLineOK();
                break;
        }
    }



    private void saveData() {
        String headers = "";
        String lines = "";
        for (InvoiceHeader header : invoiceHeaderLists) {
            headers += header.getDataCsv();
            headers += "\n";
            for (InvoiceLine line : header.getInvoiceLines()) {
                lines += line.getDataCsv();
                lines += "\n";
            }
        }
        JOptionPane.showMessageDialog(this, "Please, select file to save header data!", "Attension", JOptionPane.WARNING_MESSAGE);
        JFileChooser fc = new JFileChooser();
        int result = fc.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File headerFile = fc.getSelectedFile();
            try {
                FileWriter hfw = new FileWriter(headerFile);
                hfw.write(headers);
                hfw.flush();
                hfw.close();

                JOptionPane.showMessageDialog(this, "Please, select file to save lines data!", "Attension", JOptionPane.WARNING_MESSAGE);
                result = fc.showSaveDialog(this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File linesFile = fc.getSelectedFile();
                    FileWriter lfw = new FileWriter(linesFile);
                    lfw.write(lines);
                    lfw.flush();
                    lfw.close();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }
    private void loadFile() {
        JOptionPane.showMessageDialog(this, "Please, select header file!", "Attension", JOptionPane.WARNING_MESSAGE);
        JFileChooser openFile = new JFileChooser();
        int result = openFile.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File headerFile = openFile.getSelectedFile();
            try {
                FileReader fr = new FileReader(headerFile);
                BufferedReader br = new BufferedReader(fr);
                String headerLine = null;

                while ((headerLine = br.readLine()) != null) {
                    String[] headerParts = headerLine.split(",");
                    String invNumStr = headerParts[0];
                    String invoiceDate = headerParts[1];
                    String customerName = headerParts[2];

                    int invNum = Integer.parseInt(invNumStr);
                    Date invDate = df.parse(invoiceDate);

                    InvoiceHeader inv = new InvoiceHeader(invNum, customerName, invDate);
                    invoiceHeaderLists.add(inv);
                }

                JOptionPane.showMessageDialog(this, "Please, select lines file!", "Attension", JOptionPane.WARNING_MESSAGE);
                result = openFile.showOpenDialog(this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File linesFile = openFile.getSelectedFile();
                    BufferedReader brLine = new BufferedReader(new FileReader(linesFile));
                    String linesLine = null;
                    while ((linesLine = brLine.readLine()) != null) {
                        String[] lineParts = linesLine.split(",");
                        String invNumStr = lineParts[0];
                        String itemName = lineParts[1];
                        String itemPriceStr = lineParts[2];
                        String itemCountStr = lineParts[3];

                        int invNum = Integer.parseInt(invNumStr);
                        double itemPrice = Double.parseDouble(itemPriceStr);
                        int itemCount = Integer.parseInt(itemCountStr);
                        InvoiceHeader header = findInvoiceByNum(invNum);
                        InvoiceLine invLine = new InvoiceLine(itemName, itemPrice, itemCount, header);
                        header.getInvoiceLines().add(invLine);
                    }
                    headerInvoiceHeaderTableModel = new InvoiceHeaderTableModel(invoiceHeaderLists);
                    invoicesTable.setModel(headerInvoiceHeaderTableModel);
                    invoicesTable.validate();
                }
                System.out.println("Check");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

    }
    private void invoiceTableSelected() {
        int selectedRowIndex = invoicesTable.getSelectedRow();
        if (selectedRowIndex >= 0) {
            InvoiceHeader row = headerInvoiceHeaderTableModel.getInvoicesArray().get(selectedRowIndex);
            invCustomerNameValTxt.setText(row.getCustomerName());
            invDateValTxt.setText(df.format(row.getInvoiceDate()));
            invNumValTable.setText("" + row.getNum());
            
            invTotalValLable.setText("" + row.getLineTotal());
            ArrayList<InvoiceLine> lines = row.getInvoiceLines();
            invoiceLieTableModel = new InvoiceLineTableModel(lines);
            
            invoiceTable.setModel(invoiceLieTableModel);
            invoiceLieTableModel.fireTableDataChanged();
        }
    }


    @Override
    public void valueChanged(ListSelectionEvent e) {
        invoiceTableSelected();
    }
    private InvoiceHeader findInvoiceByNum(int invNum) {
        InvoiceHeader header = null;
        for (InvoiceHeader inv : invoiceHeaderLists) {
            if (invNum == inv.getNum()) {
                header = inv;
                break;
            }
        }
        return header;
    }




    private void createInvCancel() {
        headerDialog.setVisible(false);
        headerDialog.dispose();
        headerDialog = null;
    }

    private void createInvOK() {
        String custName = headerDialog.getCustNameFd().getText();
        String invDateStr = headerDialog.getInvDateFd().getText();
        headerDialog.setVisible(false);
        headerDialog.dispose();
        headerDialog = null;
        try {
            Date invDate = df.parse(invDateStr);
            int invNum = getNextInvNumber();
            InvoiceHeader newInvoiceHeader = new InvoiceHeader(invNum, custName, invDate);
            invoiceHeaderLists.add(newInvoiceHeader);
            headerInvoiceHeaderTableModel.fireTableDataChanged();
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

    }
    private void showNewInvoDialog() {
        headerDialog = new HeaderDialog(this);
        headerDialog.setVisible(true);
    }

    private void showLineDialog() {
        lineDialog = new LineDialog(this);
        lineDialog.setVisible(true);
    }

    private int getNextInvNumber() {
        int max = 0;
        for (InvoiceHeader header : invoiceHeaderLists) {
            if (header.getNum() > max) {
                max = header.getNum();
            }
        }
        return max + 1;
    }

    private void createLineCancel() {
        lineDialog.setVisible(false);
        lineDialog.dispose();
        lineDialog = null;
    }

    private void createLineOK() {
        String itemName = lineDialog.getItemNameField().getText();
        String itemCountStr = lineDialog.getItemCountField().getText();
        String itemPriceStr = lineDialog.getItemPriceField().getText();
        lineDialog.setVisible(false);
        lineDialog.dispose();
        lineDialog = null;
        int itemCount = Integer.parseInt(itemCountStr);
        double itemPrice = Double.parseDouble(itemPriceStr);
        int headerIndex = invoicesTable.getSelectedRow();
        InvoiceHeader invoice = headerInvoiceHeaderTableModel.getInvoicesArray().get(headerIndex);

        InvoiceLine invoiceLine = new InvoiceLine(itemName, itemPrice, itemCount, invoice);
        invoice.addLine(invoiceLine);
        invoiceLieTableModel.fireTableDataChanged();
        headerInvoiceHeaderTableModel.fireTableDataChanged();
        invTotalValLable.setText("" + invoice.getLineTotal());

    }


    private void deleteLine() {
        int lineIndx = invoiceTable.getSelectedRow();
        InvoiceLine line = invoiceLieTableModel.getInvoiceLines().get(lineIndx);
        invoiceLieTableModel.getInvoiceLines().remove(lineIndx);
        invoiceLieTableModel.fireTableDataChanged();
        headerInvoiceHeaderTableModel.fireTableDataChanged();
        invTotalValLable.setText("" + line.getInvoiceHeader().getLineTotal());

    }


    private void deleteInvoice() {
        int invIndex = invoicesTable.getSelectedRow();
        InvoiceHeader header = headerInvoiceHeaderTableModel.getInvoicesArray().get(invIndex);
        headerInvoiceHeaderTableModel.getInvoicesArray().remove(invIndex);
        headerInvoiceHeaderTableModel.fireTableDataChanged();
        invoiceLieTableModel = new InvoiceLineTableModel(new ArrayList<InvoiceLine>());
        invoiceTable.setModel(invoiceLieTableModel);
        invoiceLieTableModel.fireTableDataChanged();
        invCustomerNameValTxt.setText("");
        invDateValTxt.setText("");
        invNumValTable.setText("");
        invTotalValLable.setText("");

    }


}
