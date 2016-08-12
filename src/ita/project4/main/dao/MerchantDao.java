package ita.project4.main.dao;

import java.util.List;

import ita.project4.main.po.Merchant;
import ita.project4.main.pojo.Pager;

public interface MerchantDao {
	
	List<Merchant> getMerchantByPage(Pager p);
	
	int updateMerchantStatus(int mId,int status);
	
	Merchant findMerchantByMBrand(String mBrand);
	
	List<String> findAllBrand();
	
	int saveMerchant(Merchant merchant);
	
	int findMerchantStatus(int mId);
	
	List<Integer> getPassMId();
	
	int updateMerchantScore(int mId,Double mScore);
	
	List<Merchant> findLowMerchantByPage(Pager p);

}
