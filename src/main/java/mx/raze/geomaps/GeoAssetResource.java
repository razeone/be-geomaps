package mx.raze.geomaps;

import javax.ws.rs.GET;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.quarkus.panache.common.Sort;
import io.smallrye.mutiny.Uni;
import mx.raze.geomaps.models.GeoAsset;

import java.util.List;

@Path("/assets")
@ApplicationScoped
public class GeoAssetResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<List<GeoAsset>> get() {
        return GeoAsset.listAll(Sort.by("name"));
    }
}