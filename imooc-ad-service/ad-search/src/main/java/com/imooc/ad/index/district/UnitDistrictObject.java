package com.imooc.ad.index.district;

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
 * @version 1.0.0 2019-03-12 14:23
 * @date 2019-03-12 14:23
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UnitDistrictObject {
    private Long unitId;
    private String province;
    private String city;

// <String, Set<Long>>
// province-city
}
