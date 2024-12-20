package com.oven.vcas.common.constant;

/**
 * 菜单权限Code定义类
 *
 * @author Oven
 */
public interface PermissionCode {

    String USER_MANAGER                       = "sys:user";                   // 用户管理
    String USER_INSERT                        = "sys:user:add";               // 添加用户
    String USER_UPDATE                        = "sys:user:update";            // 修改用户
    String USER_DELETE                        = "sys:user:del";               // 删除用户
    String USER_SETSTATUS                     = "sys:user:status";            // 修改用户状态
    String USER_SETROLE                       = "sys:user:setrole";           // 设置用户角色
    String FORCE_LOGOUT                       = "sys:user:forcelogout";       // 强制退出
    String RESET_ERR_NUM                      = "sys:user:reset";             // 重置错误次数
    String UPLOAD_AVATAR                      = "sys:user:avatar";            // 修改头像
    String USER_THEME                         = "sys:user:theme";             // 修改主题
    String MENU_POSITION                      = "sys:user:menuposition";      // 菜单位置

    String MENU_MANAGER                       = "sys:menu";                   // 菜单管理
    String MENU_UPDATE                        = "sys:menu:update";            // 修改菜单名称
    String MENU_SETSTATUS                     = "sys:menu:status";            // 修改菜单状态

    String ROLE_MANAGER                       = "sys:role";                   // 角色管理
    String ROLE_INSERT                        = "sys:role:add";               // 添加角色
    String ROLE_UPDATE                        = "sys:role:update";            // 修改角色
    String ROLE_DELETE                        = "sys:role:del";               // 删除角色
    String ROLE_SETSTATUS                     = "sys:role:status";            // 修改角色状态
    String ROLE_SETMENU                       = "sys:role:setmenu";           // 设置角色菜单

    String LOG_MANAGER                        = "sys:log";                    // 日志查看

    String SCENE_MANAGER                      = "sys:scene";                  // 场景管理
    String SCENE_INSERT                       = "sys:scene";                  // 添加场景
    String SCENE_DELETE                       = "sys:scene";                  // 删除场景

    String SYSDIC_MANAGER                     = "sys:dic";                    // 数据字典管理
    String SYSDIC_INSERT                      = "sys:dic:add";                // 添加数据字典
    String SYSDIC_UPDATE                      = "sys:dic:update";             // 修改数据字典
    String SYSDIC_RELOAD                      = "sys:dic:reload";             // 重载数据字典

    String MONITOR_MANAGER                    = "sys:monitor";                // 服务监控

    String PERSON_MANAGER                     = "person";                     // 人员管理
    String PERSON_INSERT                      = "person:add";                 // 添加人员
    String PERSON_UPDATE                      = "person:update";              // 修改人员
    String PERSON_DELETE                      = "person:del";                 // 删除人员
    String PERSON_APPROVE                     = "person:approval";            // 审核人员

    String TASK_MANAGER                       = "task";                       // 任务管理
    String TASK_INSERT                        = "task:add";                   // 新建任务
    String TASK_UPDATE                        = "task:update";                // 修改任务
    String TASK_DELETE                        = "task:del";                   // 删除任务
    String TASK_SETSTATUS                     = "task:status";                // 修改任务状态
    String TASK_PREVIEW                       = "task:preview";               // 预览任务

    String DEVICE_MANAGER                     = "device";                     // 设备管理
    String DEVICE_INSERT                      = "device:add";                 // 添加设备
    String DEVICE_UPDATE                      = "device:update";              // 修改设备
    String DEVICE_DELETE                      = "device:del";                 // 删除设备
    String DEVICE_PREVIEW                     = "device:preview";             // 预览设备
    String DEVICE_AUTO_DISCOVER               = "device:autodiscover";        // 自动发现

    String MODEL_MANAGER                      = "model";                      // 模型管理
    String MODEL_SETSTATUS                    = "model:status";               // 修改模型状态
    String MODEL_COMMON_CONFIG                = "model:config";               // 通用配置
    String MODEL_COMMON_TEST                  = "model:test";                 // 模型测试

    String RESULT_MANAGER                     = "result";                     // 结果管理
    String RESULT_SETSTATUS                   = "result:status";              // 修改结果状态

    String ANALYSIS_MANAGER                   = "analysis";                   // 告警分析

    String VIDEO_MANAGER                      = "video";                      // 视频回放

}
