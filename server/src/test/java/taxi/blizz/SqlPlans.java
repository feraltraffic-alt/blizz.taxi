package taxi.blizz;

import java.util.LinkedHashSet;
import java.util.Set;
import tools.jackson.databind.JsonNode;

/** Exact index names from PostgreSQL's nested JSON plan, including init/subplans. */
public final class SqlPlans {
    private SqlPlans() {
    }
    public static Set<String> indexNames(JsonNode plan) {
        Set<String> names=new LinkedHashSet<>();
        if(plan.has("Index Name"))names.add(plan.get("Index Name").asText());
        JsonNode children=plan.get("Plans");
        if(children!=null)for(JsonNode child:children)names.addAll(indexNames(child));
        return names;
    }
}
