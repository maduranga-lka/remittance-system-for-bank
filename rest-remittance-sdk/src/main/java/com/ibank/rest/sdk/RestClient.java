package com.ibank.rest.sdk;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class RestClient<K,V> {
    private String restUrl;
    private K request;
    private Class<V> responseClass;

    public Object getAPIResponse() {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(restUrl);
        Response response = target.request().post(Entity.entity(request, MediaType.APPLICATION_JSON));
        return response.readEntity(responseClass);
    }

    public String getRestUrl() {
        return restUrl;
    }

    public void setRestUrl(String restUrl) {
        this.restUrl = restUrl;
    }

    public K getRequest() {
        return request;
    }

    public void setRequest(K request) {
        this.request = request;
    }

    public Object getResponseClass() {
        return responseClass;
    }

    public void setResponseClass(Class<V> responseClass) {
        this.responseClass = responseClass;
    }
}
