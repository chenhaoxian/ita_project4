package ita.project4.main.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import ita.project4.main.dao.MerchantDao;
import ita.project4.main.po.Merchant;
import ita.project4.main.pojo.Pager;

@Repository("merchantDao")
public class MerchantDaoImpl implements MerchantDao {
	
	@PersistenceContext(name="un")
	private EntityManager em;

	@Override
	public List<Merchant> getMerchantByPage(Pager p) {
		String jpql="from Merchant";
		//em.createQuery(jpql).setFirstResult((p.getPage()-1)*p.getRows()).getResultList()
		Query query = em.createQuery(jpql);
		query.setFirstResult((p.getPage()-1)*p.getRows());
		query.setMaxResults(p.getRows());
		return query.getResultList();
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

	@Override
	public int findMerchantStatus(int mId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
