package com.toov5.TestJob;

import org.springframework.stereotype.Component;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;


@JobHandler(value="myJob")
@Component
public class MyJob extends IJobHandler {
     @Override
    public ReturnT<String> execute(String param) throws Exception {
    	System.out.println("XXL-Job传递的参数是："+param);
    	return SUCCESS;
    }
}
