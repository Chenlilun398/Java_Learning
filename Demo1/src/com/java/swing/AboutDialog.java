package com.java.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by viruser on 2018/10/16.
 */
public class AboutDialog extends JDialog {
    private JLabel desc = null;
    private JPanel panel = null;
    private JButton btn = null;
    public AboutDialog(Frame frame, String title,boolean model){
        super(frame,title,model);
        init();
        registerListener();
    }
    private void init(){
        desc = new JLabel();
        desc.setText("<html>这是一个自定义的记事本<br/>测试一下功能</html>");
        desc.setHorizontalAlignment(JLabel.CENTER);
        panel = new JPanel();
        btn = new JButton("OK");
        panel.add(btn);
        this.add(desc);
        this.add(panel,BorderLayout.SOUTH);
        this.setSize(300,200);
    }
    private void registerListener(){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AboutDialog.this.dispose();
            }
        });
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        int dialogWidth = this.getWidth();
        int dialogHeight = this.getHeight();
        this.setLocation((screenWidth - dialogWidth) / 2, (screenHeight - dialogHeight) / 2);
        this.setVisible(true);
    }
}
