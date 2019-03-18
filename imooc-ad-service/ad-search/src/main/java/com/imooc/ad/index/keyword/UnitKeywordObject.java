package com.imooc.ad.index.keyword;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ${desc}
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2019/03/12     red        -
 * </pre>
 *
 * @author redli
 * @version 1.0.0 2019-03-12 14:42
 * @date 2019-03-12 14:42
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UnitKeywordObject {
    private Long unitId;
    private String keyword;
}
