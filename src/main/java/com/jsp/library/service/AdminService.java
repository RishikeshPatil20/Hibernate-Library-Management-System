package com.jsp.library.service;

import java.util.ArrayList;
import java.util.List;

import com.jsp.library.dao.AdminDao;
import com.jsp.library.dao.LibriainDao;
import com.jsp.library.dto.Admin;
import com.jsp.library.dto.Libriain;


public class AdminService {

	LibriainDao libriainDao=new LibriainDao();
	AdminDao adminDao = new AdminDao();

	
	public Admin saveAdmin(Admin admin) {
		return adminDao.saveAdmin(admin);

	}
	
	public boolean validateAdmin(int id, String username, String pwd) {
		Admin a = adminDao.getAdminById(id);
		if (a != null && a.getUsername().equals(username) && a.getPassword().equals(pwd)) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public Admin updateAdminUserNameByIdPass(int id , String name) {
		
			return adminDao.updateAdminUserNameByIdPass(id, name);

	}
	
	public Admin getAdminById(int id) {

		return adminDao.getAdminById(id);
	
  }

	public boolean deleteAdminById(int id) {
		if (id > 0) {
		return adminDao.deleteAdminById(id);
	} else {
		return false;
	}

   }

		public List<Admin>getAllAdmin() {
	            return adminDao.gettAllAdmin();
      }
	
	
		public boolean approveLibriainById(int libid,int adminid) {
			Libriain libriain=libriainDao.getLibriainById(libid);
			Admin admin=adminDao.getAdminById(adminid);
			if(libriain!=null && admin!=null) {
				libriain.setStatus("Approved");
				libriain.setAdmin(admin);
				return libriainDao.approveReject(libriain);	
			}
			else {
				return false;
			}
		}
		
		
		public boolean rejectLibriainById(int libid,int adminid) {
		Libriain libriain=libriainDao.getLibriainById(libid);
			Admin admin=adminDao.getAdminById(adminid);
			if(libriain != null && admin !=null) {
				libriain.setStatus("rejected");
				libriain.setAdmin(admin);
				return libriainDao.approveReject(libriain);
			}
			return false;
		}
		
		public List<Libriain> viewAllUnapprovedLibriains(){
			LibriainService libriainService=new LibriainService();
			List<Libriain> libriains=libriainService.getAllLibrarians();
			List<Libriain> unapprovedlibs= new ArrayList<Libriain>();
			for(Libriain libriain : libriains) {
				if(libriain.getStatus().equals("unapproved")) {
					unapprovedlibs.add(libriain);
				}
			}
			return unapprovedlibs;
		}
		
		
		
		
		
		
		
	
}
