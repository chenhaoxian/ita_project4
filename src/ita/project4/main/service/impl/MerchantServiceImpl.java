package ita.project4.main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	@Transactional
	public int updateMerchantStatus(int mId, int status) {
		// TODO Auto-generated method stub
		return merchantDao.updateMerchantStatus(mId, status);
	}

	@Override
	public Merchant findMerchantByMBrand(String mBrand) {
		// TODO Auto-generated method stub
		return merchantDao.findMerchantByMBrand(mBrand);
	}

	@Override
	public List<String> findAllBrand() {
		// TODO Auto-generated method stub
		return merchantDao.findAllBrand();
	}
	

	@Override
	@Transactional
	public int saveMerchant(Merchant merchant) {
		// TODO Auto-generated method stub
		return merchantDao.saveMerchant(merchant);
	}

	@Override
	public int findMerchantStatus(int mId) {
		// TODO Auto-generated method stub
		return merchantDao.findMerchantStatus(mId);
	}

	@Override
	public List<Integer> getPassMId() {
		// TODO Auto-generated method stub
		return merchantDao.getPassMId();
	}
	

}
