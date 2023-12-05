package com.co.lebc.template.services.services;

import com.co.lebc.template.models.dtos.rq.BasicDtoRs;
import com.co.lebc.template.services.impls.BasicService;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Service for basic endpoint.
 *
 * @author luis.bolivar
 */
@Service
public class BasicServiceImpl implements BasicService {

    /**
     * {@inheritDoc}
     * @return
     */
    @Override
    public Optional<BasicDtoRs> getBasicRs() {
        return Optional.of(getBasic());
    }

    /**
     * {@inheritDoc}
     * @return
     */
    @Override
    public BasicDtoRs getBasic() {
        return BasicDtoRs.builder()
                .message("Hello world")
                .code("1")
                .build();
    }
}
