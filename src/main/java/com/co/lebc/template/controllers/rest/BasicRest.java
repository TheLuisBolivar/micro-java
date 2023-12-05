package com.co.lebc.template.controllers.rest;

import com.co.lebc.template.models.dtos.rq.BasicDtoRs;
import com.co.lebc.template.services.impls.BasicService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Basic rest endpoint.
 *
 * @author luis.bolivar
 */
@RestController
@RequestMapping("/V0/basic")
@AllArgsConstructor
public class BasicRest {

    private BasicService basicService;

    /**
     * get basic service
     * @return {@link ResponseEntity} of {@link BasicDtoRs}.
     */
    @GetMapping("")
    private ResponseEntity<BasicDtoRs> basicGet(){
        return basicService.getBasicRs().map(ResponseEntity::ok)
                .orElse(ResponseEntity.ok(BasicDtoRs.builder().build()));
    }
}
