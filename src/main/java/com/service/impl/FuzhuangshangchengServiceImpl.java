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


import com.dao.FuzhuangshangchengDao;
import com.entity.FuzhuangshangchengEntity;
import com.service.FuzhuangshangchengService;
import com.entity.vo.FuzhuangshangchengVO;
import com.entity.view.FuzhuangshangchengView;

@Service("fuzhuangshangchengService")
public class FuzhuangshangchengServiceImpl extends ServiceImpl<FuzhuangshangchengDao, FuzhuangshangchengEntity> implements FuzhuangshangchengService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuzhuangshangchengEntity> page = this.selectPage(
                new Query<FuzhuangshangchengEntity>(params).getPage(),
                new EntityWrapper<FuzhuangshangchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuzhuangshangchengEntity> wrapper) {
		  Page<FuzhuangshangchengView> page =new Query<FuzhuangshangchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FuzhuangshangchengVO> selectListVO(Wrapper<FuzhuangshangchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuzhuangshangchengVO selectVO(Wrapper<FuzhuangshangchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuzhuangshangchengView> selectListView(Wrapper<FuzhuangshangchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuzhuangshangchengView selectView(Wrapper<FuzhuangshangchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
