package com.fairyoo.fring.feign;

import com.fairyoo.fring.feign.dtos.CnodeTopicsResponse;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

/**
 * @author MengYi at 2019-01-04 09:27
 */
@Headers("Content-Type:application/json")
public interface NodeFeignClient {

    @RequestLine("GET /api/feed/v1/GetManages?device={device}")
    CnodeTopicsResponse getManages(@Param("device") int device);
}


