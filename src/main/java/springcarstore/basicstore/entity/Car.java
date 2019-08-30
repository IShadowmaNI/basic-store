package springcarstore.basicstore.entity;

import javax.persistence.*;

@Entity
@Table(name = "car", schema = "carstore")
public class Car {

    @Id
    @Column(name = "CarID", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private Integer carId;

    @Column(name = "CarName")
    private String carName;

    @OneToOne
    @JoinColumn(name = "ModelID", referencedColumnName = "ModelID", nullable = false)
    private Model model;

    public Car() {}

    public Model getModel() {
        return model;
    }

    public String getCarName() {
        return carName;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "CarID=" + carId + ", CarName=" + carName + ", ManufacturerName= "
                + model.getManufacturer().getManufacturerName() + ", ModelName="
                + model.getModelName();
    }
}
