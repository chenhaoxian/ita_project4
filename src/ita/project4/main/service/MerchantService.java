package ita.project4.main.service;

import java.util.List;

import ita.project4.main.po.Merchant;
import ita.project4.main.pojo.Pager;

public interface MerchantService {
	
	List<Merchant> findMerchantByPage(Pager p );

}
