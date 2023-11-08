package com.alibou.keycloak;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/catalog")
public class CatalogController {

    @GetMapping
    public List<CatalogItem> getCatalogItems() {
        // Create a list of CatalogItem objects and populate them with your data
        List<CatalogItem> catalogItems = new ArrayList<>();

        // Add the catalog items to the list (you can load them from a database or any other source)
        // Sample data for one item:
        CatalogItem item1 = new CatalogItem();
        item1.setId("40cc339a-66d3-4fd2-88e6-c389c798b9ba");
        item1.setCreatedAt("2023-11-01T11:05:08.201Z");
        item1.setUpdatedAt("2023-11-01T11:05:08.201Z");
        item1.setName("My SQL Sample Catalog 1");
        item1.setDescription("Description");

        Source source1 = new Source();
        source1.setId("eabbcf8b-bb86-47ee-b67e-bce137654f5a");
        source1.setCreatedAt("2023-11-01T10:43:00.911Z");
        source1.setUpdatedAt("2023-11-01T10:43:00.911Z");
        source1.setName("My SQL");
        source1.setDescription("Description");

        item1.setSource(source1);

        catalogItems.add(item1);

        // Add more items as needed

        return catalogItems;
    }

}
