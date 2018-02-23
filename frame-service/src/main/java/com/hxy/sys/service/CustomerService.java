package com.hxy.sys.service;

import com.hxy.base.utils.Query;
import com.hxy.sys.entity.CustomerResponse;

import java.util.List;

/**
 * Created by xlk on 2018/2/7 0007.
 */
public interface CustomerService {
    List<CustomerResponse> queryList(Query query);

    int queryTotal(Query query);
}
