/**
 * 
 */
package com.example.cunli.databing.web;

import java.util.Date;

/**
 * @author cunli 2016年8月17日 下午5:41:26 查看教学日志
 */
public class CheckTeachLog {
	private String zhuanye;
	private String startDate;
	private String endDate;

	/**
	 * 
	 */
	public CheckTeachLog() {
		super();
	}

	/**
	 * @param zhuanye
	 * @param startDate
	 * @param endDate
	 */
	public CheckTeachLog(String zhuanye, String startDate, String endDate) {
		super();
		this.zhuanye = zhuanye;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	/** 
	 * @return 专业
	 */
	public String getZhuanye() {
		return zhuanye;
	}

	/**
	 * @param 专业
	 */
	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}

	/** 
	 * @return 开始日期
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * @param 开始日期
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	/** 
	 * @return 截止日期
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * @param 截止日期
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
}
