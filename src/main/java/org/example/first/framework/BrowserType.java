package org.example.first.framework;

import org.apache.commons.lang.StringUtils;
import java.util.HashMap;
import java.util.Map;

public enum BrowserType {
    FIREFOX,
    EDGE,
    GC;


    private static Map<String, BrowserType> browsersMap = new HashMap<String, BrowserType>();

    static {
        browsersMap.put("firefox", BrowserType.FIREFOX);
        browsersMap.put("ie", BrowserType.EDGE);
        browsersMap.put("gc", BrowserType.GC);
    }

    public static BrowserType Browser(String name) {
        BrowserType browserType = browsersMap.get(name.toLowerCase().trim());
        if (browserType == null) {
            throw new UnknownBrowserException("Unknown browser [" + name + "]. Use one of following: "
                    + StringUtils.join(browsersMap.keySet().toArray(), ", "));
        }
        return browserType;
    }
}
