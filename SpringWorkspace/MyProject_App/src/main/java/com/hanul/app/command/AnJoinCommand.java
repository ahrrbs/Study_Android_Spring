package com.hanul.app.command;

import org.springframework.ui.Model;

import com.hanul.app.dao.AnDAO;

public class AnJoinCommand implements AnCommand{

	@Override
	public void execute(Model model) {
		String id = (String) model.asMap().get("id");
		String passwd = (String)model.asMap().get("passwd");	
		String name = (String)model.asMap().get("name");
		String phonenumber = (String)model.asMap().get("phonenumber");
		String address = (String)model.asMap().get("address");
		
		//��Ʈ�ѷ����� ���� �𵨿��� ���� ������ DAO�� �Ѱ��ش�
		AnDAO adao = new AnDAO(); 
		int state = adao.anJoin(id, passwd, name, phonenumber, address);
		
		
		//jsp���� ����ϱ� ���� �𵨿� �����Ѵ�.
		model.addAttribute("anJoin", String.valueOf(state)); 
	}

}
