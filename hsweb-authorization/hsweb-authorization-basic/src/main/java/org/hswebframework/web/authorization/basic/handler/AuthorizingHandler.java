package org.hswebframework.web.authorization.basic.handler;

import org.hswebframework.web.authorization.define.AuthorizingContext;

/**
 * aop方式权限控制处理器
 * @author zhouhao
 */
public interface AuthorizingHandler {
    void handle(AuthorizingContext context);
}
