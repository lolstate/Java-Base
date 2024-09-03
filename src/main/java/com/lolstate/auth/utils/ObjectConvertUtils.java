package com.lolstate.auth.utils;

import java.util.function.Supplier;
import java.util.*;
import java.util.stream.Collectors;

public class ObjectConvertUtils {
    public static <T> T convertNullSafe(Supplier<T> supplier) {
        try {
            return supplier.get();
        } catch (NullPointerException n) {
            return null;
        }
    }

    public static String convertWithStream(Map<String, String> map) {
        String mapAsString = map.keySet().stream()
                .map(key -> key + "=" + map.get(key))
                .collect(Collectors.joining(", ", "{", "}"));
        return mapAsString;
    }
}
