package com.ivymon.inventory.controller.common;

import com.ivymon.inventory.constant.RtnConst;
import com.ivymon.inventory.model.InventoryException;
import com.ivymon.inventory.model.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Simon
 */
@RestControllerAdvice
@Slf4j
public class ErrorHandler {

    @ExceptionHandler(Exception.class)
    public Response<Object> exceptionHandle(Exception e) {
        log.error("Unexpected error :", e);
        return respondError();
    }

    @ExceptionHandler(InventoryException.class)
    public Response<Object> inventoryExceptionHandle(InventoryException e) {
        log.error("Custom error :", e);
        return respondError(e.getCode(), e.getMsg());
    }

    private Response<Object> respondError() {
        return respondError(RtnConst.UNKNOWN_FAIL.getRtnCode(), RtnConst.UNKNOWN_FAIL.getRtnMsg());
    }

    private Response<Object> respondError(String rtnCode, String rtnMsg) {
        Response<Object> response = new Response<>();
        response.setRtnCode(rtnCode);
        response.setRtnMsg(rtnMsg);
        return response;
    }
}
