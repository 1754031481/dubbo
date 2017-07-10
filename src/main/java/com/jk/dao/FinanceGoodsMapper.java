package com.jk.dao;

import java.util.List;
import java.util.Map;

import com.jk.model.FinanceGoods;

public interface FinanceGoodsMapper {

	List<FinanceGoods> findFinanceGoods(Map<String, Object> map);

	Long countFinanceGoods(Map<String, Object> map);

	void addOrFinance(FinanceGoods financeGoods);

	List<FinanceGoods> poiFindFinanceGoods(FinanceGoods financeGoods);

	void updateTypeSj(FinanceGoods financeGoods);

	FinanceGoods updateFinanceGoods(FinanceGoods financeGoods);

	void updateGoods(FinanceGoods financeGoods);
  
}