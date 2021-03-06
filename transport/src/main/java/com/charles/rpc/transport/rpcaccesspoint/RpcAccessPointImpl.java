package com.charles.rpc.transport.rpcaccesspoint;

import com.charles.rpc.transport.RpcAccessPoint;
import org.springframework.stereotype.Component;

import java.io.Closeable;
import java.io.IOException;
import java.net.URI;

/**
 * @ClassName RpcAccessPointImpl
 * @Description 基于netty的 rpc 功能实现
 * @Author Charlestang
 * @Date 9/2/2020 18:03
 * @Version 1.0
 **/
@Component
public class RpcAccessPointImpl implements RpcAccessPoint {

    private final String host = "localhost";/*default*/
    private final int port = 9999;/*default*/
    private final URI uri = URI.create("rpc://" + host + ":" + port);

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public URI getUri() {
        return uri;
    }

    @Override
    public <T> T getRemoteService(URI uri, Class<T> clazz) {
        return null;
    }

    @Override
    public <T> URI addServiceProvider(T instance, Class<T> clazz) {
        return null;
    }

    @Override
    public Closeable startServer() throws Exception {
        return null;
    }

    @Override
    public void close() throws IOException {

    }
}
