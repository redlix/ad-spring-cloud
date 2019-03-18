package com.imooc.ad.index.adplan;

import com.imooc.ad.index.IndexAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

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
@Slf4j
@Component
public class AdPlanIndex implements IndexAware<Long, AdPlanObject> {
    private static Map<Long, AdPlanObject> objectMap;

    static {
        objectMap = new ConcurrentHashMap<>();
    }

    @Override
    public AdPlanObject get(Long key) {
        return objectMap.get(key);
    }

    @Override
    public void add(Long key, AdPlanObject value) {
        log.info("before add:{}", objectMap);
        objectMap.put(key, value);
        log.info("after add:{}", objectMap);
    }

    @Override
    public void update(Long key, AdPlanObject value) {
        log.info("before update:{}", objectMap);
        AdPlanObject oldObject = objectMap.get(key);
        if (null == oldObject) {
            objectMap.put(key, value);
        } else {
            oldObject.update(value);
        }
        log.info("before update:{}", objectMap);

    }

    @Override
    public void delete(Long key, AdPlanObject value) {
        log.info("before delete:{}", objectMap);
        objectMap.remove(key);
        log.info("before delete:{}", objectMap);
    }
}
