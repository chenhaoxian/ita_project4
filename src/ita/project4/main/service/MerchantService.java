package ita.project4.main.service;

import java.util.List;

import ita.project4.main.po.Merchant;
import ita.project4.main.pojo.Pager;

public interface MerchantService {
	
List<Merchant> findMerchantByPage(Pager p );
	
	int updateMerchantStatus(int mId,int status);
	
	Merchant findMerchantByMBrand(String mBrand);
	
	List<String> findAllBrand();
	
	int saveMerchant(Merchant merchant);
	
	int findMerchantStatus(int mId);
	
	List<Integer> getPassMId();
	
	int updateMerchantScore(int mId,double mScore);
	
	List<Merchant> findLowMerchantByPage(Pager p);

	

}
