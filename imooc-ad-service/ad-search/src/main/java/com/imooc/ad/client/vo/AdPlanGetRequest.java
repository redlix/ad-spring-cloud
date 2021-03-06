package com.imooc.ad.client.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * ${desc}
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2019/03/11     red        -
 * </pre>
 *
 * @author redli
 * @version 1.0.0 2019-03-11 22:52
 * @date 2019-03-11 22:52
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdPlanGetRequest {
    private Long userId;
    private List<Long> ids;
}
