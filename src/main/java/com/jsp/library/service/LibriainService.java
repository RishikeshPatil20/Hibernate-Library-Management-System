package com.jsp.library.service;

import java.util.List;

import com.jsp.library.dao.BookDao;
import com.jsp.library.dao.LibriainDao;
import com.jsp.library.dao.StudentDao;
import com.jsp.library.dto.Book;
import com.jsp.library.dto.Libriain;
import com.jsp.library.dto.Student;

public class LibriainService {

	
	LibriainDao libriainDao = new LibriainDao();
	BookDao bookDao=new BookDao();
	StudentDao studentDao=new StudentDao();
	

//	Save
	public Libriain saveLibriain(Libriain libriain) {
		libriain.setStatus("unapproved");
		return libriainDao.saveLibriain(libriain);

	}
//Update
	public Libriain updateLibrarianName(int id,String newname) {
		return libriainDao.updateLibrarianName(id, newname);

	}
	
	public Libriain updateLibrarianStatus(int id,String newstatus) {
		return libriainDao.updateLibrarianName(id, newstatus);

	}

	
//	getById
	public Libriain getLibrarianById(int id) {
		if (id > 0) {
			return libriainDao.getLibriainById(id);
		} else {
			return null;
		}
	}

//	Delete
	public Libriain deleteLibrarianById(int id) {
		if (id > 0) {
			return libriainDao.getLibriainById(id);
		} else {
			return null;
		}


	}

//	GetAll
	public List<Libriain> getAllLibrarians() {
		return libriainDao.gettAllLibrarian();
	}
	
	//TO ADD BOOK
	public boolean addBook(Book book) {
		BookDao bookDao=new BookDao();
		bookDao.saveBook(book);
		return true;
	}
	
	//TO REMOVE BOOK
	public boolean removeBookById(int bookid) {
		BookDao bookDao=new BookDao();
		bookDao.deleteBookById(bookid);
		return true;
	}
	
	//TO ISSUEBOOK BY ID
	public boolean issueBookById(int bookid,int libid,int studid) {
		Book book= bookDao.getBookById(bookid);
		Student student=studentDao.getStudentById(studid);
		Libriain libriain=libriainDao.getLibriainById(libid);
		
		if(libriain!=null && book!=null && student!=null) {
			book.setStatus("issued");
			book.setStudent(student);
			book.setLibriain(libriain);
			return bookDao.issue(book);
		}
		return false;
	}
	
	
	public boolean returnBookById(int bookid) {
		Book book=new BookDao().getBookById(bookid);
		if(book!=null && book.getStatus().equals("issued")) {
			Student student=book.getStudent();
			Libriain libriain=book.getLibriain();
			
			if(student != null && libriain != null) {
				book.setStatus("Available");
				book.setStudent(null);
				book.setLibriain(null);
				return bookDao.Return(book);
			}
		}
		return false;
	}
	
	
	public boolean RequestBookById(int bookid,int libid,int studid) {
		Book book= bookDao.getBookById(bookid);
		Student student=studentDao.getStudentById(studid);
		Libriain libriain=libriainDao.getLibriainById(libid);
		
		if(libriain!=null && book!=null && student!=null) {
			
			book.setStatus("inrequest");
			book.setStudent(student);
			book.setLibriain(libriain);
			return bookDao.request(book);
		}
		return false;
	}
	
	
	
	
	
}
