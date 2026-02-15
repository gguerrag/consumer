package cl.tuorg.consumer.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "HIST_UBICACIONES")
public class HistUbicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="VEHICULO_ID")
    private String vehiculoId;

    @Column(name="LAT")
    private Double lat;

    @Column(name="LNG")
    private Double lng;

    @Column(name="FECHA_EVENTO")
    private LocalDateTime fechaEvento;

    public Long getId() { return id; }

    public String getVehiculoId() { return vehiculoId; }
    public void setVehiculoId(String vehiculoId) { this.vehiculoId = vehiculoId; }

    public Double getLat() { return lat; }
    public void setLat(Double lat) { this.lat = lat; }

    public Double getLng() { return lng; }
    public void setLng(Double lng) { this.lng = lng; }

    public LocalDateTime getFechaEvento() { return fechaEvento; }
    public void setFechaEvento(LocalDateTime fechaEvento) { this.fechaEvento = fechaEvento; }
}
