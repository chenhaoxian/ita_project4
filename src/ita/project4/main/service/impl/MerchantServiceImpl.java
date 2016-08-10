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

	@Override
	public int updateMerchantStatus(int mId, int status) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Merchant findMerchantByMBrand(String mBrand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> findAllBrand() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int saveMerchant(Merchant merchant) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
