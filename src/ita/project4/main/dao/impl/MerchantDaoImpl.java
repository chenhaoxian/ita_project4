package ita.project4.main.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.annotations.Where;
import org.springframework.stereotype.Repository;

import ita.project4.main.dao.MerchantDao;
import ita.project4.main.po.Merchant;
import ita.project4.main.pojo.Pager;

@Repository("merchantDao")
public class MerchantDaoImpl implements MerchantDao {

	@PersistenceContext(name = "un")
	private EntityManager em;

	@Override
	public List<Merchant> getMerchantByPage(Pager p) {
		String jpql = "from Merchant";
		// em.createQuery(jpql).setFirstResult((p.getPage()-1)*p.getRows()).getResultList()
		Query query = em.createQuery(jpql);
		query.setFirstResult((p.getPage() - 1) * p.getRows());
		query.setMaxResults(p.getRows());
		return query.getResultList();
	}

	@Override
	public int updateMerchantStatus(int mId, int mstatus) {
		// TODO Auto-generated method stub
		Merchant merchant = em.find(Merchant.class, mId);
		merchant.setmStatus(mstatus);
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
	public List<String> findAllMBrand() {
		// TODO Auto-generated method stub
		String jpql = "from Merchant";
		List<Merchant> st = em.createQuery(jpql).getResultList();
		List<String> list = new ArrayList<>();
		for (Merchant m : st) {
			list.add(m.getmBrand());
		}
		return list;
	}

}
