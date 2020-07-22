package com.mnt.repoImpl;

import org.springframework.stereotype.Repository;

import com.mnt.dao.UserRegistrationDAO;
import com.mnt.repo.IUserRegistrationRepo;

@Repository
public class UserRegistrationRepoImpl implements IUserRegistrationRepo
{

	@Override
	public Integer insertDetails(UserRegistrationDAO dao) {
		return null;
	}

}
