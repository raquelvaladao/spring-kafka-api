package com.args.brtravels.clients.clash;


import com.args.brtravels.clients.clash.ClashFeignConfig;
import com.args.brtravels.clients.clash.models.RequestToken;
import com.args.brtravels.clients.clash.models.ResponseClan;
import com.args.brtravels.clients.clash.models.ResponsePlayerStatus;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;


@FeignClient(
        value = "${clash.clientName}",
        url = "${clash.baseUrl}",
        configuration = ClashFeignConfig.class,
        fallback = ClashClientFallback.class
)
public interface ClashClient {

    @GetMapping("/clans")
    ResponseClan getClansByNameAndLimitResponse(
            @RequestParam("name") String name,
            @RequestParam("limit") Integer limit);

    @PostMapping("/players/{playerTag}/verifytoken")
    ResponsePlayerStatus verifyPlayerStatus(
            @PathVariable String playerTag,
            @RequestBody RequestToken token);
}
