package org.ascending.training.respository;

import org.ascending.training.model.Department;

import java.sql.SQLException;
import java.util.List;

public interface DepartmentDao {
    List<Department> getDepartments() throws SQLException;
}
