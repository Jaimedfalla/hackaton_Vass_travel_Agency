package com.celulac.advertising.application.dto.response.common;

import com.celulac.advertising.application.dto.response.common.Response;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SuccessResponse<T> extends Response {

    private T data;
}

