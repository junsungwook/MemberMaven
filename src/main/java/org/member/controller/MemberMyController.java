package org.member.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.member.mybatis.mapper.MemberDAOImpl;
import org.member.mybatis.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*��Ʈ�ѷ���� �ν� ���*/
@Controller
public class MemberMyController {
	
	@Autowired
	private MemberDAOImpl mdao;

	
	
	
	//test
	@RequestMapping("myTest.my")
	public ModelAndView test() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("data","mybatis controller���� ������ ������");
		mv.setViewName("result");
		return mv;
	}
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "memberInsert";
	}
	
	
	//insert-form
	@RequestMapping("myInsert.my")
	public ModelAndView insert() {
		return new ModelAndView("memberInsert");
	}
	//insert
	@RequestMapping(value="myInsert.my",method=RequestMethod.POST)
	public ModelAndView insert(MemberVO user) {
		mdao.insert(user);
		return new ModelAndView("redirect:myList.my");
	}
	//list
	@RequestMapping("myList.my")
	public ModelAndView list() {
		ModelAndView mv = new ModelAndView();
		List<MemberVO> list = mdao.getMemberList();
		mv.addObject("list",list);
		mv.setViewName("list");
		return mv;
	}
	//delete
	@RequestMapping("/myDelete.my")
	public ModelAndView delete(String id) {
		mdao.delete(id);
		return new ModelAndView("redirect:myList.my");
	}
	
	//detail
	@RequestMapping("/myDetail.my")
	public ModelAndView detail(String id) {
		ModelAndView mv = new ModelAndView();
		MemberVO user = mdao.findById(id);
		mv.addObject("user",user);
		mv.setViewName("detail");
		return mv;
	}
	
	//update
	@RequestMapping("/myUpdate.my")
	public ModelAndView update(MemberVO user) {
		mdao.update(user);
		return new ModelAndView("redirect:myList.my");
	}
	
	//�˻�
	@RequestMapping("/boardList.my")
	public ModelAndView search(String field, String word) {
		ModelAndView mv = new ModelAndView();
		List<MemberVO> list = mdao.search(field,word);
		mv.addObject("list",list);
		mv.setViewName("search");
		return mv;
		//model�� �Ű����� ���� �� Model model �̶�� ���� �޾��ָ� �̷��� �� �� ����
		//��Ʈ����Ʈ�� ����Ʈ�������� ���� ���� �ִ�.
		//model.addAttribute("list",list);
		//return "list"
	}
}
