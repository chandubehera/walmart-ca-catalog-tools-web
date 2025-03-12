package ca.catalog.tools.web.dto;

import lombok.Data;

import java.util.Map;

@Data
public class AttributeUpdateRequest {
    private String sku;
    private Map<String, String> updatedAttributes;
}
