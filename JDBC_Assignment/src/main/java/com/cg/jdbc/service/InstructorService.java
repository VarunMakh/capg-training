package com.cg.jdbc.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.jdbc.bean.Instructor;
import com.cg.jdbc.dto.InstructorLocationCountDTO;
import com.cg.jdbc.exception.InstructorNotFoundException;

public interface InstructorService {
	
	public boolean insertInstructor(Instructor instructor)throws SQLException;
	public List<Instructor> getInstructorByCode(int code)throws InstructorNotFoundException, SQLException;  // 1
	public List<Instructor> getInstructors()throws SQLException;
	
	
	public List<Instructor> getInstructorsByLocation(String location)throws SQLException;   // 2
	public List<InstructorLocationCountDTO> getInstructorsCountByLocation()throws SQLException; // group by
	public List<Instructor> getInstructorsBySalary(); // order by ASC 
	
	
	public boolean delteInstructorByCode(int code)throws InstructorNotFoundException, SQLException; // 3
	public Instructor updateInstructor(Instructor oldInfoInstructor);

}
