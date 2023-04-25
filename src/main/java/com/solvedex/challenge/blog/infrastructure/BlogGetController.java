package com.solvedex.challenge.blog.infrastructure;

import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET})
public final class BlogGetController {

    @GetMapping("/blog")
    public List<HashMap<String, String>> index(
            @RequestParam HashMap<String, Serializable> params){
        return null;
    }


    private List<HashMap<String, String>> parseFilters(HashMap<String, Serializable> params){
        int maxParams = params.size();
        List<HashMap<String,String>> filters = new ArrayList<>();
        for (int possibleFilterKey = 0; possibleFilterKey < maxParams; possibleFilterKey ++){
            if(params.containsKey(String.format("filters[%s][field]", possibleFilterKey))){
                int key = possibleFilterKey;
                filters.add(new HashMap<>(){{
                    put("field", (String) params.get(String.format("filters[%s][field]", key)));
                    put("operator", (String) params.get(String.format("filters[%s][operator]", key)));
                    put("value", (String) params.get(String.format("filters[%s][value]", key)));
                }});
            }
        }
        return filters;
    }
}
