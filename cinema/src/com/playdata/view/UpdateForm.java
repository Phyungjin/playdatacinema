package com.playdata.view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class UpdateForm extends JFrame 
{
	public JTextField tf_id,tf_name,tf_ssn1,tf_phone1,tf_phone2,tf_phone3,tf_addr;
	public JPasswordField tf_pass,tf_pass2,tf_ssn2;
	public JButton bt_submit,bt_reset;
	JLabel la_id,la_pass1,la_pass2,la_n,la_j,la_t,la_addr,la_job;
	public JComboBox<String> cb_job;
	JLabel jb[];
	
	
  public UpdateForm()
	{	  
		setTitle("ȸ����������");
		
		jb = new JLabel[3];		
		String jobT[]= {"�л�","������","���/����","����/����","�Ϲݻ繫��","������","���/������","����/�Ƿ�","�ڿ���","�ֺ�","���ػ�","��Ÿ"};
		
		for(int i=0; i<jb.length; i++)
		{
		   jb[i]=new JLabel("-");
		}
		
		tf_id = new JTextField();
		  //tf_id.setEnabled(false);//��Ȱ��ȭ
		  tf_id.setEditable(false);//���� �Ҵ�
		tf_pass = new JPasswordField();
		tf_pass2 = new JPasswordField();
		tf_name= new JTextField();
		  tf_name.setEditable(false);
		tf_ssn1 = new JTextField();
		  tf_ssn1.setEditable(false);
		tf_ssn2 = new JPasswordField();
		  tf_ssn2.setEditable(false);
		tf_phone1 = new JTextField();
		tf_phone2 = new JTextField();
		tf_phone3 = new JTextField();
		tf_addr = new JTextField();
		
	    bt_submit = new JButton("���");
	    bt_reset = new JButton("���");
		
		
		la_id = new JLabel("I  D:");
		la_pass1 = new JLabel("��  ��:");
		la_pass2 = new JLabel("���Ȯ��:");
		la_n = new JLabel("��  ��:");
		la_j = new JLabel("�ֹι�ȣ:");
		la_t = new JLabel("��ȭ��ȣ:");
		la_addr = new JLabel("��  ��:");
		la_job = new JLabel("��  ��:");
		
		cb_job = new JComboBox<String>(jobT);		
		
		
		tf_id.setBounds(80,30,100,25);
		tf_pass.setBounds(80,70,100,25);
		tf_pass2.setBounds(80,110,100,25);
		tf_name.setBounds(80,150,100,25);
		
		tf_ssn1.setBounds(80,190,50,25);
		jb[0].setBounds(131,190,8,25);
		tf_ssn2.setBounds(140,190,50,25);
		
		tf_phone1.setBounds(80,230,40,25);
		jb[1].setBounds(121,230,8,25);
		tf_phone2.setBounds(130,230,40,25);
		jb[2].setBounds(171,230,8,25);
		tf_phone3.setBounds(180,230,40,25);
		
		tf_addr.setBounds(80,270,200,25);
		
		bt_submit.setBounds(50,370,90,25);
		bt_reset.setBounds(150,370,90,25);
		
		
		la_id.setBounds(10,30,100,25);
		la_pass1.setBounds(10,70,100,25);
		la_pass2.setBounds(10,110,100,25);
		la_n.setBounds(10,150,100,25);
		la_j.setBounds(10,190,100,25);
		la_t.setBounds(10,230,100,25);
		la_addr.setBounds(10,270,100,25);
		la_job.setBounds(10,310,100,25);
		
		cb_job.setBounds(80,310,100,25);
		
		setLayout(null);
		add(tf_id);
		add(tf_pass);
		add(tf_pass2);
		add(tf_name);
		add(tf_ssn1);
		add(tf_ssn2);
		add(tf_phone1); 
		add(tf_phone2); 
		add(tf_phone3); 
		add(tf_addr); 
		
		add(bt_submit);
		add(bt_reset);
		
		add(la_id); 
		add(la_pass1); 
		add(la_pass2); 
		add(la_n);
		add(la_j);
		add(la_t);
		add(la_addr);
		add(la_job); 
		
		add(cb_job);
				
		for(int i=0; i<jb.length; i++)
		{
			add(jb[i]);
		}
		
		setBounds(350,200,300,450);	
		setResizable(false);
	}//������  
  
  public void showMsg(String msg) {
		JOptionPane.showMessageDialog(this, msg);
	}
  
  public void setEmpty() {
	  tf_id.setText("");
	  tf_addr.setText("");
	  tf_name.setText("");
	  tf_pass.setText("");
	  tf_pass2.setText("");
	  tf_phone1.setText("");
	  tf_phone2.setText("");
	  tf_phone3.setText("");
	  tf_ssn1.setText("");
	  tf_ssn2.setText("");
  }
  
  public void setTexts(String id, String addr, String name, String pass, String pass2, String phone1, String phone2, String phone3,
		  int ssn1, int ssn2, String job) {
	  tf_id.setText(id);
	  tf_addr.setText(addr);
	  tf_name.setText(name);
	  tf_pass.setText(pass);
	  tf_pass2.setText(pass2);
	  tf_phone1.setText(phone1);
	  tf_phone2.setText(phone2);
	  tf_phone3.setText(phone3);
	  tf_ssn1.setText(ssn1+"");
	  tf_ssn2.setText(ssn2+"");
	  cb_job.setSelectedItem(job);
  }
  
}//UpdateForm

