package org.ascending.training.repository;

import org.ascending.training.model.Department;
import org.ascending.training.respository.DepartmentDao;
import org.ascending.training.respository.DepartmentJDBCDao;

import java.sql.SQLException;
import java.util.List;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class DepartmentJDBCDaoTest {
    DepartmentDao departmentJDao = new DepartmentJDBCDao();

//    DepartmentDao departmentJDao = new DepartmentHibernateDao();

//    DepartmentJDBCDao departmentJDBCDao = new DepartmentJDBCDao();

    @Test
    public void createDepartmentsTest() throws SQLException {
        List<Department> departments = departmentJDao.getDepartments();

        assertEquals(0, departments.size());
    }

}
