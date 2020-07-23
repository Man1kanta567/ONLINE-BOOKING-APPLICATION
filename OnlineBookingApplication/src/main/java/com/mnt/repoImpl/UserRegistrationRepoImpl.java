package com.mnt.repoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mnt.dao.UserRegistrationDAO;
import com.mnt.repo.IUserRegistrationRepo;

@Repository
public class UserRegistrationRepoImpl implements IUserRegistrationRepo
{
    @Autowired
	private HibernateTemplate template;
	
	
	@Override
	@Transactional(readOnly = false)
	public Integer insertDetails(UserRegistrationDAO dao) 
	{
		System.out.println("this dao in the repo class"+dao);
		  
		template.saveOrUpdate(dao);
		
		System.out.println(template);
			
		//System.out.println(id);
		 System.out.println(template.get(UserRegistrationDAO.class,2));
			return dao.getId();
		
	}

}
