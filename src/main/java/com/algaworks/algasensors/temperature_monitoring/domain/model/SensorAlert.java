package com.algaworks.algasensors.temperature_monitoring.domain.model;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SensorAlert {
    @Id
    @AttributeOverride(name = "value",
            column = @Column(name = "id", columnDefinition = "bigint"))
    private SensorId id;
    private Double maxTemperature;
    private Double minTemperature;
}
