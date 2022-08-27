package org.simplilearn.servicesimpl;

import java.util.List;
import java.util.Optional;

import javax.persistence.Id;

import org.simplilearn.dao.AdminDao;
import org.simplilearn.entities.Admin;
import org.simplilearn.exceptions.AdminNotFound;
import org.simplilearn.repositories.AdminRepository;
import org.simplilearn.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@Slf4j
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDao adminDao;
	
	@Autowired
	AdminRepository adminRepository;
	
	@Override
	public Admin getAdminByUsername(String username) {
		// TODO Auto-generated method stub
		Admin admin=adminDao.getAdminById(username);
		
		return admin;
	}
	@Override
	public List<Admin> findByAdmin(String username) {
		// TODO Auto-generated method stub
		return adminRepository.findAll();
	}
	@Override
	public void updateAdmin(String username,Admin admin) {
		// TODO Auto-generated method stub
		Admin admin1=getAdminByUsername(username);
		admin1.setPassword(admin.getPassword());
		adminRepository.save(admin1);
	}

	@Override
	public void insertAdmin(Admin admin) {
		// TODO Auto-generated method stub
		log.info("Inside insert admin method");
		adminRepository.save(admin);
	}






	

	

}
