package com.co.lebc.template.models.dtos.rq;

import lombok.Builder;
import lombok.Getter;

/**
 * Basic response object.
 *
 * @author luis.bolivar
 */
@Builder
@Getter
public class BasicDtoRs {
    private String message;
    private String code;
}
