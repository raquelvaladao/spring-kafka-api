package com.args.brtravels.service;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@Slf4j
public class ClashService {

    @Value("${clash.apikey}")
    public String API_KEY;

    @Value("${clash.baseurl}")
    public String BASE_URL;

}
