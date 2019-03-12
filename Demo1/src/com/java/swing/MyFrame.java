package com.java.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by viruser on 2018/10/15.
 */
public class MyFrame extends JFrame {
    private JTextArea tv_area = null;
    private JScrollPane s_pane = null;
    private JMenuBar mb = null;
    private JMenu m_file = null;
    private JMenu m_help = null;
    private JMenuItem item_new = null;
    private JMenuItem item_open = null;
    private JMenuItem item_exit = null;
    private JMenuItem item_about = null;

    public MyFrame(String title) {
        super(title);
        init();
        registerListener();
    }

    /**
     * 初始化
     */
    private void init() {
        tv_area = new JTextArea();
        s_pane = new JScrollPane(tv_area);
        s_pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        Container cpane = this.getContentPane();
        cpane.add(s_pane, BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 300);
        //初始化菜单
        mb = new JMenuBar();
        m_file = new JMenu("文件");
        item_new = new JMenuItem("新建");
        item_open = new JMenuItem("打开");
        item_exit = new JMenuItem("退出");
        m_file.add(item_new);
        m_file.add(item_open);
        m_file.add(item_exit);
        m_help = new JMenu("帮助");
        item_about = new JMenuItem("关于");
        m_help.add(item_about);
        mb.add(m_file);
        mb.add(m_help);
        this.setJMenuBar(mb);

        //设置窗口居中显示，定义一个工具包
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        int windowWidth = this.getWidth();
        int windowHeight = this.getHeight();
        this.setLocation((screenWidth - windowWidth) / 2, (screenHeight - windowHeight) / 2);
        this.setVisible(true);
    }

    /**
     * 组件设置事件监听器
     */
    private void registerListener() {
        item_new.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newFile();
            }
        });

        item_open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openFile();
            }
        });

        item_exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exitFile();
            }
        });

        item_about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AboutDialog(MyFrame.this,"关于记事本",true);
            }
        });
    }

    //新建
    private void newFile() {
        if (!tv_area.getText().equals("")) {
            int res = JOptionPane.showConfirmDialog(null, "是否保存",
                    "提示信息", JOptionPane.YES_NO_OPTION);
            if (res == JOptionPane.YES_OPTION) {
                FileDialog fd = new FileDialog(this, "保存文件", FileDialog.SAVE);
                fd.setVisible(true);
            } else {
                tv_area.setText("");
            }
        }
    }

    //打开
    private void openFile(){
        FileDialog fd = new FileDialog(this, "打开文件", FileDialog.LOAD);
        fd.setVisible(true);
    }

    //关闭
    private void exitFile(){
        newFile();
        System.exit(0);
    }
}