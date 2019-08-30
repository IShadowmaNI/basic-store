package springcarstore.basicstore.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "model", schema = "carstore")
public class Model {

    @Id
    @Column(name = "ModelID", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Integer modelId;

    @Column(name = "ModelName")
    private String modelName;

    @ManyToOne
    @JoinColumn(name="ManufacturerID")
    private Manufacturer manufacturer;

    @OneToOne(mappedBy = "model")
    private Car car;

    public Model() {}

    public int getModelId() {
        return modelId;
    }
    public String getModelName() {
        return modelName;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public Model(String modelName, Manufacturer manufacturer) {
        this.modelName = modelName;
        this.manufacturer = manufacturer;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Model{ModelID=" + modelId + ", ModelName=" + modelName + "ManufacturerName="
                + manufacturer.getManufacturerName() + "}";
    }
}
