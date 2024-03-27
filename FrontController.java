package com.example.BankingSystem.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.BankingSystem.entities.Account;
import com.example.BankingSystem.exceptions.IdNotFoundException;
import com.example.BankingSystem.repositories.InterRepo;
import com.example.BankingSystem.serviceClass.ServiceClass;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class FrontController {

	
	@Autowired
	InterRepo repo;
	@RequestMapping("/")
	public String check()
	{
		return "welcome.jsp";
	}
	
	@RequestMapping("create")
	public String add(Account a)
	{
		repo.save(a);
		return "welcome.jsp";
	}
	
	@RequestMapping("get")
	public ModelAndView get(@RequestParam("id")int id)
	{
		ModelAndView mv=new ModelAndView();
		Account a=repo.findById(id).orElse(new Account());
			String name=a.getAccountHolderName();
			double balance=a.getBalance();
			mv.addObject("name",name);
			mv.addObject("balance",balance);
			mv.setViewName("display.jsp");	
		return mv;
	}
	
	@RequestMapping("remove")
	public String remove(@RequestParam("id")int id)
	{
		
		repo.deleteById(id);
		return "welcome.jsp";
	}
	
	@RequestMapping("getByName")
	public String removeByName(@RequestParam("AccountHolderName")String AccountHolderName)
	{
		repo.findByAccountHolderName(AccountHolderName);
		return "display.jsp";
	}
	
	@RequestMapping("displayAll")
	@ResponseBody
	public List<Account> getAll()
	{
		return repo.findAll();
	}
	
}
