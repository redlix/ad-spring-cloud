package com.imooc.ad.index;

/**
 * ${desc}
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2019/03/12     red        -
 * </pre>
 *
 * @author redli
 * @version 1.0.0 2019-03-12 08:21
 * @date 2019-03-12 08:21
 * @since 1.0.0
 */
public interface IndexAware<K, V> {
    V get(K key);

    void add(K key, V value);

    void update(K key, V value);

    void delete(K key, V value);
}
