package com.hxy.sys.service.impl;

import com.hxy.base.utils.Query;
import com.hxy.sys.dao.CustomerDao;
import com.hxy.sys.dao.SpBondDao;
import com.hxy.sys.entity.CustomerResponse;
import com.hxy.sys.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xlk on 2018/2/7 0007.
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;
    @Override
    public List<CustomerResponse> queryList(Query query) {
        return customerDao.queryResponseList(query);
    }

    @Override
    public int queryTotal(Query query) {
        return customerDao.queryResponseTotal(query);
    }
}
