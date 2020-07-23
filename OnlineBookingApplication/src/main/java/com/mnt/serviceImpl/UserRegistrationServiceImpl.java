package com.mnt.serviceImpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mnt.dao.UserRegistrationDAO;
import com.mnt.dto.UserRegistration;
import com.mnt.repo.IUserRegistrationRepo;
import com.mnt.service.IUserRegistrationService;

@Service
public class UserRegistrationServiceImpl implements IUserRegistrationService
{

	
	@Autowired
	private IUserRegistrationRepo repo;
	@Override
	public Integer insertDetails(UserRegistration userRegistration)
	{
		 UserRegistrationDAO dao=new UserRegistrationDAO();
		BeanUtils.copyProperties(userRegistration, dao);
		System.out.println(dao);
		Integer id=repo.insertDetails(dao);
		return id;
	}

}
