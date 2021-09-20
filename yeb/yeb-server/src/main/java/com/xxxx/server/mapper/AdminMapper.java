package com.xxxx.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xxxx.server.pojo.Admin;
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
public interface AdminMapper extends BaseMapper<Admin> {

    /**
     * 获取所有操作员
     *
     * @param keywords
     * @return
     */
    List<Admin> getAllAdmins(Integer id, String keywords);
}
