package com.meishihome.photo;

/**
 * User: lianghongbin
 * Date: 12-6-28
 * Time: 下午12:54
 * Interface:图片处理接口类
 */
public interface Processor {

    /**
     * 图片处理操作接口
     *
     * @param operation 操作数据
     * @return 返回byte数组
     */
    public byte[] process(Operation operation);
}
