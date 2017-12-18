package com.lingdu.smile.dao.domain;

import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 *  用户实体类User
 *  @author zsy
 */
@Data
public class UserDO implements Serializable {

    /**
     * ID
     */
    private Long id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 密码
     */
    private String password;
    /**
     * 真实姓名
     */
    private String realName;
    /**
     * 身份证号
     */
    private String cardId;
    /**
     * 注册IP
     */
    private String registerIp;
    /**
     * 上次登录IP
     */
    private String updateIp;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 状态：0-不可用，1-可用，2-删除
     */
    private Integer status;
}
