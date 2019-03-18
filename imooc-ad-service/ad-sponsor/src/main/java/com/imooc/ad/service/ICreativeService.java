package com.imooc.ad.service;

import com.imooc.ad.vo.CreativeRequest;
import com.imooc.ad.vo.CreativeResponse;

/**
 * ${desc}
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2019/03/07     red        -
 * </pre>
 *
 * @author redli
 * @version 1.0.0 2019-03-07 10:13
 * @date 2019-03-07 10:13
 * @since 1.0.0
 */
public interface ICreativeService {

    CreativeResponse createCreative(CreativeRequest request);
}
