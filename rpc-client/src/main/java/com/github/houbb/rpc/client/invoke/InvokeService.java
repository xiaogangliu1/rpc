package com.github.houbb.rpc.client.invoke;

import com.github.houbb.rpc.common.rpc.domain.RpcResponse;

/**
 * 调用服务接口
 * @author binbin.hou
 * @since 0.0.6
 */
public interface InvokeService {

    /**
     * 添加请求信息
     * @param seqId 序列号
     * @return this
     * @since 0.0.6
     */
    InvokeService addRequest(final String seqId);

    /**
     * 放入结果
     * @param seqId 唯一标识
     * @param rpcResponse 响应结果
     * @return this
     * @since 0.0.6
     */
    InvokeService addResponse(final String seqId, final RpcResponse rpcResponse);

    /**
     * 获取标志信息对应的结果
     * @param seqId 序列号
     * @return 结果
     * @since 0.0.6
     */
    RpcResponse getResponse(final String seqId);

}