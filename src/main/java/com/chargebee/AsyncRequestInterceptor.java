package com.chargebee;

import com.chargebee.internal.AsyncRequest;
import com.chargebee.internal.Request;
import com.chargebee.internal.RequestBase;

public interface AsyncRequestInterceptor {

    public AsyncRequest handleRequest(Environment environment, RequestBase request) throws Exception;
}
