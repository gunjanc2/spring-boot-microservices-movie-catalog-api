package com.gunnjanc2.movie_catalog_service.resources;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gunnjanc2.movie_catalog_service.models.CatalogItem;

@RestController
@RequestMapping("/catalog")
public class CatalogResource {
	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalogItems(@PathVariable("userId") String userId){
		return Collections.singletonList(
				new CatalogItem("TestName", "TestDesc", 4)
				);
	}

}
