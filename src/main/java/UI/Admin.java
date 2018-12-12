package UI;

import Model.Student;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Admin {
    private JPanel panel;
    private JButton button1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JLabel label1;
    private JLabel label6;
    private JLabel label5;
    private JLabel label4;
    private JLabel label3;
    private JLabel label2;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;


    public Admin() {
        JFrame frame = new JFrame("添加学生信息");
        frame.setContentPane(panel);
        frame.setVisible(true);
        frame.setBounds(100,100,500,400);

        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                String sid = textField1.getText();
                String sname = textField2.getText();
                char sex = textField3.getText().charAt(0);
                int age = Integer.parseInt(textField4.getText());
                int year = Integer.parseInt(textField5.getText());
                double gpa = Double.parseDouble(textField6.getText());
                Student ns = new Student(sid,sname,sex,age,year,gpa);

                if(true){
                    Information infoS = new Information();
                    infoS.label.setText("学生信息添加成功");
                }else{
                    Information infoF = new Information();
                    infoF.label.setText("学生信息添加失败");
                }
            }
        });
    }
}