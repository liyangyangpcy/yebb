package com.xxxx.server.utils;

import com.xxxx.server.pojo.Admin;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @author : liyangyang
 * @date :2021/7/18/018 22:08
 * @description :操作员工具类
 * @ClassName: AdminUtils
 **/
public class AdminUtils {
    /**
     * 获取当前登录操作员
     *
     * @param
     * @return
     */
    public static Admin getCurrentAdmin() {
        return (Admin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

    }
}
