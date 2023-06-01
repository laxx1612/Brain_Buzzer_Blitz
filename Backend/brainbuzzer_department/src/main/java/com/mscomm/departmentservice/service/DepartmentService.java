package com.mscomm.departmentservice.service;

import com.mscomm.departmentservice.entity.*;

public interface DepartmentService {
    Department saveDepartment(Department department);

    Department getDepartmentById(Long departmentId);
}