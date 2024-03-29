package ta_bluespurs.domain;

import com.google.common.collect.ImmutableMap;

import java.util.HashMap;
import java.util.Map;

public enum Location {
    WALLMART("Walmart", "http", "api.walmartlabs.com", "/v1/search", "query",
            ImmutableMap.of("apiKey", "rm25tyum3p9jm9x9x7zxshfa",
                            "lsPublisherId", "false",
                            "sort", "price",
                            "order", "asc")),
    BestBuy("BestBuy", "http", "api.walmartlabs.com", "/v1/search", "query",
            ImmutableMap.of("apiKey", "rm25tyum3p9jm9x9x7zxshfa",
                    "lsPublisherId", "false",
                    "sort", "price",
                    "order", "asc"));

    private final String name;
    private final String scheme;
    private final String host;
    private final String path;
    private final String searchByNameParamName;
    private final Map<String, String> parameters;

    Location(String name, String scheme, String host, String path, String searchByNameParamName, Map<String, String> parameters) {
        this.name = name;
        this.scheme = scheme;
        this.host = host;
        this.path = path;
        this.searchByNameParamName = searchByNameParamName;
        this.parameters = parameters;
    }

    public String getName() {
        return name;
    }

    public String getScheme() {
        return scheme;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public String getSearchByNameParamName() {
        return searchByNameParamName;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

}
