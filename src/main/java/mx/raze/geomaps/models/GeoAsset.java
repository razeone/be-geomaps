package mx.raze.geomaps.models;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

@Entity
@Cacheable
public class GeoAsset extends PanacheEntity {
    
    @Column(length= 40, unique = true)
    public String name;
    
}
