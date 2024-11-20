package com.oven.vcas.common.constant;

/**
 * 状态常量
 *
 * @author Oven
 */
public interface StatusConst {

    /**
     * 通用状态-正常
     */
    Integer STATUS_NORMAL = 0;
    /**
     * 通用状态-删除
     */
    Integer STATUS_DELETED = 1;

    /**
     * 设备状态-正常
     */
    Integer DEVICE_STATUS_NORMAL = 1;
    /**
     * 设备状态-异常
     */
    Integer DEVICE_STATUS_UNNORMAL = 2;
    /**
     * 设备状态-停机
     */
    Integer DEVICE_STATUS_SHUTDOWN = 3;

    /**
     * 模型状态-暂停
     */
    Integer MODEL_STATUS_STOP = 0;
    /**
     * 模型状态-启动
     */
    Integer MODEL_STATUS_START = 1;

    /**
     * 任务状态-停止
     */
    Integer TASK_STATUS_STOP = 1;
    /**
     * 任务状态-执行
     */
    Integer TASK_STATUS_START = 2;

    /**
     * 人员审核状态-未审批
     */
    Integer PERSON_APPROVE_STATUS_NOAPPROVE = 0;
    /**
     * 人员审核状态-审批通过
     */
    Integer PERSON_APPROVE_STATUS_AGREE = 1;
    /**
     * 人员审核状态-审批未通过
     */
    Integer PERSON_APPROVE_STATUS_REJECT = 2;

    /**
     * 人脸注册状态-入库失败
     */
    Integer PERSON_FACE_STATUS_FAILED = 0;
    /**
     * 人脸注册状态-入库成功
     */
    Integer PERSON_FACE_STATUS_SUCCESS = 1;

    /**
     * 视频流拉流状态-拉流中
     */
    String GRABBER_STATUS_RUNNING = "running";
    /**
     * 视频流拉流状态-拉流异常
     */
    String GRABBER_STATUS_ERROR = "error";

}
