package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuzhuangshangchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuzhuangshangchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuzhuangshangchengView;


/**
 * 服装商城
 *
 * @author 
 * @email 
 * @date 2022-05-21 11:15:30
 */
public interface FuzhuangshangchengService extends IService<FuzhuangshangchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuzhuangshangchengVO> selectListVO(Wrapper<FuzhuangshangchengEntity> wrapper);
   	
   	FuzhuangshangchengVO selectVO(@Param("ew") Wrapper<FuzhuangshangchengEntity> wrapper);
   	
   	List<FuzhuangshangchengView> selectListView(Wrapper<FuzhuangshangchengEntity> wrapper);
   	
   	FuzhuangshangchengView selectView(@Param("ew") Wrapper<FuzhuangshangchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuzhuangshangchengEntity> wrapper);
   	

}

