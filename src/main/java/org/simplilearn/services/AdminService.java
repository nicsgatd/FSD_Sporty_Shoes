package org.simplilearn.services;

import java.util.List;

import org.simplilearn.entities.Admin;

import org.springframework.stereotype.Service;


public interface AdminService {
	
	void insertAdmin(Admin admin);
	
	Admin getAdminByUsername(String username);
	
	List<Admin> findByAdmin(String username);
	

	
	void updateAdmin(String username,Admin admin);
	
}
