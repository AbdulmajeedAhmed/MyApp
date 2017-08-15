package com.abdulmajeed_ahmed.myapp.data.model;

import com.abdulmajeed_ahmed.myapp.data.model.remote_service.RetrofitClient;
import com.abdulmajeed_ahmed.myapp.data.model.remote_service.SOService;

/**
 * Created by Eng. Abdulmajeed Ahmed on 8/15/2017.
 */

public class ApiUtils {
    public static final String BASE_URL = "http://api.fixer.io/";

    public static SOService getSOService() {
        return RetrofitClient.getClient(BASE_URL).create(SOService.class);
    }

}
