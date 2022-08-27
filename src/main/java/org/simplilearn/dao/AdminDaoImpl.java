package org.simplilearn.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.simplilearn.entities.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDaoImpl extends JdbcDaoSupport implements AdminDao {

	@Autowired
	DataSource dataSource;
	
	@PostConstruct
	public void initilize() {
		setDataSource(dataSource);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public Admin getAdminById(String username) {
		// TODO Auto-generated method stub
		
		String sql="select username, password from admin where username=?";
		List<Admin> admin = getJdbcTemplate().query(sql, new Object[] {username}, new RowMapper<Admin>() {
			
			public Admin mapRow(ResultSet rs, int rowNum) throws SQLException {
				
					System.out.println(rs.getString(1));
					System.out.println(rs.getString(2));
					
					Admin admin= new Admin();
					admin.setUsername(username);
					admin.setUsername(rs.getString(1));
					admin.setPassword(rs.getString(2));
					return admin;							
			}
		});
		
		if (admin.isEmpty()) {
		    return null;
		} else if (admin.size() == 1) { // list contains exactly 1 element
		    return admin.get(0);
		}else {
			return null;
		}
	}

}
