package PracticeProblem;

import java.awt.*;
import java.awt.event.*;
public class Practical1 extends Frame implements ActionListener , ItemListener
 {      MenuBar mbar;
        Menu file,edit;
        MenuItem item1,item2,item3;
        CheckboxMenuItem cut,copy,paste;
        Label msg;
        public Practical1()
        {  setTitle("Practical-3 Menu-Based Application");
            setSize(500,500);
            setVisible(true);
            setLayout(null);
            msg=new Label("");
            msg.setBounds(120,40,150,40);
            add(msg);
            mbar=new MenuBar();
            setMenuBar(mbar);            
            file=new Menu("File");
            item1=new MenuItem("New");
            file.add(item1);
            item2=new MenuItem("Open");
            file.add(item2);
            item3=new MenuItem("Save");
            file.add(item3);
            mbar.add(file);            
            edit=new Menu("Edit");
            cut=new CheckboxMenuItem("Cut");
            edit.add(cut);
            copy=new CheckboxMenuItem("Copy");
            edit.add(copy);
            paste=new CheckboxMenuItem("Paste");
            edit.add(paste);
            mbar.add(edit);            
            item1.addActionListener(this);
            item2.addActionListener(this);
            item3.addActionListener(this);
            cut.addItemListener(this);
            copy.addItemListener(this);
            paste.addItemListener(this);   
}       
        public void actionPerformed(ActionEvent ae)
        {      String arg=ae.getActionCommand();
            if(arg.equals("New"))
            {
//                SampleDialog d=new SampleDialog(this,"New File");
//                d.setVisible(true);
            }
            else if(arg.equals("Open"))
            {
                FileDialog d=new FileDialog(this,"Open A File ", 
	FileDialog .LOAD);
                d.setVisible(true);            }
            else if(arg.equals("Save"))
            {
               FileDialog d=new FileDialog(this,"Save File",FileDialog.SAVE);
               d.setVisible(true);
            }
            else if(arg.equals("Cut"))
            {
                       msg.setText("You selcted cut...");
            }
            else if(arg.equals("Copy"))
            {
                       msg.setText("You selcted copy...");
            }
            else if(arg.equals("Paste"))
            {
                       msg.setText("You selcted Paste...");
            }
        }        
        public void itemStateChanged(ItemEvent ie)
        {     if(cut.getState())
            {
                msg.setText("Cut is Selected");
            }
            else if(copy.getState())
            {
                msg.setText("Copy is Seletced");
            }
            else
            {
                msg.setText("Paste is Selected");
            }            
        }       
        public static void main(String ar[])
        {
            Practical1 m1=new Practical1();
        }               
}
