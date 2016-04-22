package com.mvpdemo.bean;

/**
 * 
 * @ClassName: BaseBean1
 * @Description: 基本BaseBean1
 * @author huangshuai
 * @email castiel.huang@itotem.com.cn
 * @Copyright 北京爱图腾科技有限公司 
 * @date 2014年9月18日 下午12:12:11
 * @version
 */
public class BaseBean1<T> {

	private int result;
	private int error_no;
	private String error_msg;
	private String message;
	private UserInfoBean data;

	public BaseBean1() {
		super();
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getError_no() {
		return error_no;
	}

	public void setError_no(int error_no) {
		this.error_no = error_no;
	}

	public String getError_msg() {
		return error_msg;
	}

	public void setError_msg(String error_msg) {
		this.error_msg = error_msg;
	}

	public UserInfoBean getData() {
		return data;
	}

	public void setData(UserInfoBean data) {
		this.data = data;
	}

}
