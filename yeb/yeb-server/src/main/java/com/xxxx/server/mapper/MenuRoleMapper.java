package com.xxxx.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xxxx.server.pojo.MenuRole;
import org.springframework.stereotype.Component;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author liyangyang
 * @since 2021-07-13
 */
@Component
public interface MenuRoleMapper extends BaseMapper<MenuRole> {
    /**
     * 更新角色菜单
     *
     * @param rid
     * @param mids
     * @return
     */
    Integer insertRecord(Integer rid, Integer[] mids);
}
