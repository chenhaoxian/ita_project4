package ita.project4.main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ita.project4.main.dao.MerchantDao;
import ita.project4.main.po.Merchant;
import ita.project4.main.pojo.Pager;
import ita.project4.main.service.MerchantService;

@Service("merchantService")
public class MerchantServiceImpl implements MerchantService{
	
	@Autowired
	private MerchantDao merchantDao;

	@Override
	public List<Merchant> findMerchantByPage(Pager p) {
		
		return merchantDao.getMerchantByPage(p);
	}
	

}
