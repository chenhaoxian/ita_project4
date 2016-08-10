package ita.project4.main.dao;

import java.util.List;

import ita.project4.main.po.Merchant;
import ita.project4.main.pojo.Pager;

public interface MerchantDao {
	
	List<Merchant> getMerchantByPage(Pager p);

}
