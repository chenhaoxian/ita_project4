package ita.project4.main.dao.impl;

import java.util.ArrayList;
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
		String jpql="select m from Merchant m where m.mStatus=1 or m.mStatus = null";
		//em.createQuery(jpql).setFirstResult((p.getPage()-1)*p.getRows()).getResultList()
		Query query = em.createQuery(jpql);
		query.setFirstResult((p.getPage()-1)*p.getRows());
		query.setMaxResults(p.getRows());
		return query.getResultList();
	}

	@Override
	public int updateMerchantStatus(int mId, int status) {
		// TODO Auto-generated method stub
		Merchant merchant = em.find(Merchant.class, mId);
		merchant.setmStatus(status);
		em.merge(merchant);
		//"update *** Set mstatus = mstatus Where mid = mid";
		return 1;
	}

	@Override
	public Merchant findMerchantByMBrand(String mBrand) {
		// TODO Auto-generated method stub
		String jqpl = "select m from Merchant m where m.mBrand=:mBrand";// :后面是占位符，前面指的是数据库中的字段
		@SuppressWarnings("unchecked")
		List<Merchant> lm = em.createQuery(jqpl).setParameter("mBrand", mBrand).getResultList();
		if (lm.isEmpty())
			return null;
		else
			return lm.get(0);
	}

	@Override
	public List<String> findAllBrand() {
		// TODO Auto-generated method stub
		String jpql = "from Merchant";
		List<Merchant> st = em.createQuery(jpql).getResultList();
		List<String> list = new ArrayList<>();
		for (Merchant m : st) {
			list.add(m.getmBrand());
		}
		return list;

	}

	@Override
	public int saveMerchant(Merchant merchant) {
		// TODO Auto-generated method stub
		em.persist(merchant);
		return merchant.getmId();
	}

	@Override
	public int findMerchantStatus(int mId) {
		// TODO Auto-generated method stub
		String jqpl = "select m from Merchant m where m.mId=:mId";// :后面是占位符，前面指的是数据库中的字段
		List<Merchant> lm = em.createQuery(jqpl).setParameter("mId", mId).getResultList();	   
	    return lm.get(0).getmStatus();
	}
	
	@Override
	public List<Integer> getPassMId() {
		// TODO Auto-generated method stub
		String jqpl = "select m from Merchant m where m.mStatus=2";
		List<Merchant> st = em.createQuery(jqpl).getResultList();
		List<Integer> list = new ArrayList<>();
		for (Merchant m : st) {
			list.add(m.getmId());
		}
		return list;
	}
	
	@Override
	public int updateMerchantScore(int mId, double mScore) {
		// TODO Auto-generated method stub
		Merchant merchant = em.find(Merchant.class, mId);
		merchant.setmScore(mScore);
		em.merge(merchant);
		return 1;
	}
	
	@Override
	public List<Merchant> findLowMerchantByPage(Pager p) {
		// TODO Auto-generated method stub
		String jpql = "select m from Merchant m where m.mScore<=5.0 and m.mStatus != 4";
		// em.createQuery(jpql).setFirstResult((p.getPage()-1)*p.getRows()).getResultList()
		Query query = em.createQuery(jpql);
		query.setFirstResult((p.getPage() - 1) * p.getRows());
		query.setMaxResults(p.getRows());
		return query.getResultList();
	
	}
	
	@Override
	public List<String> findAllmTel() {
		// TODO Auto-generated method stub 
		String jpql = "select m from Merchant m where m.mStatus=2 or m.mStatus=4";
		List<Merchant> st = em.createQuery(jpql).getResultList();
		List<String> list = new ArrayList<>();
		for (Merchant m : st) {
		list.add(m.getmTel());
		}
		return list;

	}

	@Override
	public Merchant findMerchantBymTel(String mTel,int mStatus) {
		// TODO Auto-generated method stub
		String jqpl = "select m from Merchant m where m.mTel=:mTel and m.mStatus=2 or m.mStatus=4 ";// :后面是占位符，前面指的是数据库中的字段
		@SuppressWarnings("unchecked")
		List<Merchant> lm = em.createQuery(jqpl).setParameter("mTel", mTel).getResultList();
		if (lm.isEmpty())
		return null;
		else
		return lm.get(0);
	}

}
