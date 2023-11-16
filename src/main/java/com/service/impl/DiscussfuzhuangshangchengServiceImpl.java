package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussfuzhuangshangchengDao;
import com.entity.DiscussfuzhuangshangchengEntity;
import com.service.DiscussfuzhuangshangchengService;
import com.entity.vo.DiscussfuzhuangshangchengVO;
import com.entity.view.DiscussfuzhuangshangchengView;

@Service("discussfuzhuangshangchengService")
public class DiscussfuzhuangshangchengServiceImpl extends ServiceImpl<DiscussfuzhuangshangchengDao, DiscussfuzhuangshangchengEntity> implements DiscussfuzhuangshangchengService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfuzhuangshangchengEntity> page = this.selectPage(
                new Query<DiscussfuzhuangshangchengEntity>(params).getPage(),
                new EntityWrapper<DiscussfuzhuangshangchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfuzhuangshangchengEntity> wrapper) {
		  Page<DiscussfuzhuangshangchengView> page =new Query<DiscussfuzhuangshangchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussfuzhuangshangchengVO> selectListVO(Wrapper<DiscussfuzhuangshangchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfuzhuangshangchengVO selectVO(Wrapper<DiscussfuzhuangshangchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfuzhuangshangchengView> selectListView(Wrapper<DiscussfuzhuangshangchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfuzhuangshangchengView selectView(Wrapper<DiscussfuzhuangshangchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
