package com.jk.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.jk.dao.FinanceGoodsMapper;
import com.jk.model.FinanceGoods;

@Service("financeService")
public class FinanceServiceImpl implements FinanceService {
	
	@Autowired
	private FinanceGoodsMapper financeGoodsMapper;
	@Override
	public List<FinanceGoods> findFinanceGoods(FinanceGoods financeGoods, Integer limit, Integer offset) {
		Map<String, Object> map=new HashMap<>();
		map.put("startDate", financeGoods.getStartDate());
		map.put("endDdate", financeGoods.getEndDate());
		map.put("goodsid", financeGoods.getGoodsid());
		map.put("goodsnum", financeGoods.getGoodsnum());
		map.put("goodsname", financeGoods.getGoodsname());
		map.put("goodsfinance", financeGoods.getGoodsfinance());
		map.put("goodsmoney", financeGoods.getGoodsmoney());
		map.put("goodsnumber", financeGoods.getGoodsnumber());
		map.put("goodsbishu", financeGoods.getGoodsbishu());
		map.put("goodskucun", financeGoods.getGoodskucun());
		map.put("goodsstate", financeGoods.getGoodsstate());
		map.put("createpeople", financeGoods.getCreatepeople());
		map.put("createtime", financeGoods.getCreatetime());
		map.put("updatetime", financeGoods.getUpdatetime());
		map.put("limit", (offset/limit+1)*limit);
		map.put("offset",(offset/limit)*limit);
		return financeGoodsMapper.findFinanceGoods(map);
	}
	@Override
	public Long countFinanceGoods(FinanceGoods financeGoods) {
		Map<String, Object> map=new HashMap<>();
		map.put("startDate", financeGoods.getStartDate());
		map.put("endDdate", financeGoods.getEndDate());
		map.put("goodsid", financeGoods.getGoodsid());
		map.put("goodsnum", financeGoods.getGoodsnum());
		map.put("goodsname", financeGoods.getGoodsname());
		map.put("goodsfinance", financeGoods.getGoodsfinance());
		map.put("goodsmoney", financeGoods.getGoodsmoney());
		map.put("goodsnumber", financeGoods.getGoodsnumber());
		map.put("goodsbishu", financeGoods.getGoodsbishu());
		map.put("goodskucun", financeGoods.getGoodskucun());
		map.put("goodsstate", financeGoods.getGoodsstate());
		map.put("createpeople", financeGoods.getCreatepeople());
		map.put("createtime", financeGoods.getCreatetime());
		map.put("updatetime", financeGoods.getUpdatetime());
		return financeGoodsMapper.countFinanceGoods(map);
	}
	@Override
	public void addOrFinance(FinanceGoods financeGoods) {
		financeGoodsMapper.addOrFinance(financeGoods);
	}
	@Override
	public List<FinanceGoods> poiFindFinanceGoods(FinanceGoods financeGoods) {
		return financeGoodsMapper.poiFindFinanceGoods(financeGoods);
	}
	@Override
	public void updateTypeSj(FinanceGoods financeGoods) {
		financeGoodsMapper.updateTypeSj(financeGoods);
	}
	@Override
	public FinanceGoods updateFinanceGoods(FinanceGoods financeGoods) {
		return financeGoodsMapper.updateFinanceGoods(financeGoods);
	}
	@Override
	public void updateGoods(FinanceGoods financeGoods) {
		financeGoodsMapper.updateGoods(financeGoods);
	}
	


}
