package com.yt.demo.core.dao;



import com.yt.demo.core.entity.MarketingActivityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 营销活动定义
 * Created by jackdeng on 17/8/4.
 */
@Repository
public interface MarketingActivityDao extends JpaRepository<MarketingActivityEntity, Long> {


    List<MarketingActivityEntity> findById();
}
