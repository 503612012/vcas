package com.oven.vcas.core.result.entity;

import com.oven.vcas.core.device.entity.Device;
import com.oven.vcas.core.task.entity.Task;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 分析结果实体类
 *
 * @author Oven
 */
@Data
@Table(name = "vcas_analysis_result")
public class Result {

    @Id
    @Column(name = "dbid")
    private Integer id; // 主键

    @Column(name = "task_id")
    private String taskId; // 任务id

    @Column(name = "device_id")
    private String deviceId; // 设备id

    @Column(name = "pic_url")
    private String picUrl; // 识别图片地址

    @Column(name = "video_url")
    private String videoUrl; // 视频地址

    @Column(name = "predict_result")
    private String predictResult; // 推理结果

    @Column(name = "judge_desc")
    private String judgeDesc; // 判定结果

    @Column(name = "create_time")
    private String createTime; // 创建时间

    @Column(name = "happen_time")
    private String happenTime; // 发生时间

    @Column(name = "handle_status")
    private Integer handleStatus; // 处理状态：0-未处理、1-已处理、2-误识别

    @Column(name = "handle_user")
    private Integer handleUser; // 处理人

    @Column(name = "handle_time")
    private String handleTime; // 处理时间

    // 非数据库属性
    @Column(name = "task_name", insertable = false, updatable = false)
    private String taskName;
    @Column(name = "device_name", insertable = false, updatable = false)
    private String deviceName;
    @Column(name = "device_location", insertable = false, updatable = false)
    private String deviceLocation;
    @Column(name = "preserve_time_limit", insertable = false, updatable = false)
    private Integer preserveTimeLimit; // 结果留存时限（天）

    private Task task;
    private Device device;

    // 搜索关键字
    private String keyword;

}
