package com.co.lebc.template.services.impls;

import com.co.lebc.template.models.dtos.rq.BasicDtoRs;

import java.util.Optional;

/**
 * Basic service to test.
 *
 * @author luis.bolivar.
 */
public interface BasicService {

    /**
     * get basic result from {@link Optional}.
     * @return {@link Optional} of {@link BasicDtoRs}.
     */
    Optional<BasicDtoRs> getBasicRs();

    /**
     * get basic result.
     * @return {@link BasicDtoRs}.
     */
    BasicDtoRs getBasic();
}
