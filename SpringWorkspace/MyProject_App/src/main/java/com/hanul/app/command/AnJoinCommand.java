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
		
		//컨트롤러에서 받은 모델에서 값을 추출해 DAO에 넘겨준다
		AnDAO adao = new AnDAO(); 
		int state = adao.anJoin(id, passwd, name, phonenumber, address);
		
		
		//jsp에서 사용하기 위해 모델에 저장한다.
		model.addAttribute("anJoin", String.valueOf(state)); 
	}

}
