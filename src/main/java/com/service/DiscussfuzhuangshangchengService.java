package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfuzhuangshangchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfuzhuangshangchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfuzhuangshangchengView;


/**
 * 服装商城评论表
 *
 * @author 
 * @email 
 * @date 2022-05-21 11:15:31
 */
public interface DiscussfuzhuangshangchengService extends IService<DiscussfuzhuangshangchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfuzhuangshangchengVO> selectListVO(Wrapper<DiscussfuzhuangshangchengEntity> wrapper);
   	
   	DiscussfuzhuangshangchengVO selectVO(@Param("ew") Wrapper<DiscussfuzhuangshangchengEntity> wrapper);
   	
   	List<DiscussfuzhuangshangchengView> selectListView(Wrapper<DiscussfuzhuangshangchengEntity> wrapper);
   	
   	DiscussfuzhuangshangchengView selectView(@Param("ew") Wrapper<DiscussfuzhuangshangchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfuzhuangshangchengEntity> wrapper);
   	

}

