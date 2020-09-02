package com.charles.rpc.transport;

import java.io.Closeable;
import java.net.URI;

public interface RpcAccessPoint extends Closeable {

    /**
     * 获取远程服务调用
     *
     * @param uri
     * @param clazz
     * @param <T>
     * @return
     */
    <T> T getRemoteService(URI uri, Class<T> clazz);

    /**
     * 注册对外提供的服务
     * @param instance
     * @param clazz
     * @param <T>
     * @return
     */
    <T> URI addServiceProvider(T instance, Class<T> clazz);

}
