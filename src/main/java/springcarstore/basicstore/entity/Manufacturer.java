package springcarstore.basicstore.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "manufacturer", schema = "carstore", catalog = "")
public class Manufacturer {

    @Id
    @Column(name = "ManufacturerID", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private Integer manufacturerId;

    @Basic
    @Column(name = "ManufacturerName")
    private String manufacturerName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "manufacturer")
    private List<Model> modelList;

    public Manufacturer(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public Manufacturer() {}

    public int getManufacturerId() {
        return manufacturerId;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public List<Model> getModelList() {
        return modelList;
    }

    public void setManufacturerId(int manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public void setModelList(List<Model> modelList) {
        this.modelList = modelList;
    }

    @Override
    public String toString() {
        return "Manufacturer{ManufacturerID=" + manufacturerId + ", ManufacturerName=" + manufacturerName + "}";
    }
}
