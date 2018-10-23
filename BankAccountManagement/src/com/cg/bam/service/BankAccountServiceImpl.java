package com.cg.bam.service;

import com.cg.bam.dao.BankAccountDAO;
import com.cg.bam.dao.BankAccountDAOImpl;
import com.cg.bam.dto.Customer;

public class BankAccountServiceImpl implements BankAccountService{

	BankAccountDAO dao  = new BankAccountDAOImpl();
	
	
	@Override
	public void createAccount(Customer customer) {
		// TODO Auto-generated method stub
		dao.createAccount(customer);		
	}

	@Override
	public void deposit(String mobileNo, double amount) {
		// TODO Auto-generated method stub
		dao.deposit(mobileNo, amount);
		
	}

	@Override
	public void withdraw(String mobileNo, double amount) {
		// TODO Auto-generated method stub
		dao.withdraw(mobileNo, amount);
		
	}

	@Override
	public double checkBalance(String mobileNo) {
		// TODO Auto-generated method stub
		return dao.checkBalance(mobileNo);
	}

	@Override
	public void fundTransfer(String sender, String reciever, double amount) {
		// TODO Auto-generated method stub
		dao.fundTransfer(sender, reciever, amount);
		
	}

}
