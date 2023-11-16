package com.dao;

import com.entity.FuzhuangshangchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuzhuangshangchengVO;
import com.entity.view.FuzhuangshangchengView;


/**
 * 服装商城
 * 
 * @author 
 * @email 
 * @date 2022-05-21 11:15:30
 */
public interface FuzhuangshangchengDao extends BaseMapper<FuzhuangshangchengEntity> {
	
	List<FuzhuangshangchengVO> selectListVO(@Param("ew") Wrapper<FuzhuangshangchengEntity> wrapper);
	
	FuzhuangshangchengVO selectVO(@Param("ew") Wrapper<FuzhuangshangchengEntity> wrapper);
	
	List<FuzhuangshangchengView> selectListView(@Param("ew") Wrapper<FuzhuangshangchengEntity> wrapper);

	List<FuzhuangshangchengView> selectListView(Pagination page,@Param("ew") Wrapper<FuzhuangshangchengEntity> wrapper);
	
	FuzhuangshangchengView selectView(@Param("ew") Wrapper<FuzhuangshangchengEntity> wrapper);
	

}
