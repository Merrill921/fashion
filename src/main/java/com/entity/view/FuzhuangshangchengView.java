package com.entity.view;

import com.entity.FuzhuangshangchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 服装商城
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-21 11:15:30
 */
@TableName("fuzhuangshangcheng")
public class FuzhuangshangchengView  extends FuzhuangshangchengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FuzhuangshangchengView(){
	}
 
 	public FuzhuangshangchengView(FuzhuangshangchengEntity fuzhuangshangchengEntity){
 	try {
			BeanUtils.copyProperties(this, fuzhuangshangchengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
