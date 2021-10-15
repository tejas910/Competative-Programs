
    import java.awt.*;  
    import java.awt.event.*;  
    //1st step  
    public class ActionListenerExample implements ActionListener{  
        static TextField tf=new TextField();  
    	public static void main(String[] args) {  
        Frame f=new Frame("ActionListener Example");  

        tf.setBounds(50,50, 150,20);  
        Button b=new Button("Click Here");  
        b.setBounds(50,100,60,30);  
        //2nd step  
             
        f.add(b);       
//        b.addActionListener();
        f.add(tf);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);   
    }
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}  
 
  }  