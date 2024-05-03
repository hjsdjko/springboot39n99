package com.entity.model;

import com.entity.KechengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 课程信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-02-24 15:53:56
 */
public class KechengxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 科目类型
	 */
	
	private String kemuleixing;
		
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 授课老师
	 */
	
	private String shoukelaoshi;
		
	/**
	 * 开课时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaikeshijian;
		
	/**
	 * 结课时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiekeshijian;
		
	/**
	 * 课件
	 */
	
	private String kejian;
				
	
	/**
	 * 设置：科目类型
	 */
	 
	public void setKemuleixing(String kemuleixing) {
		this.kemuleixing = kemuleixing;
	}
	
	/**
	 * 获取：科目类型
	 */
	public String getKemuleixing() {
		return kemuleixing;
	}
				
	
	/**
	 * 设置：班级
	 */
	 
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
				
	
	/**
	 * 设置：授课老师
	 */
	 
	public void setShoukelaoshi(String shoukelaoshi) {
		this.shoukelaoshi = shoukelaoshi;
	}
	
	/**
	 * 获取：授课老师
	 */
	public String getShoukelaoshi() {
		return shoukelaoshi;
	}
				
	
	/**
	 * 设置：开课时间
	 */
	 
	public void setKaikeshijian(Date kaikeshijian) {
		this.kaikeshijian = kaikeshijian;
	}
	
	/**
	 * 获取：开课时间
	 */
	public Date getKaikeshijian() {
		return kaikeshijian;
	}
				
	
	/**
	 * 设置：结课时间
	 */
	 
	public void setJiekeshijian(Date jiekeshijian) {
		this.jiekeshijian = jiekeshijian;
	}
	
	/**
	 * 获取：结课时间
	 */
	public Date getJiekeshijian() {
		return jiekeshijian;
	}
				
	
	/**
	 * 设置：课件
	 */
	 
	public void setKejian(String kejian) {
		this.kejian = kejian;
	}
	
	/**
	 * 获取：课件
	 */
	public String getKejian() {
		return kejian;
	}
			
}
