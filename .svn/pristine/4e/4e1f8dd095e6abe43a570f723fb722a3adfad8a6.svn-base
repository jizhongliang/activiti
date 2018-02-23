package com.hxy.sys.dao;

import com.hxy.base.dao.BaseDao;
import com.hxy.base.utils.Query;
import com.hxy.sys.entity.CustomerResponse;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xlk on 2018/2/7 0007.
 */
@Repository
public interface CustomerDao extends BaseDao<CustomerResponse> {
    List<CustomerResponse> queryResponseList(Query query);

    int queryResponseTotal(Query query);
}
