package com.oven.vcas.common.enumerate;

import com.oven.basic.common.util.IResultCode;

/**
 * 统一返回枚举类
 *
 * @author Oven
 */
public enum ResultCode implements IResultCode {

    SUCCESS(200, "操作成功！"),
    SCENE_ALREADY_DELETE(200, "场景已删除！"),

    UNKNOWN_ERROR(3001, "未知错误！"),
    SYSTEM_ERROR(3002, "系统错误！"),
    UPLOAD_ERROR(3003, "上传文件错误！"),
    FILE_NAME_EMPTY_ERROR(3004, "文件名称为空，请重新上传！"),
    GET_CAPTCHA_ERROR(3005, "获取验证码异常！"),
    FILE_EXT_ERROR(3006, "请上传图片格式文件！"),
    NOT_YET_ACTIVATED_ERROR(3007, "暂未开通修改功能！"),
    LOGIN_ERROR(3008, "登录操作出错，请联系网站管理人员。"),
    GET_CURRENT_USER_ERROR(3009, "获取当前登录用户出错，请联系网站管理人员。"),
    REGISTER_PERSON_ERROR(3010, "注册特征库异常！"),

    NO_THIS_USER(4001, "用户名或密码错误！"),
    PASSWORD_WRONG(4002, "用户名或密码错误！"),
    USER_DISABLE(4003, "该用户已被锁定，请联系管理人员！"),
    OVER_WRONG_NUM(4004, "密码错误超过5次，请联系管理人员解锁！"),
    SESSION_TIMEOUT(4005, "未登录或会话超时，请重新登录！"),
    LOSE_LOGIN(4006, "已掉线，请重新登录！"),
    OTHER_ALREADY_LOGGED_IN(4007, "会话失效，该账号已被其他人登录。请检查账号是否丢失或立即修改密码！"),
    CAPTCHA_ERROR(4008, "验证码错误，请重新输入！"),
    CAPTCHA_IS_NONE(4009, "请输入验证码！"),
    OLD_PASSWORD_WRONG(4010, "原始密码错误！"),
    USER_ALREADY_EXIST(4011, "该用户名已存在！"),
    FORCE_LOGOUT_ERROR(4012, "强制退出异常！"),
    FORCE_LOGOUT(4013, "您已被管理员强制退出！"),

    SEARCH_PAGE_ERROR(5001, "查询错误！"),
    SEARCH_ERROR(5002, "查询错误！"),
    INSERT_ERROR(5003, "添加错误！"),
    DELETE_ERROR(5004, "删除错误！"),
    UPDATE_ERROR(5005, "修改错误！"),
    PARAMS_ERROR(5006, "参数异常！"),
    ERROR_PAGE(5007, "去到错误页面！"),

    CAN_NOT_UPDATE_USER(6001, "该用户不可以修改"),
    CAN_NOT_DELETE_USER(6002, "该用户不可以删除"),
    CAN_NOT_SET_ROLE(6003, "该用户禁止设置角色"),
    CAN_NOT_UPDATE_ROLE(6004, "该角色不可以修改"),
    CAN_NOT_DELETE_ROLE(6005, "该角色不可以删除"),
    USE_FOR_USER(6006, "该角色被其他用户引用，禁止删除！"),
    CAN_NOT_SET_PERMISSION(6007, "该角色不可以设置权限"),

    DELETE_DEVICE_ERROR(7001, "该设备有承载任务，禁止删除！"),
    UPDATE_DEVICE_ERROR(7002, "该设备有承载执行中任务，请停止任务后再修改！"),
    UPDATE_RUNNING_TASK_ERROR(7003, "执行中任务禁止修改！"),
    DELETE_RUNNING_TASK_ERROR(7005, "执行中任务禁止删除！"),
    MODEL_PARAMS_LESS_ERROR(7006, "模型参数不能为空！"),
    MODEL_NOT_RUN_ERROR(7007, "任务模型未启动，任务启动失败！"),
    MODEL_CONFIG_LESS_ERROR(7008, "模型未配置"),
    MODEL_CALL_ERROR(7009, "模型调用异常"),
    OVER_QPS_ERROR(7010, "QPS已达到上限！"),
    DEVICE_OVER_LIMIT_ERROR(7011, "设备数量已达到上限！"),
    UPDATE_MODEL_ERROR(7012, "该模型有执行中的任务，禁止暂停！"),
    MODEL_OVER_LIMIT_ERROR(7013, "模型启动数量已达到上限！"),
    FUN_EXECUTE_ERROR(7014, "函数执行失败！");

    private final Integer code;
    private final String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }

    public boolean isSuccess() {
        return SUCCESS.code().equals(this.code());
    }

}
