package com.heartwoodlabs.esame.rs;

import com.heartwoodlabs.esame.business.InvalidDataException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class InvalidDataExceptionMapper  implements ExceptionMapper<InvalidDataException> {
    @Override
    public Response toResponse(InvalidDataException exception) {
        return Utility.buildBadRequestResponse(exception.getMessage());
    }
}
