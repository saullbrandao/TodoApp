/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.TaskController;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Project;
import model.Task;

/**
 *
 * @author saull
 */
public class TaskDialogScreen extends javax.swing.JDialog {

    TaskController controller;
    Project project;
    Task task;
    boolean isEditing = false;

    /**
     * Creates new form TaskDialogScreen
     */
    public TaskDialogScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        hideErrorFields();

        controller = new TaskController();
    }

    public TaskDialogScreen(java.awt.Frame parent, boolean modal, Task task) {
        super(parent, modal);
        this.task = task;
        this.isEditing = true;

        initComponents();
        hideErrorFields();

        setTaskFields();
        controller = new TaskController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanelHeader = new javax.swing.JPanel();
        jLabelHeaderTitle = new javax.swing.JLabel();
        jLabelHeaderSaveTask = new javax.swing.JLabel();
        jPanelTask = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
        jLabelDeadline = new javax.swing.JLabel();
        jFormattedTextFieldDeadline = new javax.swing.JFormattedTextField();
        jLabelNotes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaNotes = new javax.swing.JTextArea();
        jLabelNameError = new javax.swing.JLabel();
        jLabelDeadlineError = new javax.swing.JLabel();

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelHeader.setBackground(new java.awt.Color(0, 153, 102));
        jPanelHeader.setForeground(new java.awt.Color(255, 255, 255));

        jLabelHeaderTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelHeaderTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHeaderTitle.setText("Tarefa");

        jLabelHeaderSaveTask.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHeaderSaveTask.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.png"))); // NOI18N
        jLabelHeaderSaveTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHeaderSaveTaskMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelHeaderTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(jLabelHeaderSaveTask, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelHeaderSaveTask, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
            .addComponent(jLabelHeaderTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelTask.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTask.setForeground(new java.awt.Color(0, 0, 0));

        jLabelName.setBackground(new java.awt.Color(255, 255, 255));
        jLabelName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(0, 0, 0));
        jLabelName.setText("Nome");

        jTextFieldName.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldName.setForeground(new java.awt.Color(0, 0, 0));

        jLabelDescription.setBackground(new java.awt.Color(255, 255, 255));
        jLabelDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelDescription.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDescription.setText("Descrição");

        jTextAreaDescription.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextAreaDescription.setForeground(new java.awt.Color(0, 0, 0));
        jTextAreaDescription.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescription);

        jLabelDeadline.setBackground(new java.awt.Color(255, 255, 255));
        jLabelDeadline.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelDeadline.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDeadline.setText("Prazo");

        jFormattedTextFieldDeadline.setBackground(new java.awt.Color(255, 255, 255));
        jFormattedTextFieldDeadline.setForeground(new java.awt.Color(0, 0, 0));
        jFormattedTextFieldDeadline.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        jLabelNotes.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNotes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNotes.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNotes.setText("Notas");

        jTextAreaNotes.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaNotes.setColumns(20);
        jTextAreaNotes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextAreaNotes.setForeground(new java.awt.Color(0, 0, 0));
        jTextAreaNotes.setRows(5);
        jScrollPane2.setViewportView(jTextAreaNotes);

        jLabelNameError.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNameError.setForeground(new java.awt.Color(255, 51, 0));
        jLabelNameError.setText("Campo obrigatório");

        jLabelDeadlineError.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDeadlineError.setForeground(new java.awt.Color(255, 51, 0));
        jLabelDeadlineError.setText("Campo obrigatório");

        javax.swing.GroupLayout jPanelTaskLayout = new javax.swing.GroupLayout(jPanelTask);
        jPanelTask.setLayout(jPanelTaskLayout);
        jPanelTaskLayout.setHorizontalGroup(
            jPanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTaskLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFormattedTextFieldDeadline)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jTextFieldName)
                    .addComponent(jLabelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDeadline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelNotes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelNameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDeadlineError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelTaskLayout.setVerticalGroup(
            jPanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTaskLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNameError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelDeadline)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDeadlineError)
                .addGap(3, 3, 3)
                .addComponent(jLabelNotes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jLabelHeaderSaveTaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHeaderSaveTaskMouseClicked
        try {
            if (areFieldsValid()) {
                if (!isEditing) {
                    task = new Task();
                }

                task.setProjectId(project.getId());
                task.setName(jTextFieldName.getText());
                task.setDescription(jTextAreaDescription.getText());
                task.setNotes(jTextAreaNotes.getText());
                task.setCompleted(false);

                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                Date deadline = dateFormat.parse(jFormattedTextFieldDeadline.getText());
                task.setDeadline(deadline);

                if (isEditing) {
                    controller.update(task);
                    JOptionPane.showMessageDialog(rootPane, "Tarefa atualizada com sucesso.");
                } else {
                    controller.save(task);
                    JOptionPane.showMessageDialog(rootPane, "Tarefa salva com sucesso.");
                }

                this.dispose();

            } else {
                hideErrorFields();

                if (jTextFieldName.getText().isEmpty()) {
                    jLabelNameError.setVisible(true);
                }
                if (jFormattedTextFieldDeadline.getText().isEmpty()) {
                    jLabelDeadlineError.setVisible(true);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }

    }//GEN-LAST:event_jLabelHeaderSaveTaskMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TaskDialogScreen dialog = new TaskDialogScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextFieldDeadline;
    private javax.swing.JLabel jLabelDeadline;
    private javax.swing.JLabel jLabelDeadlineError;
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelHeaderSaveTask;
    private javax.swing.JLabel jLabelHeaderTitle;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNameError;
    private javax.swing.JLabel jLabelNotes;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelTask;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaDescription;
    private javax.swing.JTextArea jTextAreaNotes;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables

    public void setProject(Project project) {
        this.project = project;
    }

    public void setTaskFields() {

        jTextFieldName.setText(task.getName());
        jTextAreaDescription.setText(task.getDescription());

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        jFormattedTextFieldDeadline.setText(dateFormat.format(task.getDeadline()));

        jTextAreaNotes.setText(task.getNotes());

    }

    public void hideErrorFields() {
        jLabelNameError.setVisible(false);
        jLabelDeadlineError.setVisible(false);
    }

    public boolean areFieldsValid() {
        return !jTextFieldName.getText().isEmpty()
                && !jFormattedTextFieldDeadline.getText().isEmpty();
    }
}