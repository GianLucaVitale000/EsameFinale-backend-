package com.heartwoodlabs.esame.rs;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class Utility {

    //Response 200(OK) - GET
    public static Response buildOkResponse(Object entity) {
        return Response
                .status(Response.Status.OK)
                .entity(entity)
                .type(MediaType.APPLICATION_JSON)
                .build();
    }
    // Response 400(Bad Request)
    public static Response buildBadRequestResponse(Object entity) {
        return Response
                .status(Response.Status.BAD_REQUEST)
                .entity(entity)
                .type(MediaType.APPLICATION_JSON)
                .build();
    }
    // Response 204(No Content) - PUT/DELETE
    public static Response buildNoContentResponse() {
        return Response
                .status(Response.Status.NO_CONTENT)
                .build();
    }
    // Response 201(Created) - POST
    public static Response buildCreatedResponse() {
        return Response
                .status(Response.Status.CREATED)
                .build();
    }
    // Response 404 (Not Found)
    public static Response buildNotFoundResponse() {
        return Response
                .status(Response.Status.NOT_FOUND)
                .build();
    }
    // Response 500(Internal Server Error)
    public static Response buildServerError(String message) {
        return Response
                .status(Response.Status.INTERNAL_SERVER_ERROR)
                .entity(message)
                .type(MediaType.TEXT_PLAIN)
                .build();
    }
}
