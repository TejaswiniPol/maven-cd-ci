package com.springboot.service;


import com.springboot.model.CovidData;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



@Service
public class CovidService {

    public List<CovidData> getCovidData(){

        String uri = "https://webhooks.mongodb-stitch.com/api/client/v2.0/app/covid-19-qppza/service/REST-API/incoming_webhook/global_and_us?country=Canada&state=Alberta&min_date=2022-03-01T00:00:00.000Z&max_date=2022-03-13T00:00:00.000Z&hide_fields=_id, country, country_code, country_iso2, country_iso3, loc, state";

        RestTemplate restTemplate = new RestTemplate();

        List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
        messageConverters.add(converter);
        restTemplate.setMessageConverters(messageConverters);

        CovidData[] list = restTemplate.getForObject(uri,CovidData[].class);

        if (list != null) {
            for (CovidData cd : list) {
                System.out.println(cd);
            }
        }
        List<CovidData> jhCovidData = null;
        if(list !=null)
            jhCovidData = new ArrayList<CovidData>(Arrays.asList(list));

        return jhCovidData;

    }



}
