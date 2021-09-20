package com.xxxx.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xxxx.server.pojo.Department;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author liyangyang
 * @since 2021-07-13
 */
@Component
public interface DepartmentMapper extends BaseMapper<Department> {
    /**
     * 获取所有部门
     *
     * @return
     */
    List<Department> getAllDepartments(Integer parentId);

    /**
     * 添加部门
     *
     * @return
     */
    void addDep(Department dep);

    /**
     * 删除部门
     *
     * @return
     */
    void deleteDep(Department dep);
}
