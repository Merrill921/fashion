package com.dao;

import com.entity.DiscussfuzhuangshangchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussfuzhuangshangchengVO;
import com.entity.view.DiscussfuzhuangshangchengView;


/**
 * 服装商城评论表
 * 
 * @author 
 * @email 
 * @date 2022-05-21 11:15:31
 */
public interface DiscussfuzhuangshangchengDao extends BaseMapper<DiscussfuzhuangshangchengEntity> {
	
	List<DiscussfuzhuangshangchengVO> selectListVO(@Param("ew") Wrapper<DiscussfuzhuangshangchengEntity> wrapper);
	
	DiscussfuzhuangshangchengVO selectVO(@Param("ew") Wrapper<DiscussfuzhuangshangchengEntity> wrapper);
	
	List<DiscussfuzhuangshangchengView> selectListView(@Param("ew") Wrapper<DiscussfuzhuangshangchengEntity> wrapper);

	List<DiscussfuzhuangshangchengView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussfuzhuangshangchengEntity> wrapper);
	
	DiscussfuzhuangshangchengView selectView(@Param("ew") Wrapper<DiscussfuzhuangshangchengEntity> wrapper);
	

}
