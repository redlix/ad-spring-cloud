package com.imooc.ad.index.adplan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * ${desc}
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2019/03/12     red        -
 * </pre>
 *
 * @author redli
 * @version 1.0.0 2019-03-12 08:16
 * @date 2019-03-12 08:16
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdPlanObject {
    private Long planId;
    private Long userId;
    private Integer planStatus;
    private Date startDate;
    private Date endDate;

    public void update(AdPlanObject adPlanObject) {
        if (null != adPlanObject.getPlanId()) {
            this.planId = adPlanObject.getPlanId();
        }
        if (null != adPlanObject.getUserId()) {
            this.userId = adPlanObject.getUserId();
        }
        if (null != adPlanObject.getPlanStatus()) {
            this.planStatus = adPlanObject.getPlanStatus();
        }
        if (null != adPlanObject.getStartDate()) {
            this.startDate = adPlanObject.getStartDate();
        }
        if (null != adPlanObject.getEndDate()) {
            this.endDate = adPlanObject.getEndDate();
        }
    }
}
