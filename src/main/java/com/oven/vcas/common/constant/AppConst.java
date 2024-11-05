package com.oven.vcas.common.constant;

import org.bytedeco.opencv.opencv_core.Scalar;

import java.awt.Color;

/**
 * 系统常量定义类
 *
 * @author Oven
 */
public interface AppConst {

    String APP_NAME = "vcas_";

    String SERVER_IP = "SERVER_IP";

    String CURRENT_USER = "current_user"; // 当前登录用户

    String LOGINEDUSERS = "loginedUsers"; // 已经登录到系统用户，是一个map
    String SESSION_ID = "sessionId";
    String SESSION = "session";

    String MD5_SALT = "5217"; // MD5盐值

    String USER_MENU = "menu"; // 用户菜单

    String REQUEST_LOG_TEMPLATE_TABLE_NAME = "vcas_request_log_template"; // 请求日志模板表名

    String SHIRO_COOKIE_KEY = APP_NAME + "shiro_cookie_key";

    Integer TASK_TYPE_ANALYSIS = 1; // 分析任务
    Integer TASK_TYPE_CAPTURE = 2; // 录制任务

    Integer DEVICE_TYPE_ORDINARY = 0; // 普通设备
    Integer DEVICE_TYPE_GB28181 = 1; // 国标设备

    String DRAW_WAY_OPENCV = "opencv";
    String DRAW_WAY_JAVA = "java";

    String CAPTCHA = "_captcha";
    String PERCENTAGE_MARK = "\\\\%";
    String PERSON_CACHE_PREFIX = "PERSON_CACHE_PREFIX_";

    Integer RATE = 25; // 视频帧率

    // 深绿颜色
    Color COLOR_GREEN = new Color(2, 246, 127);
    // 深红颜色
    Color COLOR_RED = new Color(255, 10, 59);
    // 浅绿颜色填充
    Color COLOR_SHALLOW_GREEN = new Color(2, 246, 127, 50);
    // 浅红颜色填充
    Color COLOR_SHALLOW_RED = new Color(255, 10, 59, 50);
    // 深绿字体颜色
    Color COLOR_FRONT_GREEN = new Color(0, 0, 0);
    // 深红字体颜色
    Color COLOR_FRONT_RED = new Color(255, 255, 255);
    // 红色字体填充
    Color FONT_FILL_COLOR_RED = new Color(255, 10, 59, 200);
    // 绿色字体填充
    Color FONT_FILL_COLOR_GREEN = new Color(2, 246, 127, 200);

    // 深红颜色
    Scalar SCALAR_RED = new Scalar(59, 10, 255, 0);
    // 浅红颜色填充
    Scalar SCALAR_SHALLOW_RED = new Scalar(59, 10, 255, 50);
    // 深绿颜色
    Scalar SCALAR_GREEN = new Scalar(127, 246, 2, 0);
    // 浅绿颜色填充
    Scalar SCALAR_SHALLOW_GREEN = new Scalar(127, 246, 2, 50);

    // 首页访问数量
    String HOME_VISITOR_NUM = "HOME_VISITOR_NUM";

    String YES = "1";
    String NO = "0";

    String GET = "GET";
    String POST = "POST";

    // 后端画图
    String DRAW_POSITION_SERVER = "server";
    // 前端画图
    String DRAW_POSITION_CLIENT = "client";

}
