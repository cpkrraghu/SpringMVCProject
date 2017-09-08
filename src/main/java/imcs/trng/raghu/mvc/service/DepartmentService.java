package imcs.trng.raghu.mvc.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import imcs.trng.raghu.mvc.model.Department;

@Service
public interface DepartmentService {
	public Department getDepartment(int deptNo) throws SQLException;
}
