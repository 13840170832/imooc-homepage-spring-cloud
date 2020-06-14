package com.imooc.homepage.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * <h1>在过滤器中存储客户端发起请求的时间戳</h1>
 * Created by Xue.
 */
@Slf4j
@Component
public class PreRequestFilter extends ZuulFilter {

    /**过滤器的类型*/
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    /**排序*/
    @Override
    public int filterOrder() {
        return 0;
    }

    /**是否启用当前的过滤器*/
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run(){
        /**
         * 用于在过滤器之间传递消息。它的数据保存在每个请求的 ThreadLocal 中。它用于存储请求路由到哪里、错误、HttpServletRequest、
         * HttpServletResponse 都存储在 RequestContext中。RequestContext 扩展了 ConcurrentHashMap, 所以,
         * 任何数据都可以存储在上下文中。
         */
        RequestContext ctx = RequestContext.getCurrentContext();
        ctx.set("startTime",System.currentTimeMillis()); // 存储客户端发起请求的时间戳
        return null;
    }
}
