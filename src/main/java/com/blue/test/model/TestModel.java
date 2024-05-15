package com.blue.test.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息表;
 * @author : http://www.chiner.pro
 * @date : 2024-5-15
 */
@ApiModel(value = "用户信息表",description = "")
@Table(name="sys_user")
public class TestModel implements Serializable,Cloneable{
    /** ID */
    @Id
    @GeneratedValue
    @ApiModelProperty(name = "ID",notes = "")
    private Long lId ;
    /** 登录账户 */
    @ApiModelProperty(name = "登录账户",notes = "")
    private String vcAccount ;
    /** 登录密码 */
    @ApiModelProperty(name = "登录密码",notes = "")
    private String vcPassword ;
    /** 姓名 */
    @ApiModelProperty(name = "姓名",notes = "")
    private String vcUsername ;
    /** 昵称 */
    @ApiModelProperty(name = "昵称",notes = "")
    private String vcNickname ;
    /** 性别 */
    @ApiModelProperty(name = "性别",notes = "")
    private Integer vcSex ;
    /** 创建日期 */
    @ApiModelProperty(name = "创建日期",notes = "")
    private Date dCreateDate ;
    /** 更新时间 */
    @ApiModelProperty(name = "更新时间",notes = "")
    private Date dUpdateTime ;
    /** 备注 */
    @ApiModelProperty(name = "备注",notes = "")
    private String vcRemark ;
}
