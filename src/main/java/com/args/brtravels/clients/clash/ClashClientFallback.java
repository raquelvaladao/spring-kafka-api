package com.args.brtravels.clients.clash;

import com.args.brtravels.clients.clash.models.RequestToken;
import com.args.brtravels.clients.clash.models.ResponseClan;
import com.args.brtravels.clients.clash.models.ResponsePlayerStatus;
import org.springframework.stereotype.Component;

@Component
public class ClashClientFallback implements ClashClient {

    @Override
    public ResponseClan getClansByNameAndLimitResponse(String name, Integer limit) {
        return new ResponseClan();
    }

    @Override
    public ResponsePlayerStatus verifyPlayerStatus(String playerTag, RequestToken token) {
        return new ResponsePlayerStatus();
    }
}
