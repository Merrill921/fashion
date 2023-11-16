package com.entity.vo;

import com.entity.FuzhuangshangchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 服装商城
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-21 11:15:30
 */
public class FuzhuangshangchengVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 服装图片
	 */
	
	private String fuzhuangtupian;
		
	/**
	 * 服装类型
	 */
	
	private String fuzhuangleixing;
		
	/**
	 * 服装尺码
	 */
	
	private String fuzhuangchima;
		
	/**
	 * 服装颜色
	 */
	
	private String fuzhuangyanse;
		
	/**
	 * 服装材料
	 */
	
	private String fuzhuangcailiao;
		
	/**
	 * 服装介绍
	 */
	
	private String fuzhuangjieshao;
		
	/**
	 * 商家账号
	 */
	
	private String shangjiazhanghao;
		
	/**
	 * 价格
	 */
	
	private Float price;
		
	/**
	 * 单限
	 */
	
	private Integer onelimittimes;
		
	/**
	 * 库存
	 */
	
	private Integer alllimittimes;
				
	
	/**
	 * 设置：服装图片
	 */
	 
	public void setFuzhuangtupian(String fuzhuangtupian) {
		this.fuzhuangtupian = fuzhuangtupian;
	}
	
	/**
	 * 获取：服装图片
	 */
	public String getFuzhuangtupian() {
		return fuzhuangtupian;
	}
				
	
	/**
	 * 设置：服装类型
	 */
	 
	public void setFuzhuangleixing(String fuzhuangleixing) {
		this.fuzhuangleixing = fuzhuangleixing;
	}
	
	/**
	 * 获取：服装类型
	 */
	public String getFuzhuangleixing() {
		return fuzhuangleixing;
	}
				
	
	/**
	 * 设置：服装尺码
	 */
	 
	public void setFuzhuangchima(String fuzhuangchima) {
		this.fuzhuangchima = fuzhuangchima;
	}
	
	/**
	 * 获取：服装尺码
	 */
	public String getFuzhuangchima() {
		return fuzhuangchima;
	}
				
	
	/**
	 * 设置：服装颜色
	 */
	 
	public void setFuzhuangyanse(String fuzhuangyanse) {
		this.fuzhuangyanse = fuzhuangyanse;
	}
	
	/**
	 * 获取：服装颜色
	 */
	public String getFuzhuangyanse() {
		return fuzhuangyanse;
	}
				
	
	/**
	 * 设置：服装材料
	 */
	 
	public void setFuzhuangcailiao(String fuzhuangcailiao) {
		this.fuzhuangcailiao = fuzhuangcailiao;
	}
	
	/**
	 * 获取：服装材料
	 */
	public String getFuzhuangcailiao() {
		return fuzhuangcailiao;
	}
				
	
	/**
	 * 设置：服装介绍
	 */
	 
	public void setFuzhuangjieshao(String fuzhuangjieshao) {
		this.fuzhuangjieshao = fuzhuangjieshao;
	}
	
	/**
	 * 获取：服装介绍
	 */
	public String getFuzhuangjieshao() {
		return fuzhuangjieshao;
	}
				
	
	/**
	 * 设置：商家账号
	 */
	 
	public void setShangjiazhanghao(String shangjiazhanghao) {
		this.shangjiazhanghao = shangjiazhanghao;
	}
	
	/**
	 * 获取：商家账号
	 */
	public String getShangjiazhanghao() {
		return shangjiazhanghao;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
				
	
	/**
	 * 设置：单限
	 */
	 
	public void setOnelimittimes(Integer onelimittimes) {
		this.onelimittimes = onelimittimes;
	}
	
	/**
	 * 获取：单限
	 */
	public Integer getOnelimittimes() {
		return onelimittimes;
	}
				
	
	/**
	 * 设置：库存
	 */
	 
	public void setAlllimittimes(Integer alllimittimes) {
		this.alllimittimes = alllimittimes;
	}
	
	/**
	 * 获取：库存
	 */
	public Integer getAlllimittimes() {
		return alllimittimes;
	}
			
}
