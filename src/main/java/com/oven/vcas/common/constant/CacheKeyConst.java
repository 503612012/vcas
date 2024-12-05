package com.oven.vcas.common.constant;

/**
 * 缓存前缀常量池
 *
 * @author Oven
 */
public interface CacheKeyConst {

    String GET_CRON_BY_KEY = "GET_CRON_BY_KEY_{}";

    String MENU_GET_BY_ID = "MENU_GET_BY_ID_"; // 通过id获取菜单

    String MODEL_GET_BY_ID = "MODEL_GET_BY_ID_"; // 通过id获取模型

    String DEVICE_THREAD_KEY = "device_thread_key_"; // 设备线程标志
    String VIDEO_PRODUCE = "VIDEO_PRODUCE_"; // 视频帧生产线程状态
    String VIDEO_CONSUME = "VIDEO_CONSUME_"; // 视频帧消费线程状态

    String VIDEO_CAPTURE_PREFIX = "VIDEO_CAPTURE_PREFIX_"; // 视频录制线程状态

    String EXECUTE_TASK_DEVICE = "EXECUTE_TASK_DEVICE_{}_{}"; // 移除设备执行中任务缓存

    String ANALYSIS_VIDEO_SAVE_PREFIX = "ANALYSIS_VIDEO_SAVE_PREFIX_"; // 分析视频保存标志位

    String TASK_PREVIEW_OPEN_STATUS = "TASK_PREVIEW_OPEN_STATUS_"; // 任务预览标志位
    String DEVICE_PREVIEW_OPEN_STATUS = "DEVICE_PREVIEW_OPEN_STATUS_"; // 设备视频流预览标志位

    String TASK_GET_BY_DEVICEID_STATUS_TYPE = "getByDeviceIdAndStatusAndType_{}_{}_{}"; // 设备承载任务列表

    String TASK_GRAPHICS_RESULT_PREFIX = "TASK_GRAPHICS_RESULT_"; // 任务识别结果
    String DEVICE_GRAPHICS_RESULT_PREFIX = "DEVICE_GRAPHICS_RESULT_"; // 设备识别结果

    String GB28181_DEVICE_HEART_BEAT = "GB28181_DEVICE_HEART_BEAT_"; // 国标设备心跳信息缓存

    String COMMON_MODEL_CONFIG_PREFIX = "COMMON_MODEL_CONFIG_PREFIX_"; // 通用模型配置缓存前缀

    String SYS_DIC_FIND_ALL = "SYS_DIC_FIND_ALL";
    String SYS_DIC_FIND_BY_ID = "SYS_DIC_FIND_BY_ID_{}";
    String SYS_DIC_FIND_BY_KEY = "SYS_DIC_FIND_BY_KEY_{}";

    String GET_MENU_TREE_BY_USERID = "GET_MENU_TREE_BY_USERID_{}";
    String GET_ALL_MENU_CODE_BY_USERID = "GET_ALL_MENU_CODE_BY_USERID_{}";

    String GRABBER_TIME = "GRABBER_TIME_"; // 视频流帧时间戳
    String GRABBER_STATUS = "GRABBER_STATUS_"; // 视频流异常状态
    String GRABBER_DAEMON_STATUS = "GRABBER_DAEMON_STATUS_"; // 视频流守护线程运行状态

}
