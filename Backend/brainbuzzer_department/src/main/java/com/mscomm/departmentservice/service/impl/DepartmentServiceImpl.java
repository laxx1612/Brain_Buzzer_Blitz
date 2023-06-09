package com.mscomm.departmentservice.service.impl;
import org.springframework.stereotype.Service;
import com.mscomm.departmentservice.entity.Department;
import com.mscomm.departmentservice.repository.DepartmentRepository;
import com.mscomm.departmentservice.service.DepartmentService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class DepartmentServiceImpl implements DepartmentService{
	
	 private DepartmentRepository departmentRepository;
	@Override
	public Department saveDepartment(Department department) {
	return departmentRepository.save(department);
	}

	@Override
	public Department getDepartmentById(Long departmentId) {
		 return departmentRepository.findById(departmentId).get();
	}

}
