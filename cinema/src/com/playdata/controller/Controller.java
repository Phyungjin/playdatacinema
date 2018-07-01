package com.playdata.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import com.playdata.view.LoginView;
import com.playdata.view.ReserView;

public class Controller {
	LoginView v_login;
	ReserView v_reserve;
	
	public Controller() {
		v_login = new LoginView();
		v_reserve = new ReserView();
		
		
		
		/*
		 * �ۼ���: ������
		 * ��������: 07/01 10:01
		 * �̺�Ʈ������ ���: LoginView (bt_login) click => ReserView
		 */
		v_login.bt_login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				v_login.setVisible(false);
				v_reserve.setVisible(true);
			}
		}); //bt_login actionListener
		
		/*
		 * �ۼ���: ������
		 * ��������: 07/01 10:19
		 * �̺�Ʈ������ ���: ReserveSubView���� ������ �� click ���� �̺�Ʈ ����
		 */
		for(int i=0; i<v_reserve.subv_reserve.length; i++) {
			v_reserve.subv_reserve[i].tbt_stars[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					for(int i=0; i<v_reserve.subv_reserve.length;i++) {
						for(int j=0; j<v_reserve.subv_reserve[i].tbt_stars.length;j++) {
								v_reserve.subv_reserve[i].tbt_stars[j].setSelectedIcon(new ImageIcon("image/star_yellow.png"));
//								System.out.println("i="+i+" j="+j+" k="+k );
						}//for - j
					}//for - i
					
					
				}//actionPerformed
			});//addActionLister
		}//for
	}//������
	
	public static void main(String[] args) {
		new Controller();
	}
}
