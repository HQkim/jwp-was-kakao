package model;

import java.util.Arrays;

public enum HttpMethod {

    GET, POST;

    public static HttpMethod from(String method) throws IllegalStateException {
        return Arrays.stream(HttpMethod.values())
                .filter(httpMethod -> httpMethod.name().equalsIgnoreCase(method))
                .findAny().orElseThrow(() -> new IllegalStateException("해당하는 HTTP 메서드를 찾을 수 없습니다."));
    }

}