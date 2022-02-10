package com.args.brtravels.clients.royale;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(
        value = "",
        name = "",
        configuration = RoyaleConfig.class
)
public interface RoyaleClient {
}
