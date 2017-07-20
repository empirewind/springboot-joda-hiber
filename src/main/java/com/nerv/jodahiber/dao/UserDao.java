package com.nerv.jodahiber.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.nerv.jodahiber.entity.UserEntity;
import com.nerv.jodahiber.vo.UserAndProvVo;

@Transactional
public interface UserDao extends CrudRepository<UserEntity, Long>{
	
	@Query("select u.uId, u.name, u.age, p.pName from UserEntity u, ProvEntity p where u.provId = p.pId ")
	List<Object[]> findUserAndProv();
		
	@Query("select new com.nerv.jodahiber.vo.UserAndProvVo(p.pId, u.uId, u.name) from UserEntity u, ProvEntity p where u.provId = p.pId ")
	List<UserAndProvVo> findUserAndProv_();
}
