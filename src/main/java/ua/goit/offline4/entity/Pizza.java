package ua.goit.offline4.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Pizza.
 *
 * @author Andrey Minov
 * @since 2016.12
 */
@Entity
@Table(name = "pizza", schema = "pizzeria")
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private BigDecimal prize;
  //  @OneToMany(mappedBy = "pizza", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    //private List<PizzaComponents> components;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrize() {
        return prize;
    }

    public void setPrize(BigDecimal prize) {
        this.prize = prize;
    }

   // public List<PizzaComponents> getComponents() {
       // return components;
   // }

   // public void setComponents(List<PizzaComponents> components) {
      //  this.components = components;
   // }

    @Override
    public String toString() {
        return "Pizza{" + "id=" + id + ", name='" + name + '\'' + ", prize=" + prize + ", components=" + '}';
    }
}
